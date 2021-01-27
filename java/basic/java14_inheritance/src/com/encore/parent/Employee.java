package com.encore.parent;
/*
 * Overloading
 * ::
 * 이름은 같지만(동일한 기능이다.) 처리하는 데이터를 달리하는 기법
 * ::
 * 1) 생성자 오버로딩
 * 		--> 이름은 같지만 처리하는 데이터가 다르다.
 * 	 		최소한의 기본값으로 일단 객체 생성을 가능하게 하는 기법
 * 			나머지 값들은 추후에 다시 할당되어질 수 있다.
 * 2) 메소드 오버로딩
 * ::
 * this 사용법
 * 1) 변수명 앞에 this - 필드와 로컬변수의 이름이 같을 때 이 2개를 구분하기 위해서 필드명 앞에 지정한다.
 * 2) this() 생성자 앞의 this - 하나의 클래스 안에서 또다른 생성자를 호출하는 기능
 */
import com.encore.util.MyDate;

public class Employee {
	//상수값으로 기본 salary값을 하나 설정
	public static final double BASE_SALARY = 100.0;
	
	private String name;
	private MyDate birthDate;
	private double salary;
	
	// 생성자 오버로딩은 왜 사용하는가?
	public Employee() {}
	public Employee(String name, MyDate birthDate, double salary) {
		this.name = name;
		this.birthDate = birthDate;
		this.salary = salary;
	}
	
	public Employee(String name){
		this(name, new MyDate(2000, 1, 1), BASE_SALARY); // 28라인으로 이동
	}// name 제외하고 기본값 지정
	
	public Employee(String name, MyDate birthDate) {
		this(name, birthDate, BASE_SALARY); //28라인으로
	}//name, birthDate 제외하고 기본값 지정
	
	/*public String getDetails() {
		return name + ", " + birthDate.getDate() + ", " + salary;
	}*/
	
	public String toString() {
		//주소값을 스트링으로 리턴 이 기능을 자식에게 맞게 고쳐쓴다 필드를 리턴하는 기능으로
		return name + ", " + birthDate + ", " + salary;
	}
}
