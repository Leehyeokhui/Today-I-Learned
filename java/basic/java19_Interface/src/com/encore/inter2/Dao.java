package com.encore.inter2;

//인터페이스 : 상수와 추상메소드로만 구성된 완전 추상 클래스
//JDBC(java databases connectivity)
//인터페이스로 만든 이유 -> 다른 코드와 연결하는 면 역할
public interface Dao {//database access object. db담당 클래스
	void insert();
	void select();
	void update();
	void delete();
}
