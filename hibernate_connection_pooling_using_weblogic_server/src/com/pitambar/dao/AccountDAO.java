package com.pitambar.dao;
public interface AccountDAO
{
	public abstract void storeAccount(Account acc);
	public abstract boolean deleteAccount(String ano);
	public abstract Account findAccount(String ano);
	public abstract void updateAccount(Account acc);
}