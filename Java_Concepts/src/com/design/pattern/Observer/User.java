package com.design.pattern.Observer;

public class User implements ISubscriber{
	
	private int userId;
	
	public User(int userId) {
		this.userId = userId;
	}

	@Override
	public void notification(String msg) {
		// TODO Auto-generated method stub
		System.out.println("User "+userId+" received msg "+msg);
	}

}
