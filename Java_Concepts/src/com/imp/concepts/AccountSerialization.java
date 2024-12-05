package com.imp.concepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String userName = "bhumika";
	transient String password = "Bhumika@1999";
	transient int pin = 1234;
	
	Account(){
		System.out.println("Account default constructor called");
	}

	private void writeObject(ObjectOutputStream os) throws IOException {
		os.defaultWriteObject();

		String epwd = "1029" + password;
		int epin = pin + 4444;
		os.writeObject(epwd);
		os.writeInt(epin);
	}

	private void readObject(ObjectInputStream is) throws IOException, ClassNotFoundException {
		  is.defaultReadObject();
		  
		  String epwd = (String) is.readObject();
		  password = epwd;
		  int epin = is.readInt();
		  pin = epin;
	}
}

public class AccountSerialization {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Account a1 = new Account();
		System.out.println(a1.userName + " " + a1.password + " " + a1.pin);

		System.out.println("serialization performing");
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("account.txt"));
		out.writeObject(a1);

		System.out.println("deserialization performing");
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("account.txt"));
		Account a2 = (Account) in.readObject();
		System.out.println(a2.userName + " " + a2.password + " " + a2.pin);
	}

}
