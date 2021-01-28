package com.encore.inter3;

interface Add{
		int add(int a, int b);
}

interface Sub{
	int sub(int a, int b);
}

interface Calc extends Add, Sub{ //인터페이스가 인터페이스 상속받는 키워드는 extends
	int mul(int a, int b);
}

class CalcImpl implements Calc{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}
	
}

public class InterTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcImpl c = new CalcImpl();
		System.out.println(c.add(1, 2));
		System.out.println(c.sub(1, 2));
		System.out.println(c.mul(1, 2));
		
	}

}
