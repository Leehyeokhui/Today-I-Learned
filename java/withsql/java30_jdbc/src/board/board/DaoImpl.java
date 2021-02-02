package board.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import board.conn.DbConnect;
import board.member.Member;

public class DaoImpl implements Dao {
	private DbConnect db;

	public DaoImpl() {
		db = DbConnect.getInstance();
	}

	@Override
	public void insert(Board b) {
		Connection conn = db.conn();
		String sql = "insert into board values(seq_board.nextval,?,sysdate,?,?)";
		int cnt = 0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			// 물음표 매칭
			pstmt.setString(1, b.getWriter());
			pstmt.setString(2, b.getTitle());
			pstmt.setString(3, b.getContent());

			// sql 실행
			cnt = pstmt.executeUpdate();
			System.out.println(cnt + "줄 insert 됨");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public ArrayList<Board> selectAll() {
		ArrayList<Board> list = new ArrayList<Board>();
		Connection conn = db.conn();
		String sql = "select * from board order by num";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Board b = new Board(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getString(5));
				list.add(b);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public Board selectByNum(int num) {
		Connection conn = db.conn();
		String sql = "select * from board where num = ?";
		ResultSet rs = null;
		Board b = null;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				b = new Board(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getString(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return b;

	}

	@Override
	public ArrayList<Board> selectByWriter(String writer) {
		ArrayList<Board> list = new ArrayList<Board>();
		Connection conn = db.conn();
		String sql = "select * from board where writer = ?";
		Board b = null;
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, writer);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				b = new Board(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getString(5));
				list.add(b);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;

	}

	@Override
	public ArrayList<Board> selectByTitle(String title) {
		ArrayList<Board> list = new ArrayList<Board>();
		Connection conn = db.conn();
		String sql = "select * from board where title like ?";
		Board b = null;
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + title + "%");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				b = new Board(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getString(5));
				list.add(b);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public void update(Board b) {
		Connection conn = db.conn();
		String sql = "update board set w_date = sysdate, title = ?, content = ? where num = ?";
		int cnt = 0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			// 물음표 매칭
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getContent());
			pstmt.setInt(3, b.getNum());

			// sql 실행
			cnt = pstmt.executeUpdate();
			System.out.println(cnt + "줄 update 됨");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void delete(int num) {
		Connection conn = db.conn();
		String sql = "delete board where num = ?";
		int cnt = 0;

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			// 물음표 매칭
			pstmt.setInt(1, num);

			// sql 실행
			cnt = pstmt.executeUpdate();
			System.out.println(cnt + "줄 delete 됨");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
