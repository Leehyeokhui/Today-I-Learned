package board.member;

// db작업만 함
public interface Dao {
	// 회원가입 기능에 필요 service에서 id,pwd,name,email을 Member객체에 담아서 insert() 호출 => db에 저장하기위해
	void insert(Member m);

	// service의 login, 내정보확인
	Member select(String id);

	// service의 내 정보 수정 
	void update(String id, String new_pwd);

	// service의 탈퇴
	void delete(String id);
}
