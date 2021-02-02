package board.member;

import java.util.Scanner;

//회원 파트 기능 구현
public class MemServiceImpl implements MemService {
	private Dao dao;
	private static String Login_id = null; // null이면 로그아웃 상태, !null이면 로그인 상태

	public MemServiceImpl() {
		dao = new DaoImpl();
	}

	public static String getLogin_id() {
		return Login_id;
	}

	@Override
	public void addMember(Scanner sc) {
		System.out.println("==== 회원 가입 ====");
		// 회원 가입에 필요한 정보 입력
		String id = "";
		Member m = null;
		do { // id 중복 체크
			System.out.print("id : ");
			id = sc.next();
			m = dao.select(id);
		} while (m != null);

		System.out.print("pwd : ");
		String pwd = sc.next();
		System.out.print("name : ");
		String name = sc.next();
		System.out.print("email : ");
		String email = sc.next();

		// dao의 insert로 입력한 정보 영구저장
		dao.insert(new Member(id, pwd, name, email));
	}

	@Override
	public void login(Scanner sc) {
		System.out.println("==== 로그인 ====");
		if(loginCheck()) {
			System.out.println("로그인 중");
			return;
		}
		System.out.print("id : ");
		String id = sc.next();
		System.out.print("pwd : ");
		String pwd = sc.next();

		Member m = dao.select(id);
		if (m == null) {
			System.out.println("없는 아이디");
		} else {
			if (pwd.equals(m.getPwd())) {
				System.out.println("로그인 성공");
				Login_id = id;
			} else {
				System.out.println("password 불일치");
			}
		}
	}

	@Override
	public void logout(Scanner sc) {
		System.out.println("==== 로그아웃 ====");
		if (loginCheck()) {
			Login_id = null; //로그아웃 처리
		} else {
			System.out.println("로그인 상태가 아닙니다.");
		}
	}

	@Override
	public boolean myInfo() {
		System.out.println("==== 내 정보 확인 ====");
		if (loginCheck()) {
			Member m = dao.select(Login_id);
			System.out.println(m);
			return true;
		} else {
			System.out.println("로그인 하세요.");
			return false;
		}
	}

	@Override
	public void editInfo(Scanner sc) {
		boolean flag = myInfo();
		if(flag) {
			System.out.println("==== 내 정보 수정 ====");
			System.out.print("new pwd : ");
			String pwd = sc.next();
			dao.update(Login_id, pwd);
		}
	}

	@Override
	public void out() {
		System.out.println("==== 회원 탈퇴 ====");
		if (loginCheck()) {
			dao.delete(Login_id);
			Login_id = null; //로그아웃 처리
		} else {
			System.out.println("로그인 상태가 아닙니다.");
		}
	}

	@Override
	public boolean loginCheck() {
		if (Login_id == null) {
			return false;
		} else {
			return true;
		}
	}

}
