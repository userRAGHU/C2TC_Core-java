package com.acharya.Interface;
interface Writeable {
	void wirtes();
}
interface Readable {
	void reads();
}
public class Student implements Readable , Writeable
{
	public void reads() {
		System.out.println("Student reads");
	}
	public void wirtes( ) {
		System.out.println("Student wirtes");
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.wirtes();
		s.reads();

	}

}
