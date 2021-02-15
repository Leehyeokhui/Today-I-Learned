package board.board;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MemService service = new MemServiceImpl();
//		service.addMember(new Scanner(System.in));
		BoardService service = new BoardService();
		ArrayList<Board> list = service.getAll();
		System.out.println(list);
	}

}
