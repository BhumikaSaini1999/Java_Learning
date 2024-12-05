package com.imp.concepts;

import java.util.HashMap;
import java.util.Map;

final class Person{
	private final int id;
	private final String name;
	private final Map<String,String> idProofs;
	
	public Person(int id, String name, Map<String, String> idProofs) {
		this.id = id;
		this.name = name;
		
		Map<String,String> tempIds = new HashMap<>();
		for(Map.Entry<String,String> entry : idProofs.entrySet())
			tempIds.put(entry.getKey(), entry.getValue());
		this.idProofs = tempIds;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Map<String, String> getIdProofs() {//deep copy for Collection object
		Map<String,String> tempIds = new HashMap<>();
		for(Map.Entry<String,String> entry : this.idProofs.entrySet())
			tempIds.put(entry.getKey(), entry.getValue());
		return tempIds;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", idProofs=" + idProofs + "]";
	}
	
	
}
public class EmployeeImmutablity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> ids = new HashMap<>();
		ids.put("aadhar", "133");
		ids.put("pan", "dcqpb");
		
		Person p1 = new Person(101,"Bhumika",ids);
		Person p2=p1;
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1==p2);
	}

}
