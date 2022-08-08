package day_8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		char gender = sc.next().charAt(0);
		long mobileNo = sc.nextInt();
		double cgpa = sc.nextDouble();
		System.out.println("Name: ");
		System.out.println("Gender: "+gender);
		System.out.println("Mobile Number: "+mobileNo);
		System.out.println("CGPA: "+cgpa);

	}

}
