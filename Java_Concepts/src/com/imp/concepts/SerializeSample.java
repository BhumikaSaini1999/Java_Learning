package com.imp.concepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal {
	int i=10;
	
	Animal(){
		System.out.println("Animal default Constructor called");
	}
	
	Animal(int i){
		System.out.println("Animal parametrized constructor called");
	}
}

class Dog extends Animal implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int j=20;
	
	Dog(){
		System.out.println("Dog default constructor called");
	}
}

public class SerializeSample{
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		Dog dog = new Dog();
		dog.i=100;
		dog.j=200;
		System.out.println("Dog object state now: "+dog.i+" "+dog.j);
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("animal.txt"));
		out.writeObject(dog);
		
		System.out.println("Sucessfully serialized");
		System.out.println("Now deserialization started");
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("animal.txt"));
		Dog d2 = (Dog)in.readObject();
		System.out.println(d2.i+" "+d2.j);
	}
}
