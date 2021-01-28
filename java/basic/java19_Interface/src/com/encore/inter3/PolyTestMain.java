package com.encore.inter3;

class Product{
	String name;
	int price;
	int point;
}

class Tv extends Product{
	public Tv() {
		name = "tv";
		price = 1000;
		point = 100;
	}
}

class Audio extends Product{
	public Audio() {
		name = "Audio";
		price = 2000;
		point = 200;
	}
}

class Computer extends Product{
	public Computer() {
		name = "Computer";
		price = 3000;
		point = 300;
	}
}

class Buyer{
	int money = 10000;
	int point = 0;
	
	//메소드 오버로딩
	void buy(Tv tv) {
		if(money >= tv.price) {
			money -= tv.price;
			point += tv.point;
			System.out.println(tv.name + " 구매");
			System.out.println("잔액 : " + money + " 포인트 : " + point);
		}else {
			System.out.println("잔액 부족");
		}
	}
	
	void buy(Audio a) {
		if(money >= a.price) {
			money -= a.price;
			point += a.point;
			System.out.println(a.name + " 구매");
			System.out.println("잔액 : " + money + " 포인트 : " + point);
		}else {
			System.out.println("잔액 부족");
		}
	}
	
	void buy(Computer c) {
		if(money >= c.price) {
			money -= c.price;
			point += c.point;
			System.out.println(c.name + " 구매");
			System.out.println("잔액 : " + money + " 포인트 : " + point);
		}else {
			System.out.println("잔액 부족");
		}
	}
	
}

class Buyer2{
	int money = 10000;
	int point = 0;
	
	void buy(Product p) {//upcasting
		if(money >= p.price) {
			money -= p.price;
			point += p.point;
			System.out.println(p.name + " 구매");
			System.out.println("잔액 : " + money + " 포인트 : " + point);
		}else {
			System.out.println("잔액 부족");
		}
	}
}

public class PolyTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] p = {new Tv(), new Audio(), new Computer(),new Tv(), new Audio(), new Computer()};
		Buyer2 b = new Buyer2();
		for(Product ps : p) {
			b.buy(ps);
		}
	}
}
