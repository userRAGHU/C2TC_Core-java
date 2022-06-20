package com.acharya.inheritance;
class animal1 {
	void eat()
	{
		System.out.println("eating");
	}
}
class tiger1 extends animal1 {
	void bark()
	{
		System.out.println("barking");
	}
}
class babytiger extends tiger1{
	void weep()
	{
		System.out.println("weeping");
	}
	
}


public class MultilevelInheritance {

	public static void main(String[] args) {
		babytiger bt = new babytiger();
		bt.weep();
		bt.bark();

	}

}
