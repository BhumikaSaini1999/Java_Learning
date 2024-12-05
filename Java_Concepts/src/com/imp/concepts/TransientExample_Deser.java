package com.imp.concepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TransientExample_Deser {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("myFile.txt"));
		User u = (User) in.readObject();
		System.out.println(u.userName+" "+u.password);
		in.close();
	}

}
