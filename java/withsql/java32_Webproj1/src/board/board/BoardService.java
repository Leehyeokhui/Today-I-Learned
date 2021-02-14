package board.board;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import resources.boardFactory;


public class BoardService {
	
	private SqlSessionFactory sqlSessionFactory;
	
	public BoardService() {
		sqlSessionFactory = boardFactory.getSqlSessionFactory();
	}
	
	public void addBoard(Board b){
		SqlSession session = sqlSessionFactory.openSession(); //session open
		BoardMapper mapper = (BoardMapper) session.getMapper(BoardMapper.class); //session을 통해 맵퍼 객체 획득
		mapper.insert(b);
		session.commit();
		session.close();
	}
	
	public ArrayList<Board> getAll(){
		SqlSession session = sqlSessionFactory.openSession();
		BoardMapper mapper = (BoardMapper) session.getMapper(BoardMapper.class);
		ArrayList<Board> list = mapper.selectAll();
		session.close();
		return list;
	}
	
	public Board getByNum(int num){
		SqlSession session = sqlSessionFactory.openSession();
		BoardMapper mapper = (BoardMapper) session.getMapper(BoardMapper.class);
		Board b = mapper.selectByNum(num);
		session.close();
		return b;
	}
	
	public ArrayList<Board> getByWriter(String writer){
		SqlSession session = sqlSessionFactory.openSession();
		BoardMapper mapper = (BoardMapper) session.getMapper(BoardMapper.class);
		ArrayList<Board> list = mapper.selectByWriter(writer);
		session.close();
		return list;
	}
	
	public ArrayList<Board> getByTitle(String title){
		SqlSession session = sqlSessionFactory.openSession();
		BoardMapper mapper = (BoardMapper) session.getMapper(BoardMapper.class);
		ArrayList<Board> list = mapper.selectByTitle(title);
		session.close();
		return list;
	}
	
	public void editBoard(Board b){
		SqlSession session = sqlSessionFactory.openSession();
		BoardMapper mapper = (BoardMapper) session.getMapper(BoardMapper.class);
		mapper.update(b);
		session.commit();
		session.close();
	}
	
	public void delBoard(int num){
		SqlSession session = sqlSessionFactory.openSession();
		BoardMapper mapper = (BoardMapper) session.getMapper(BoardMapper.class);
		mapper.delete(num);
		session.commit();
		session.close();
	}
}

