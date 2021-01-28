package com.encore.inter3;
interface InterA{
	default void init() {//상속받는 클래스들에서 다르게 구현할 필요가 없는 메소드는 default를 붙여 interface에서 구현한다.
		System.out.println("이 인터페이스를 상속받는 클래스들에게 기본적으로 제공하는 메소드");
	}
	
	/*
	 * jdk9버전 이상
	 * private void do_something_inner(){ //상속받은 클래스 내부에서만 사용할 메소드는 private으로 정의
	 * 	System.out.println("Inner job");
	 * }
	 */
	
	void do_something();
	
	static void static_method() {//인터페이스를 상속받는 객체가 생성되기 전에도 사용이 가능
		System.out.println("static method");
	}
}

class classA implements InterA{

	@Override
	public void do_something() {
		// TODO Auto-generated method stub
		System.out.println("classA의 do_something");
		//do_something_inner();
	}
	
}

class classB implements InterA{

	@Override
	public void do_something() {
		// TODO Auto-generated method stub
		System.out.println("classB의 do_something");
		//do_something_inner();
	}
	
}

public class InterDefaultTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classA a = new classA();
		a.init();
		a.do_something();
		
		classB b = new classB();
		b.init();
		b.do_something();
		
		InterA.static_method();//인터페이스 자체에서 기능 제공, 확장 불가능
		
		
		
	}
}
