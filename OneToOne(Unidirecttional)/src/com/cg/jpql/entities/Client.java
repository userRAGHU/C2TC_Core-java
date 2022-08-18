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
		student.setName("Vikas");
		
		Address homeAddress = new Address();
		homeAddress.setStreet("gvt");
		homeAddress.setCity("Gangavathi");
		homeAddress.setState("Karnataka");
		homeAddress.setZipcode("583227");
		
		student.setAddress(homeAddress);
		System.out.println("Mapping between OneToOne table in Unidirectional is done");
		
		em.persist(student);
		em.getTransaction().commit();


	}

}
