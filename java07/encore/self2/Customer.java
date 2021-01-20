package com.encore.self2;

import java.text.NumberFormat;

public class Customer {
	public String name;
	public String address;
	public String phone;
	public Product product;
	
	public Customer(String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public String getCustomerInfo() {
		return "성명 : " + name + ", 주소 : " + address + ", 휴대폰 : " + phone;
	}
	
	public void getCustomersProductInfo() {
		System.out.println(NumberFormat.getInstance().format(product.getSalePriceInfo())+"원");
	}
}
