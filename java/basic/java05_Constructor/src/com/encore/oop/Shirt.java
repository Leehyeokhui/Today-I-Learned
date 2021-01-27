package com.encore.oop;
//Shirt�� ������ ��� �ִ� Ŭ����
public class Shirt {
	//1. �ʵ� ����
	public String maker;
	public boolean longSleeved;
	public char color;
	public float price; // �Ǽ����� double�� �����ϴ� ���� ����.
	
	//2. �� ����
	public void setShirt(String maker, boolean longSleeved, char color, float price) {
		//�ʵ� �ʱ�ȭ -> �ʱ�ȭ��? �ʵ忡 ���� �����ϴ� �� �ʱ�ȭ
		this.maker = maker;
		this.longSleeved = longSleeved;
		this.color = color;
		this.price = price;
	}
	
	//3. �� �޾ƿ�
	//String + nonStirng �� concat ==> Stringȭ �ȴ�.
	public String getShirt() {
		return maker + " " + longSleeved + "," + color + "," + price; // getShirt()�� calling
	}
	
	//3-1
	public void printShirtInfo() {
		System.out.println(maker + " " + longSleeved + "," + color + "," + price);
	}
}
