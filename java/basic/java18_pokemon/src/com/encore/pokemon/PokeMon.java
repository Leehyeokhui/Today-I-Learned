package com.encore.pokemon;

public abstract class PokeMon {//상속을 목적으로 만듦. 객체 생성 안함
	protected String name;
	protected int hp;
	protected int exp;
	protected int level;
	
	public abstract void eat() ;
		//System.out.println(name + " 밥먹음");
	
	
	public abstract void sleep();
		//System.out.println(name + " 잠");
	
	
	public abstract boolean play() ;
		//System.out.println(name + " 놈");
		//return true;
	
	
	public abstract boolean exercise() ;
	//	System.out.println(name + " 운동함");
		//return true;
	
	
	public abstract void levelUpCheck() ;
		//System.out.println(name + " 레벨업 체크");
	
	
	public void printInfo() {
		System.out.println(name + " 상태 확인");
		System.out.println("hp : " + hp);
		System.out.println("exp : " + exp);
		System.out.println("level : " + level);
	}
}
