package com.encore.test;

import com.encore.child.Engineer;
import com.encore.child.Manager;
import com.encore.child.Secretary;
import com.encore.util.MyDate;
/*
 * 1. 생년월일이 아니라 주소값이 출력
 * 2. Manager 정보에서 dept 정보 출력이 안된다.
 */
public class InheritanceTest {

	public static void main(String[] args) {
		Manager m1 = new Manager("James", new MyDate(1965, 2, 12), 300000.0, "IT");
		System.out.println(m1.toString());
		System.out.println(m1);
		//System.out.println(m1.getDetails()); 
		//부모 클래스의 메소드를 그대로 사용해서 dept가 출력 안됨
		
		Engineer e1 = new Engineer("Lee", new MyDate(1994, 3, 21), 250000.0, "JAVA", 500000.0);
		System.out.println(e1);
		
		Secretary s1 = new Secretary("Kim", new MyDate(1989, 5, 5), 280000.0, "Ha");
		System.out.println(s1);
		
	}
}
