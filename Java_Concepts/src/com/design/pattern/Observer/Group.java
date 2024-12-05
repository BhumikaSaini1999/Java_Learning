package com.design.pattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class Group {
	private List<ISubscriber> users;
	
	Group(){
		users = new ArrayList<>();
	}
	
	public void subscribe(ISubscriber user) {
		users.add(user);
	}
	
	public void unsubscribe(ISubscriber user) {
		users.remove(user);
	}
	
	public void notification(String msg) {
		for(ISubscriber user: users)
			user.notification(msg);
	}
}
