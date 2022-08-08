package com.acharya.application;

import com.acharya.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {
	public GSNormalAcc (int accNo, String accNm, float charges, float deliveryCharge) {
		super (accNo, accNm, charges, deliveryCharge);
	}
	public void boookproduct (float deliveryCharge) {
		System.out.println("Dear Normal User, Your Product Charges:" + getCharges() + "and delivery charge is:" + deliveryCharge);
	}
	
	@Override
	public String toString() {
		return "GSNormalAcc [getDeliveryCharge()=" + getDeliveryCharge() + ", toString()=" + super.toString()
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
