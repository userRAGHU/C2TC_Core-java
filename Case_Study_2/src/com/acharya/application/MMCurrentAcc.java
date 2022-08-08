package com.acharya.application;

import com.acharya.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {
	public MMCurrentAcc (int accNo, String accNm, float accBal, float creditLimit) {
		super (accNo, accNm, accBal, creditLimit);
	}
	
	public void withDraw (float creditLimit) {
		System.out.println("Dear MMCurrentAcc User, Your withdraw Charges are: " + getAccBal() +  " and credit limit is:" + creditLimit);
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [getCreditLimit()=" + getCreditLimit() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}


