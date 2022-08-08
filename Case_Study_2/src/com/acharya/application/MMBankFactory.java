package com.acharya.application;

import com.acharya.framework.BankFactory;
import com.acharya.framework.CurrentAcc;
import com.acharya.framework.SavingAcc;

public class MMBankFactory extends BankFactory {

	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		MMSavingAcc mmsaving = new MMSavingAcc (accNo, accNm, accBal, isSalaried);
		return mmsaving;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc mmcurrent = new MMCurrentAcc (accNo, accNm, accBal, creditLimit);
		return mmcurrent;
	}
	
}
