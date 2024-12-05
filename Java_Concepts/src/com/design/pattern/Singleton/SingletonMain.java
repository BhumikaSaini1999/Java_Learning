package com.design.pattern.Singleton;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//member1
		TVSet tvSetForMember1 = TVSet.getTVSetInstance();
		
		//member2
	    TVSet tvSetForMember2 = TVSet.getTVSetInstance();

		System.out.println(tvSetForMember1);
		System.out.println(tvSetForMember2);
	}

}
