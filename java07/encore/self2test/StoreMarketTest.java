package com.encore.self2test;

import com.encore.self.MyDate;
import com.encore.self2.Customer;
import com.encore.self2.Product;

public class StoreMarketTest {

	public static void main(String[] args) {
		Customer lee = new Customer("Lee","�����","������ s7");
		
		Product phone = new Product("������ s10","�Ｚ",1100000,new MyDate(2020,10,17));
		
		lee.setProduct(phone);
		
		Product leephone = lee.getProduct();
		
		System.out.println("lee�� �����Դϴ�.");
		System.out.println(lee.getCustomerInfo());
		
		System.out.println("\nlee�� ������ ��ǰ�� �����Դϴ�.");
		System.out.println(leephone.getProductInfo());
		
		System.out.println("\n������ ��ǰ�� ���ΰ����Դϴ�.");
		lee.getCustomersProductInfo();	
	}
}
