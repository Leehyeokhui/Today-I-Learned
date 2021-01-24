package operator.test;
//자바에서 사용하는 기본적인 연산자를 알아보자.
public class OperatorTest1 {

	public static void main(String[] args) {
		Operator op1 = new Operator();// 객체생성, Operator의 구성요소가 메모리에 올라간다.
		Operator op2 = new Operator();// method를 쓰기위해 == 호출하기 위해
		
		System.out.println(op1);
		System.out.println(op2);
		System.out.println(op1 == op2);
		op1 = op2; // 주소값이 op2로 같아짐
		System.out.println(op1 == op2);
		
		//Short Circuit
		System.out.println(op1.test1() || op1.test2()); // 앞이 True면 무조건 true(뒤는 건너뛴다.)
		System.out.println(op1.test2() && op2.test1()); // 앞이 false면 무조건 false(뒤는 건너뛴다.)
		
		//local Variable 선언과 초기화
		int i = 5; // = 할당, assign 오른쪽 값을 왼쪽에 할당
		int j = 3;
		
		System.out.println(i == j); // == 같다.
		System.out.println(i != j); // != 다르다.
		System.out.println("연산자 % : " + i % j );// % 나머지
		
		boolean flag = false;
		System.out.println(flag);
		System.out.println(!flag); // !variable 아니다. 
		
		int k = 10;
		System.out.println(k++); // 변수 뒤++ 다음 번에 1을 추가한다. --도 마찬가지
		System.out.println(k);
		
		int m = 10;
		System.out.println(++m); // ++변수 앞 1을 먼저 증가시킨다. --도 마찬가지
		System.out.println(m);
	}

}

//클래스를 여러가지 만들 수 있지만 파일 명은 main method를 가지고 있는 클래스 명으로 저장한다.
//파일명을 가진 클래스만 public을 가지며 다른 클래스가 public을 가지면 에러남.
class Operator {
	public boolean test1() {
		System.out.println("test1() calling....");
		return true;
	}
	
	public boolean test2() {
		System.out.println("test2() calling....");
		return false;
	}
	
}




