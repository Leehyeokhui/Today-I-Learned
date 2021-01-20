package com.encore.self2test;

import com.encore.self.MyDate;
import com.encore.self2.Customer;
import com.encore.self2.Product;

public class StoreMarketTest {

	public static void main(String[] args) {
		Customer lee = new Customer("Lee","서울시","갤럭시 s7");
		
		Product phone = new Product("갤럭시 s10","삼성",1100000,new MyDate(2020,10,17));
		
		lee.setProduct(phone);
		
		Product leephone = lee.getProduct();
		
		System.out.println("lee의 정보입니다.");
		System.out.println(lee.getCustomerInfo());
		
		System.out.println("\nlee가 구입한 상품의 정보입니다.");
		System.out.println(leephone.getProductInfo());
		
		System.out.println("\n구입한 상품의 할인가격입니다.");
		lee.getCustomersProductInfo();	
	}
}
