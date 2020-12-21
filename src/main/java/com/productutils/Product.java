package com.productutils;

public class Product {
	private int productNo;
	private String productName;
	private int price;
	
	public Product() {
		
	}
	
	public Product(int productNo, String productName, int price) {
		super();
		this.productNo = productNo;
		this.productName = productName;
		this.price = price;
	}
	public int getProductNo() {
		return productNo;
	}
	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "\nProduct [productNo=" + productNo + ", productName=" + productName + ", price=" + price + "]";
	}
	
	
}
