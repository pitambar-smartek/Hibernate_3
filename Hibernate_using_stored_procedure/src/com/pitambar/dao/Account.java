package com.pitambar.dao;

public class Account {
	private String accountNo;
	private String name;
	private float balance;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public float getBalance() {
		return balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
}