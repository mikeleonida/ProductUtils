package com.productutils;

import java.util.List;

public class WorkingWithProduct {
	private List<Product> products;

	public WorkingWithProduct() {
		
	}
	
	public WorkingWithProduct(List<Product> products) {
		super();
		this.products = products;
	}

	public int getMaxPrice() {
		int maxPrice = Integer.MIN_VALUE;
		for (Product p : products) {
			if (p.getPrice() > maxPrice) {
				maxPrice = p.getPrice();
			}
		}
		return maxPrice;
	}

	public int getLeastPrice() {
		int minPrice = Integer.MAX_VALUE;
		for (Product p : products) {
			if (p.getPrice() < minPrice) {
				minPrice = p.getPrice();
			}
		}
		return minPrice;
	}

	public List<Product> arrangeByProductNo() {
		Product tempProduct = new Product();
		for (int i=0; i<products.size()-1; i++) {
			for (int j=i+1; j<products.size(); j++) {
				if (products.get(i).getProductNo() > products.get(j).getProductNo()) {
					//swap elements
					tempProduct = products.get(i);
					products.set(i, products.get(j));
					products.set(j, tempProduct);
				}
			}
		}
		return products;
	}

	public List<Product> arrangeByProductName() {
		Product tempProduct = new Product();
		for (int i=0; i<products.size()-1; i++) {
			for (int j=i+1; j<products.size(); j++) {
				if (products.get(i).getProductName().compareToIgnoreCase(products.get(j).getProductName()) > 0) {
					//swap elements
					tempProduct = products.get(i);
					products.set(i, products.get(j));
					products.set(j, tempProduct);
				}
			}
		}
		return products;
	}

	public List<Product> arrangeByPrice() {
		Product tempProduct = new Product();
		for (int i=0; i<products.size()-1; i++) {
			for (int j=i+1; j<products.size(); j++) {
				if (products.get(i).getPrice() > products.get(j).getPrice()) {
					//swap elements
					tempProduct = products.get(i);
					products.set(i, products.get(j));
					products.set(j, tempProduct);
				}
			}
		}
		return products;
	}
	
	@Override
	public String toString() {
		return "WorkingWithProduct [products=" + products + "]";
	}

	public void addNewProduct(Product product) {
		products.add(product);
	}
}
