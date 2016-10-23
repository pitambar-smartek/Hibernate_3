package com.pitambar.dao;
public class Loan{
	private String loan_id;
    private String name;
    private float lamount;
  public String getLoan_id() {
	 return loan_id;
  }
  public void setLoan_id(String loanId) {
	 loan_id = loanId;
  }
  public String getName() {
	  return name;
  }
  public void setName(String name) {
	  this.name = name;
  }
  public float getLamount() {
	  return lamount;
  }
  public void setLamount(float lamount) {
	  this.lamount = lamount;
  }

}