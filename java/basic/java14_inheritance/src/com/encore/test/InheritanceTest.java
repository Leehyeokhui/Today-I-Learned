package com.encore.test;

import com.encore.child.Engineer;
import com.encore.child.Manager;
import com.encore.child.Secretary;
import com.encore.util.MyDate;
/*
 * 1. ��������� �ƴ϶� �ּҰ��� ���
 * 2. Manager �������� dept ���� ����� �ȵȴ�.
 */
public class InheritanceTest {

	public static void main(String[] args) {
		Manager m1 = new Manager("James", new MyDate(1965, 2, 12), 300000.0, "IT");
		System.out.println(m1.toString());
		System.out.println(m1);
		//System.out.println(m1.getDetails()); 
		//�θ� Ŭ������ �޼ҵ带 �״�� ����ؼ� dept�� ��� �ȵ�
		
		Engineer e1 = new Engineer("Lee", new MyDate(1994, 3, 21), 250000.0, "JAVA", 500000.0);
		System.out.println(e1);
		
		Secretary s1 = new Secretary("Kim", new MyDate(1989, 5, 5), 280000.0, "Ha");
		System.out.println(s1);
		
	}
}
