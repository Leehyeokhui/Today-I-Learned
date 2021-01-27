package com.encore.oop;
// 사람에 대한 정보를 저장하는 클래스
/*
 * 클래스를 구상(설계)할 때
 * 구성요소는 
 * 1) 필드 : 값이 저장되는 공간
 * 2) method
 */
public class Person {
	//필드 선언 : 데이터 타입 + 필드명;
	//필드는 위치로 판단된다. 클래스 바로 아래에 선언해야 함!
	//== 메소드 바깥에 선언한다.
	public String name;
	public int age;
	public String address;
	
	//메소드 정의 : 선언부 + 구현부
	public void getPersonInfo() {
		System.out.println(name+","+age+","+address);
	}
	
	//필드에 값을 할당하는 메소드를 추가로 정의 simple < detail
	//로컬변수와 필드의 이름이 동일할 때 필드앞에 this를 붙여서 구분해준다.
	public void setPersonInfo(String name, int age, String address) {//로컬변수
		// consistent 일관성을 지켜서 이름을 만들자.
		this.name = name;
		this.age = age;
		this.address = address;
	}
}
