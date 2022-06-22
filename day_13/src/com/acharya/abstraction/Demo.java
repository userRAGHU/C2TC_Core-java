package com.acharya.abstraction;
abstract class Bank{
	abstract int rateOfInterest();
}
class SBI extends Bank {
	int rateOfInterest() {
		return 7;
	}
}
class HDFC extends Bank{
	int rateOfInterest() {
		return 8;
	}
}
public class Demo {
	public static void main(String[] args) {
		SBI s = new SBI();
		HDFC h = new HDFC();
		h.rateOfInterest();
		System.out.println("The rate of interest in SBI"  +  s.rateOfInterest());
		System.out.println("The rate of interest in HDFC"  +  h.rateOfInterest());

	}

}
