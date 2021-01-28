package com.encore.inter2;

public class DaoImpl_Oracle implements Dao {

	@Override
	public void insert() {
		System.out.println("oracle insert");
	}

	@Override
	public void select() {
		System.out.println("oracle select");
	}

	@Override
	public void update() {
		System.out.println("oracle update");
	}

	@Override
	public void delete() {
		System.out.println("oracle delete");
	}

}
