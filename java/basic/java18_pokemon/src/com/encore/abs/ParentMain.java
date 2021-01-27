package com.encore.abs;
//추상 클래스 : 추상 메소드를 하나라도 포함한 클래스, 객체를 만들 수 없음 -> 완성을 해야 객체생성(상속 받은 클래스에서 모든 추상메소드를 구현해야 객체를 생성할 수 있음)
//추상 메소드 : 구현하지 않고 프로토타입(메소드선언)만 가진 메소드
abstract class Parent{//미완성
	//반환타입 이름 파라미터
	abstract void add(int a, int b) ; //메소드 선언, 메소드 프로토타입
	
	public void test1() {
		System.out.println("test1");
	}
}

class Child extends Parent{

	@Override
	void add(int a, int b) {//중괄호 열면 구현한 거임, 상속 받은 클래스에서 추상메소드를 구현
		int c = a+b;
		System.out.println(a + " + " + b + " = " + c);
	}
}

public class ParentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.add(12, 34);
		c.test1();
		//Parent p = new Parent();	
	}
}
