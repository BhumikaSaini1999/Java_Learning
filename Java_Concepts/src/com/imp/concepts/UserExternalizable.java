package com.imp.concepts;

//https://www.geeksforgeeks.org/serialversionuid-in-java/

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Employee implements Externalizable{
	int id;
	String name;
	String city;
	
	public Employee(){//it should be public
		System.out.println("Public No-arg Employee default constructor called");
	}
	
	public Employee(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeInt(id);
		out.writeObject(name);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		id = in.readInt();
		name = (String) in.readObject();
	}
	
}


public class UserExternalizable {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Employee emp = new Employee(101,"Bhumika","Radaur");
		
		System.out.println("Serialization started");
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Employee.txt"));
		out.writeObject(emp);
		
		System.out.println("Deserialization started");
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Employee.txt"));
		Employee empl = (Employee) in.readObject();
		System.out.println(empl.id+" "+empl.name+" "+empl.city);
	}

}
