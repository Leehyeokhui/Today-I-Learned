package com.encore.self.test;

import com.encore.self.Programmer;

public class ProgrammerTest {

	public static void main(String[] args) {
		// 1. 객체 생성
		Programmer p1 = new Programmer();
		Programmer p2 = new Programmer();
		
		// 2. 값 할당
		p1.setScoreInfo("이혁희", "데이터마이닝", 91, 94.3, 'A');
		p2.setScoreInfo("이혁희", "인공지능", 87, 94.3, 'A');
		
		// 3. method 호출
		p1.getScoreInfo();
		p2.getScoreInfo();

	}

}
