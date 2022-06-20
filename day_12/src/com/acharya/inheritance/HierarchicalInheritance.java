package com.acharya.inheritance;
class A {
	void methodA()
	{
		System.out.println("method of Class A");
	}
}
class B extends A{
	void methodB()
	{
		System.out.println("method of Class B");
	}
}
class C extends B{
	void methodC()
	{
		System.out.println("method of Class c");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		B obj1 = new B();
		C obj2 = new C();
		obj1.methodA();
		obj2.methodC();
		

	}

}
