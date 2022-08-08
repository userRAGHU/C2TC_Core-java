package com.acharya.framework;

public abstract class SavingAcc extends BankAcc {
	private boolean isSalaried;
	private static final float MinBal = 10.0F;
	public SavingAcc (int accNo, String accNm, float charges, boolean isSalaried) {
		super(accNo, accNm, charges);
		this.isSalaried = isSalaried;
	}

	public void withDraw (float charges) {
		System.out.println("The charges of the withdraw is:" + charges);
	}
	
	public boolean isSalaried() {
		return isSalaried;
	}

	public static float getMinbal() {
		return MinBal;
	}

	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", isSalaried()=" + isSalaried() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}			     	
}
	


