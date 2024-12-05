package com.practice;

import java.util.Scanner;

public class BankOperation implements IBankAccountOperation{
	
	private double curAmount;
	
	public BankOperation() {
		this.curAmount = 0;
	}
	

	@Override
	public void deposit(double d) {
		// TODO Auto-generated method stub
		if(d>0)
			curAmount += d;
	}

	@Override
	public void withdraw(double d) {
		// TODO Auto-generated method stub
		if(d<=curAmount && d>0)
			curAmount-=d;
		
	}

	@Override
	public double processOperation(String message) {
		// TODO Auto-generated method stub
		String[] msgs = message.split(" ");
		
		
		for(int i=0; i<msgs.length; i++) {
			double d = 0;
			if((msgs[i].equalsIgnoreCase("deposit") || msgs[i].equalsIgnoreCase("put") || msgs[i].equalsIgnoreCase("transfer") || msgs[i].equalsIgnoreCase("invest"))) {
				d = Double.parseDouble(msgs[i+1]);
				deposit(d);
				break;
			}else if(msgs[i].equalsIgnoreCase("withdraw") || msgs[i].equalsIgnoreCase("pull")) {
				d = Double.parseDouble(msgs[i+1]);
				withdraw(d);
				break;
			}
		}
		
		return curAmount;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of requests: ");
		int n=sc.nextInt();
		
		sc.nextLine();
		
		String[] requests = new String[n];
		for(int i=0; i<n; i++) {
			requests[i] = sc.nextLine().trim();
		}
		
		IBankAccountOperation obj = new BankOperation();
		for(String req : requests) {
			System.out.println(obj.processOperation(req));
		}
		
		sc.close();
	}

}
