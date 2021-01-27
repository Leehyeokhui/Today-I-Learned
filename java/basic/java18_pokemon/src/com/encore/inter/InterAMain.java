package com.encore.inter;
class ImplInterA implements InterA{

	@Override
	public void printNum() {
		// TODO Auto-generated method stub
		System.out.println(NUM);
	}
}

public class InterAMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplInterA ia = new ImplInterA();
		ia.printNum();
	}
}
