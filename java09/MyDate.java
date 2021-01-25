package com.encore.encapsulation;
/*
 * 
 *  2021_0104_Workshop에 .java로 올리기
 * Encapsulation 작성하는 패턴
 * 1. Field 앞에는 private 지정
 * 2. setter()/getter() - public 지정
 * 3. setter() 메소드 구현부 첫라인에서(필드초기화 직전) 제어문을 달아서 타당한 값만 할당되도록 한다.
 * 
 * 1. Scanner를 이용해서 month, day에 해당하는 값을 받는다.
 * 2. month에 해당하는 값은 1~12 사이의 값만 받고 나머지는 에러 메세지를 출력
 * 3. day는 1,3,5,7,10,12는 31
 *         4,6,9,11은 30
 *         2는 28 ----> if, switch문 둘 다 사용하기
 * 4. "해당하는 월이 아닙니다"
 * 	  "해당하는 날짜가 아닙니다."
 *    "오늘은 1월 4일 입니다." - 라고 출력
 *    "오늘은 0월 4일 입니다." --> X
 *    "오늘은 1월 0일 입니다." --> X
 *         
 */
public class MyDate {
	private int month; //필드 앞에는 "무조건" private 붙이기!!!!!!
	private int day;
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		//필드초기화 하기 직전에 인자값으로 받은값이 타당한지 여부를 검사하고 타당한 값만 필드에 할당
		if (month >= 1 && month <= 12) {//month가 1에서 12라면 그대로 아니면 0을 할당, ==필드 초기화
			this.month = month;
		}else {
			month = 0;
		}
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		//필드초기화 하기 직전에 인자값으로 받은값이 타당한지 여부를 검사하고 타당한 값만 필드에 할당
		switch(month) {//month값에 따라 day의 최대값이 달라지므로 switch로 나누어 설정
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			if (day >= 1 && day <= 31) {//day가 1~31이 아니면 0을 할당
				this.day = day;
			}else {
				day = 0;
			}
			break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			if (day >= 1 && day <= 30) {//day가 1~30이 아니면 0을 할당
				this.day = day;
			}else {
				day = 0;
			}
			break;
		case 2 :
			if (day >= 1 && day <= 28) {//day가 1~28이 아니면 0을 할당
				this.day = day;
			}else {
				day = 0;
			}
			break;
		default : //month를 잘못 입력할 경우 0을 할당
			day = 0;
			//return; 하면 원래 호출한 지점으로 리턴한다.
		}
	}
}
//System.exit(0); 정상종료.. (음수)면 비정상종료
//여기 else 구문에 print하는 형식으로 다시 한 번 해보기!!
//1. 스터디 참여의사가 있다/없다
//2. (옵션)어느 사람이랑 스터디 멤버를 하고 싶다.
//3. 현재 진행되는 내용 위주로 / 다음 스텝(workshop)

