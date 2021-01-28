package com.encore.inter2;
//service -> 비즈니스 로직 제공 클래스(기능 제공)
public class Service {
	private Dao dao; //조립이 가능하게 하려면 인터페이스 타입으로 정의

	//의존성 주입
	public Service(Dao dao) {//업캐스팅 파라미터
		this.dao = dao;
	}
	
	public void setDao(Dao dao) {
		this.dao = dao;
	}

	public void add() {
		dao.insert();
	}
	
	public void get() {
		dao.select();
	}
	
	public void edit() {
		dao.update();
	}
	
	public void del() {
		dao.delete();
	}
	
}
