package com.imp.concepts;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String userName;
	transient String password;
	
	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
}

public class TransientExample {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		User user = new User("bhumika","Bhumi@123");
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("myFile.txt"));
		out.writeObject(user);
		out.flush();
		out.close();
		System.out.println("SUCCESS");
	}
}


