package com.imp.concepts;

import java.util.ArrayList;
import java.util.List;

class Product implements Cloneable {
	int pId;
	String pName;
	double pCost;
	List<String> features;

	public Product(int pId, String pName, double pCost, List<String> features) {
		this.pId = pId;
		this.pName = pName;
		this.pCost = pCost;
		this.features = features;
	}

//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// Shallow copy
//		return super.clone();
//	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pCost=" + pCost + ", features=" + features + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		List<String> features = new ArrayList<>();
		features.add("Feature1");
		features.add("Feature2");

		Product p1 = new Product(101, "ABC", 200, features);
		Product p2 = (Product) p1.clone();

		// Modifying the list in the cloned object
		p2.features.add("Feature3");

		System.out.println("Product 1: " + p1);
		System.out.println("Product 2: " + p2);
	}
}

