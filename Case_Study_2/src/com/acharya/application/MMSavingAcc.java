package com.acharya.application;

import com.acharya.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	private static final float MinBal = 10.0F;
	public MMSavingAcc (int accNo, String accNm, float accBal, boolean isSalaried) {
		super (accNo, accNm, accBal, isSalaried);
	}
	
	public void withDraw (float accBal) {
		System.out.println("Dear MMSavingAcc User, Your withdraw charges are: "+ accBal);
	}
	@Override
	public String toString() {
		return "MMSavingAcc [isSalaried()=" + isSalaried() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
