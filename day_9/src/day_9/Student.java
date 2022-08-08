package day_9;

public class Student {
	int rollno;
	String name;
	static String college = "ITS";
	Student(int r, String n)
	{
		rollno = r;
		name = n;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}

	public static void main(String[] args) {
		Student s1 = new Student(11,"Arun");
		Student s2 = new Student(22,"Surya");
		s1.display();
		s2.display();

	}

}
