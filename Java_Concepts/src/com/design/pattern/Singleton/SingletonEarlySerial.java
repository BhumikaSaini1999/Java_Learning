package com.design.pattern.Singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class EarlySerial implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static EarlySerial instance = new EarlySerial();

	private EarlySerial() {
			System.out.println("SingletonEarly constructor called");
		}

	public static EarlySerial getSingletonEarlyInstance() {
		return instance;
	}
	
	//If singleton class is Serializable, you can serialize the singleton instance. 
	//Once it is serialized, you can deserialize it but it will not return the same singleton object.
    //To resolve this issue, you need to override the readResolve() method that enforces the singleton. 
	//It is called just after the object is deserialized. It returns the singleton object.
	protected Object readResolve() {
		return instance;
	}
}

public class SingletonEarlySerial{
	public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException {
		EarlySerial obj1 = EarlySerial.getSingletonEarlyInstance();
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("sample.txt"));
		out.writeObject(obj1);
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("sample.txt"));
		EarlySerial obj2 = (EarlySerial) in.readObject();
		
		System.out.println(obj1+" "+obj2);
		System.out.println("obj1 hashcode: "+obj1.hashCode());
		System.out.println("obj2 hashcode: "+obj2.hashCode());
	}
}
