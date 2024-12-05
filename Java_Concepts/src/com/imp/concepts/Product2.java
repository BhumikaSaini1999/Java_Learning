package com.imp.concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.javatpoint.com/shallow-copy-vs-deep-copy-in-java -> important cases covered here
//1)copying a string can neither be termed as the deep nor as the shallow copy. 
//In fact, there is no difference between deep and shallow copy when we are dealing with strings in Java.

//2)Unlike strings, the primitive data types are not objects. 
//However, similar to strings, there is no concept of deep or shallow copy in the primitive data types.

//3)the concept of deep or shallow copying applies mainly to objects that hold references to other objects. 
//Since primitives don't hold references but actual values, copying them is straightforward and doesn't require deep copying logic.
//Example:
//int x = 9;  
//int y = x; 
//y=10;
//x=9 , y=10->y is not changing x value

public class Product2 implements Cloneable {
	int pId;
	String pName;
	double pCost;
	List<String> features;


	public Product2(int pId, String pName, double pCost, List<String> features) {
		this.pId = pId;
		this.pName = pName;
		this.pCost = pCost;
		this.features = features;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pCost=" + pCost + ", features=" + features + "]";
	}
	
//	@Override   //it actually overriden to perform the deep copy
//	protected Object clone() throws CloneNotSupportedException {
//		Product clonedProduct = (Product) super.clone();
//		clonedProduct.features = new ArrayList<>(this.features);
//		return clonedProduct;
//	}

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		List<String> features = new ArrayList<>();
		features.add("feature1");
		features.add("feature2");
		features.add("feature3");
		
		Product2 p1 = new Product2(101, "ABC", 200, features);
		Product2 p2 = (Product2) p1.clone();
		p2.features.add("feature4");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.features.hashCode()+" "+p2.features.hashCode());

	}
}
