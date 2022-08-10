package com.cg.jpacrud.client;

import com.cg.jpacrud.entity.Student;
import com.cg.jpacrud.service.StudentService;
import com.cg.jpacrud.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		Student student = new Student();
		StudentService service = new StudentServiceImpl();
		
		student.setStudentId(100);
		student.setName("Raghu");
		service.addStudent(student);
		
		student = service.findStudentById(100);
		System.out.print("ID:"+student.getStudentId());
		System.out.println(" Name:"+student.getName());
		
		student = service.findStudentById(100);
		student.setName("Raghu Gowda");
		service.updateStudent(student);
		
		student = service.findStudentById(100);
		System.out.print("ID:"+student.getStudentId());
		System.out.println(" Name:"+student.getName());
		
		student = service.findStudentById(100);
		service.removeStudent(student);
		System.out.println("End of program");

	}

}
