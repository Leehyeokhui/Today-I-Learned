package exam.test;
/*
 * 싱글톤
 * ::
 * 하나의 클래스로부터 오직 단 하나의 객체만 생성되도록 작성하는 코드 패턴
 * ::
 * 작성방법
 * 1. 클래스 안에서 일단 하나의 객체는 생성해놓는다. -- private static으로 지정해서 생성
 * 2. 다른 클래스에서는 객체생성을 못하도록 막아놓는다. -- private 생성자()
 * 3. 하나 만들어 놓은 객체를 여기저기서 가져도 쓰도록 public 한 기능을 만든다. -- public static
 */
class Service{ // SingleTone pattern 자주 가져다 쓰자
	private static Service service = new Service();
	private Service() {
		System.out.println("Service Instance Creating...Using SingleTone...");
	}
	public static Service getInstance() { // 미리 메모리에 올려놓을 수 있도록 static을 꼭 쓰자
		return service;
	}
}

public class StaticSingleToneTest3 {

	public static void main(String[] args) {
		//Service s1 = new Service();
		//만들어 놓은 것을 받아서 사용하는 방법 밖에는 없다...
		
		Service service1 = Service.getInstance();
		Service service2 = Service.getInstance();
		Service service3 = Service.getInstance();
		
		System.out.println(service1);
		System.out.println(service2);
		System.out.println(service3);
		
		
		
		
	}

}
