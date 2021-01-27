package exam.test;
//static 한 변수는 생성된 객체들이 모두 공유한다.
class Car{
	int serialNumber; // field
	static int counter; // static Value
	
	Car(){
		counter++;
		serialNumber = counter;
	}
}

public class StaticTest2 {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		System.out.println("field---------------");
		System.out.println(car1.serialNumber);
		System.out.println(car2.serialNumber);
		System.out.println(car3.serialNumber);
		
		System.out.println("static V");
		System.out.println(car1.counter);
		System.out.println(car2.counter);
		System.out.println(car3.counter);
		System.out.println(Car.counter); // 일반적으로는 이렇게 표현하지만 위 3줄처럼 쓸 수 도 있다.
		
		System.out.println("지금까지 생산된 총 차량의 숫자는 : " + Car.counter);
	}
}
