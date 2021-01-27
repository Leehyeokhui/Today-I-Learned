package com.encore.oop.test;

import com.encore.oop.Shirt;

/*
 * Test 클래스가 하는 일
 * 실행하는 클래스... main()이 있어야 한다.
 * 1. 메모리에 올린다. == 객체 생성(new) == Shirt의 구성요소(식구)들이 메모리에 올라간다.
 * 2. 접근.. 메소드 호출 .. 이 때 객체를 가리키는 변수(참조변수)를 통해서 작업을 진행한다. 
 */
public class ShirtTest1 {
	public static void main(String[] args) {
		//1. Shirt의 식구를 메모리에 올린다. == Shirt의 객체 생성
		Shirt shirt = new Shirt();
		
		//2. 사용(접근,호출)
		shirt.setShirt("나이키", true, 'W', 23.7f);
		
		System.out.println("======== Shirt Information =======");
		
		System.out.println(shirt.getShirt());
		shirt.printShirtInfo();
	}
}
