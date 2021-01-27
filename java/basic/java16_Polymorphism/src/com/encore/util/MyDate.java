package com.encore.util;

public class MyDate {//extends object �����Ǿ�����
	
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
	 * �������̵�
	 * ��Ӱ����� 2���� Ŭ����(�θ�, �ڽ�)���� �ۿ��ϴ� ���
	 * 1step. �θ� ���� ����� �����ް� --> ����δ� ������ ��ġ (���� Ÿ��, �޼ҵ� �̸�)
	 * 2step. �� ����� �ڽ��� ���ļ� ����ϴ� �� --> �����δ� �޶����� �Ѵ�.
	 */
	@Override // <-- ������ ���� - ����� ����
	public String toString() {
		return year + "-" + month + "-" + day;
	}
	
	//Overloading - ��Ӱ��� �ƹ��� ������� �ϳ��� Ŭ�������� �Ͼ�� �ۿ�
	public void toString(String message) {
		System.out.println(message);
	}
	
	public void toString(int grade) {
		System.out.println(grade);
	}
}
