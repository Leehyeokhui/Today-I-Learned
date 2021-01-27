package exam.test;
//Static 한 멤버는 객체생성 과정 없이 사용할 수 있다.
//Static 한 멤버는 클래스파일 로더 과정에서 이미 메모리에 올라가 있다.
//클래스명.static멤버 로 사용

class Member{
	static String name = "현빈"; // Static valuable, class valuable, 전역변수
	static int age = 22;
	int count = 1; // field, 멤버변수
	
	public static void getMember1() {//static method
		System.out.println("우/유/빛/깔/" + name);
	}
	
	public void getMember2() {//non-static method
		System.out.println("우/유/빛/깔/" + name); //error name은 메모리에 올라가있는데 getMerber2()는 메모리에 올라가있지 않다.
	}
}

public class StaticTest1 {
	
	public static void main(String[] args) {
		//static 하기 때문에 객체 생성과정 없이 바로 사용
		Member.getMember1();
		
		//non-static 하기 때문에 객세 생성 후 사용(메모리에 직접 올린 후 사용)
		Member m = new Member();
		m.getMember2();
		
		

	}

}
