package com.acharya.client;

import com.acharya.application.MMBankFactory;
import com.acharya.application.MMCurrentAcc;
import com.acharya.application.MMSavingAcc;
import com.acharya.framework.BankFactory;
import com.acharya.framework.CurrentAcc;
import com.acharya.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		BankFactory bf = new MMBankFactory();
		SavingAcc sa = new MMSavingAcc(001, "SURYA", 150, true);
		CurrentAcc ca = new MMCurrentAcc(002, "TEJAS", 1600, 10000);
		sa.withDraw(sa.getAccBal());
		sa.toString();
		ca.withDraw(ca.getCreditLimit());
		ca.toString();
		
	}
}
