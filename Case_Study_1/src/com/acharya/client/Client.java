package com.acharya.client;

import com.acharya.application.GSNormalAcc;
import com.acharya.application.GSPrimeAcc;
import com.acharya.application.GSShopFactory;
import com.acharya.framework.NormalAcc;
import com.acharya.framework.PrimeAcc;
import com.acharya.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		ShopFactory sf =new GSShopFactory();
		PrimeAcc pa = new GSPrimeAcc(101, "LEKHA", 500, true);
		NormalAcc na = new GSNormalAcc(102, "NANDHINI", 500, 100);
		pa.bookProduct(pa.getCharges());
		pa.toString();
		na.bookProduct(na.getDeliveryCharge());
		na.toString();
			
	}

}


