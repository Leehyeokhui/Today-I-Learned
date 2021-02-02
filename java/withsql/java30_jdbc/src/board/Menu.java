package board;

import java.util.ArrayList;
import java.util.Scanner;

import board.board.Board;
import board.board.BoardService;
import board.board.BoardServiceImpl;
import board.member.MemService;
import board.member.MemServiceImpl;

public class Menu {
	private MemService memService;
	private BoardService boService;
	
	public Menu() {
		memService = new MemServiceImpl();
		boService = new BoardServiceImpl();
	}

	public void run(Scanner sc) {
		boolean flag = true;
		int menu = 0;
		while (flag) {
			System.out.println("1.회원관리 2.게시판 3.종료");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				mem_run(sc);
				break;
			case 2:
				if(MemServiceImpl.getLogin_id() == null) {
					System.out.println("로그인 필요");
				}else {
					board_run(sc);
				}
				break;
			case 3:
				flag = false;
				break;
			}
		}
	}

	public void mem_run(Scanner sc) {
		boolean flag = true;
		int menu = 0;
		while (flag) {
			System.out.println("1.회원가입 2.로그인 3.내 정보 확인 4.내 정보 수정 5.로그아웃 6.탈퇴 7.종료");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				memService.addMember(sc);
				break;
			case 2:
				memService.login(sc);
				break;
			case 3:
				memService.myInfo();
				break;
			case 4:
				memService.editInfo(sc);
				break;
			case 5:
				memService.logout(sc);
				break;
			case 6:
				memService.out();
				break;
			case 7:
				flag = false;
				break;
			}
		}
	}

	public void board_run(Scanner sc) {
		boolean flag = true;
		int menu = 0;
		ArrayList<Board> list = null;
		while (flag) {
			System.out.println("1.게시글 작성 2.글 목록 3.글 번호로 검색 4.작성자로 검색 5.제목으로 검색 6.게시글 수정 7.게시글 삭제 8.종료");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				boService.addBoard(sc);
				break;
			case 2:
				list = boService.getAll();
				boService.printAll(list);
				break;
			case 3:
				boService.getByNum(sc);
				break;
			case 4:
				list = boService.getByWriter(sc);
				boService.printAll(list);
				break;
			case 5:
				list = boService.getByTitle(sc);
				boService.printAll(list);
				break;
			case 6:
				boService.editBoard(sc);
				break;
			case 7:
				boService.delBoard(sc);
				break;
			case 8:
				flag = false;
				break;
			}
		}
	}

}
