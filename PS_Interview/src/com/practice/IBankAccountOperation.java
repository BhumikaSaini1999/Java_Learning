package com.practice;

public interface IBankAccountOperation {
	void deposit(double d);
	void withdraw(double d);
	double processOperation(String message);
}
