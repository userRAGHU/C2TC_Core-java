package com.cg.jpql.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Student student = new Student();
		student.setName("Surya");
		
		Address homeAddress = new Address();
		homeAddress.setStreet("8th Main");
		homeAddress.setCity("Bengaluru");
		homeAddress.setState("Karnataka");
		homeAddress.setZipcode("560_091");
		
		student.setAddress(homeAddress);
		System.out.println("Completed mapping between table one to one");
		
		em.persist(student);
		em.getTransaction().commit();

	}

}
