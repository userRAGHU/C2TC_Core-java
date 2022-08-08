package com.acharya.framework;

public abstract class BankAcc {
	private int accNo;
	private String accNm;
	private float accBal; 
	
	public BankAcc (int accNo, String accNm, float accBal) {
		super ();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	public void withDraw (float charges) {
		System.out.println("Amount of Withdraw and Charges are:" + charges);	
    }
	
	public void deposite (float charges) {
		System.out.println("Depoasite Amount with Service Charges:" + charges);
    }
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public float getAccBal() {
		return accBal;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
