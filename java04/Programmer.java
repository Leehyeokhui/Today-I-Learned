package com.encore.self;

public class Programmer {
	//필드 선언  
	public String name; // 학생 이름
	public String subject; // 과목 이름
	public int middlescore; // 중간고사 점수(소수점 없음)
	public double finalscore; // 기말고사 점수(소수점 있음)
	public char score; // 학점, + 없음
	
	//method 정의
	public void setScoreInfo(String name, String subject, int middlescore, double finalscore, char score) { // assign value method
		this.name = name;
		this.subject = subject;
		this.middlescore = middlescore;
		this.finalscore = finalscore;
		this.score = score;
	}
	
	public double scoreAverage() { // 최종점수 == 중간고사와 기말고사 점수의 평균
		return (middlescore + finalscore)/2;
	}
	
	public void getScoreInfo() {
		System.out.println(name+" 학생의 "+subject+" 과목의 최종점수는 "+scoreAverage()+"이고 최종 학점은 "+ score+"입니다." );
	}
}
