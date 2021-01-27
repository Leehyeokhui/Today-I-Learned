package com.encore.encapsulation.test;

import java.util.Scanner;
import com.encore.encapsulation.MyDate;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate md = new MyDate();
		Scanner sc = new Scanner(System.in);
		String messages = "";
		
		System.out.println("월과 날짜를 입력하세요.");
		int m = sc.nextInt();
		int d = sc.nextInt();
		
		md.setMonth(m);
		md.setDay(d);
		
		int m1 = md.getMonth();
		int d1 = md.getDay();
		
		if (m1 == 0) {//month를 잘못 입력한 경우
			messages = "해당하는 월이 아닙니다.";
		}else if(m1 != 0 && d1 == 0) {//day를 잘못 입력한 경우
			messages = "해당하는 날짜가 아닙니다.";
		}else {
			messages = "오늘은 " + m1 + "월 " + d1 + "일 입니다.";
		}
		
		System.out.println(messages);
	}
}
