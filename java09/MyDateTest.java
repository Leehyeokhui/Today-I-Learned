package com.encore.encapsulation.test;

import java.util.Scanner;
import com.encore.encapsulation.MyDate;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate md = new MyDate();
		Scanner sc = new Scanner(System.in);
		String messages = "";
		
		System.out.println("���� ��¥�� �Է��ϼ���.");
		int m = sc.nextInt();
		int d = sc.nextInt();
		
		md.setMonth(m);
		md.setDay(d);
		
		int m1 = md.getMonth();
		int d1 = md.getDay();
		
		if (m1 == 0) {//month�� �߸� �Է��� ���
			messages = "�ش��ϴ� ���� �ƴմϴ�.";
		}else if(m1 != 0 && d1 == 0) {//day�� �߸� �Է��� ���
			messages = "�ش��ϴ� ��¥�� �ƴմϴ�.";
		}else {
			messages = "������ " + m1 + "�� " + d1 + "�� �Դϴ�.";
		}
		
		System.out.println(messages);
	}
}
