package com.encore.oop;
// ����� ���� ������ �����ϴ� Ŭ����
/*
 * Ŭ������ ����(����)�� ��
 * ������Ҵ� 
 * 1) �ʵ� : ���� ����Ǵ� ����
 * 2) method
 */
public class Person {
	//�ʵ� ���� : ������ Ÿ�� + �ʵ��;
	//�ʵ�� ��ġ�� �Ǵܵȴ�. Ŭ���� �ٷ� �Ʒ��� �����ؾ� ��!
	//== �޼ҵ� �ٱ��� �����Ѵ�.
	public String name;
	public int age;
	public String address;
	
	//�޼ҵ� ���� : ����� + ������
	public void getPersonInfo() {
		System.out.println(name+","+age+","+address);
	}
	
	//�ʵ忡 ���� �Ҵ��ϴ� �޼ҵ带 �߰��� ���� simple < detail
	//���ú����� �ʵ��� �̸��� ������ �� �ʵ�տ� this�� �ٿ��� �������ش�.
	public void setPersonInfo(String name, int age, String address) {//���ú���
		// consistent �ϰ����� ���Ѽ� �̸��� ������.
		this.name = name;
		this.age = age;
		this.address = address;
	}
}
