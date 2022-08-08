package day_7;

public class Student {
	int rollno;
	String name;
	float fee;
	Student (int rollno, String name, float fee)
	{
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
	}
public class TestThis2 {
	public static void main(String[] args) {
		Student s1 = new Student(111,"ankit",500F);
		Student s2 = new Student(121,"sumit",500F);
		s1.display();
		s2.display();
	}	}

}
