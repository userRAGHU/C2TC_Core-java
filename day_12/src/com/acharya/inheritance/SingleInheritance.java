package com.acharya.inheritance;
class Animal {
	void eat()
	{
		System.out.println("eating");
	}
}
class Tiger extends Animal {
	void bark()
	{
		System.out.println("barking");
	}
}


public class SingleInheritance {


	public static void main(String[] args) {
		Tiger t = new Tiger();
		t.bark();
		t.eat();

	}

}
