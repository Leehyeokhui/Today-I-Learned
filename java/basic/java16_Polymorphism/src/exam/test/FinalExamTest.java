package exam.test;
/*
 * final 키워드에 대해서 알아본다.
 * final "내가 마지막 ~~~ 이야" 라는 뜻의 키워드
 * 
 * final 변수 - "내가 마지막 변수야" --> 상수를 지정
 * final 메소드 - "내가 마지막 메소드야" --> 오버라이딩 금지
 * final 클래스 - "내가 마지막 클래스야" --> 상속 금지
 */
class A{
	static final int BASE_SALARY = 800; // 값 변경 안되는지
	public final String test() {
		
		return "Overriding 금지"; //확인
	}
}

final class B{// 상속 못함 확인
	
}

/*class C extends B{ // 상속 못함 확인
}*/

class D extends A{
	//BASE_SALARY = 1000; // 값 못 바꾸는 거 확인
	/*public final String test() { // 오버라이딩 못하는 거 확인
		
		return "Overriding 금지"; //확인
	}*/
}
public class FinalExamTest {

	public static void main(String[] args) {
		D d = new D();
		//D.BASE_SALARY = 1000; // 못바꾸는 거 확인
		System.out.println("기본급 : " + d.BASE_SALARY);
		
		
		
	}

}
