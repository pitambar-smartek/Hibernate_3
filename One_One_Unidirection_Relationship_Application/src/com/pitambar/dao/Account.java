package com.pitambar.dao;
public class Account
{
	private int accountNo;
	private String name;
	private float balance;
	private AccountPlus accountPlus;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setBalance(float balance)
	{
		this.balance=balance;
	}
	public float getBalance()
	{
		return balance;
	}
	public void setAccountPlus(AccountPlus accountPlus)
	{
		this.accountPlus=accountPlus;
	}
	public AccountPlus getAccountPlus()
	{
		return accountPlus;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
}