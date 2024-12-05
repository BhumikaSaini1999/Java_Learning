package com.design.pattern.Singleton;

import java.io.FileNotFoundException;
import java.io.IOException;

class EarlyClone implements Cloneable{
	
	private static EarlyClone instance = new EarlyClone();

	private EarlyClone() {
			System.out.println("Singleton EarlyClone constructor called");
	}

	public static EarlyClone getSingletonEarlyCloneInstance() {
		return instance;
	}
	
	@Override
    protected Object clone() throws  CloneNotSupportedException
    {
		//return super.clone();
		return instance;
    }
}

public class SingletonEarlyCloneIssue{
	public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException, CloneNotSupportedException {
		EarlyClone obj1 =  EarlyClone.getSingletonEarlyCloneInstance();
		
		EarlyClone obj2 = (EarlyClone) obj1.clone();
		System.out.println(obj1+" "+obj2);
		System.out.println(obj1.hashCode()+" "+obj2.hashCode());
	}
}
