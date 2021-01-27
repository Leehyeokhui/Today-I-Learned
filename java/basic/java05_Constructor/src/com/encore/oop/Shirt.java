package com.encore.oop;
//Shirt에 정보를 담고 있는 클래스
public class Shirt {
	//1. 필드 선언
	public String maker;
	public boolean longSleeved;
	public char color;
	public float price; // 실수형은 double로 설정하는 것이 좋다.
	
	//2. 값 주입
	public void setShirt(String maker, boolean longSleeved, char color, float price) {
		//필드 초기화 -> 초기화란? 필드에 값을 주입하는 게 초기화
		this.maker = maker;
		this.longSleeved = longSleeved;
		this.color = color;
		this.price = price;
	}
	
	//3. 값 받아옴
	//String + nonStirng 이 concat ==> String화 된다.
	public String getShirt() {
		return maker + " " + longSleeved + "," + color + "," + price; // getShirt()를 calling
	}
	
	//3-1
	public void printShirtInfo() {
		System.out.println(maker + " " + longSleeved + "," + color + "," + price);
	}
}
