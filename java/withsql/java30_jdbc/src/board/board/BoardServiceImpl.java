package board.board;

import java.util.ArrayList;
import java.util.Scanner;

import board.member.MemServiceImpl;

public class BoardServiceImpl implements BoardService {
	private Dao dao;

	public BoardServiceImpl() {
		dao = new DaoImpl();
	}

	@Override
	public void addBoard(Scanner sc) {
		System.out.println("==== 글 작성 ====");

		Board b = new Board();
		b.setWriter(MemServiceImpl.getLogin_id());

		System.out.print("title : ");
		sc.nextLine();
		String title = sc.nextLine();
		
		System.out.print("content(멈추려면 /stop) : ");
		StringBuilder st = new StringBuilder();
		
		while (true) {
			String str = sc.nextLine();
			if (str.startsWith("/stop")) {
				break;
			}
			st.append(str + "\n");
		}

		String content = st.toString();
		b.setTitle(title);
		b.setContent(content);
		dao.insert(b);
	}

	@Override
	public void printAll(ArrayList<Board> list) {
		for (Board b : list) {
			System.out.println(b);
		}
	}

	@Override
	public ArrayList<Board> getAll() {
		System.out.println("==== 글 전체목록 ====");
		ArrayList<Board> list = dao.selectAll();
		return list;
	}

	@Override
	public void getByNum(Scanner sc) {
		System.out.println("==== 글 본호로 검색 ====");
		System.out.print("검색할 글번호 : ");
		int num = sc.nextInt();
		Board b = dao.selectByNum(num);
		if (b == null) {
			System.out.println("없는 글 번호");
		} else {
			System.out.println(b);
		}
	}

	@Override
	public ArrayList<Board> getByWriter(Scanner sc) {
		System.out.println("==== 글 작성자로 검색 ====");
		System.out.print("검색할 작성자 아이디 : ");
		String writer = sc.next();
		ArrayList<Board> list = dao.selectByWriter(writer);
		return list;
	}

	@Override
	public ArrayList<Board> getByTitle(Scanner sc) {
		System.out.println("==== 글 제목으로 검색 ====");
		System.out.print("검색할 단어 : ");
		String title = sc.next();
		ArrayList<Board> list = dao.selectByTitle(title);
		return list;

	}

	public boolean checkMyArticle(int num) {
		Board b = dao.selectByNum(num);
		if (b != null && b.getWriter().equals(MemServiceImpl.getLogin_id())) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void editBoard(Scanner sc) {
		System.out.println("==== 글 수정 ====");
		System.out.print("수정할 글 번호 : ");
		int num = sc.nextInt();
		boolean flag = checkMyArticle(num);
		if (flag) {
			System.out.print("새 제목 : ");
			String title = sc.next();
			System.out.print("새 내용 : ");
			String content = sc.next();
			dao.update(new Board(num, "", null, title, content)); // quary문에서 사용하지 않는 변수는 막 넣어도 상관없다.
		} else {
			System.out.println("없는 글이거나 자기 글이 아닙니다.");
		}
	}

	@Override
	public void delBoard(Scanner sc) {
		System.out.println("==== 글 삭제 ====");
		System.out.print("삭제할 글 번호 : ");
		int num = sc.nextInt();
		boolean flag = checkMyArticle(num);
		if (flag) {
			dao.delete(num);
		} else {
			System.out.println("없는 글이거나 자기 글이 아닙니다.");
		}
	}

}
