package com.encore.self2;

import java.text.NumberFormat;

import com.encore.self.MyDate;

public class Product {
	public String brandName;
	public String company;
	public int price;
	public MyDate madedate;
	
	
	
	public Product(String brandName, String company, int price, MyDate madedate) {
		super();
		this.brandName = brandName;
		this.company = company;
		this.price = price;
		this.madedate = madedate;
	}

	public String getProductInfo() {
		return "��ǰ ���� : " + company + " " +brandName + ", ���� : " + NumberFormat.getInstance().format(price) + ", �������� : " + madedate.getMyDate();
	}
	
	public double getSalePriceInfo() {
		return price * 0.5;
	}
}
