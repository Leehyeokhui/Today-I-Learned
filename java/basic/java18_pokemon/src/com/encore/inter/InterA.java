package com.encore.inter;

//완전한 추상이기 때문에 이 자체로는 객체를 만들 수 없다.
//객체를 만들려면 상속을 받아서 모든 추상메소드를 구현해야 한다.
public interface InterA {
	int NUM = 10;
	void printNum();
}
