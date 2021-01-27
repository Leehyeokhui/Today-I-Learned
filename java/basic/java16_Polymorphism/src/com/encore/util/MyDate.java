package com.encore.util;

public class MyDate {//extends object 생략되어있음
	
	private int year;
	private int month;
	private int day;
	
	public MyDate(int year, int month, int day) {
		super();//object
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	/*	
	 * 오버라이딩
	 * 상속관계의 2개의 클래스(부모, 자식)에서 작용하는 기능
	 * 1step. 부모가 가진 기능을 물려받고 --> 선언부는 완전히 일치 (리턴 타입, 메소드 이름)
	 * 2step. 그 기능을 자식이 고쳐서 사용하는 것 --> 구현부는 달라져야 한다.
	 */
	@Override // <-- 지우지 말기 - 지우면 에러
	public String toString() {
		return year + "-" + month + "-" + day;
	}
	
	//Overloading - 상속과는 아무런 관계없이 하나의 클래스에서 일어나는 작용
	public void toString(String message) {
		System.out.println(message);
	}
	
	public void toString(int grade) {
		System.out.println(grade);
	}
}
