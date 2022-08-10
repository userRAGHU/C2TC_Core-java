package com.cg.jpacrud.service;

import com.cg.jpacrud.dao.StudentDaoImpl;
import com.cg.jpacrud.dao.Studentdao;
import com.cg.jpacrud.entity.Student;

public class StudentServiceImpl implements StudentService {
	
    private Studentdao dao;
	
	public StudentServiceImpl()
	{
		dao = new StudentDaoImpl();
	}

	@Override
	public void addStudent(Student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public void updateStudent(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public void removeStudent(Student student) {
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public Student findStudentById(int id) {
		Student student = dao.getStudentById(id);
		return student;
	}

}
