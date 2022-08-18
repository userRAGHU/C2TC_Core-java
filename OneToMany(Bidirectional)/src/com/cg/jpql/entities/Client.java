package com.cg.jpql.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Department department1 = new Department();
		department1.setId(10);
		department1.setName("Salse");
		
		Department department2 = new Department();
		department2.setId(11);
		department2.setName("R&E");
		
		Employee e1 = new Employee();
		e1.setName("Raju");
		e1.setSalary(2000);
		
		Employee e2 = new Employee();
		e2.setName("Surya");
		e2.setSalary(1000);
		
		em.persist(department1);
		em.persist(department2);
		
		System.out.println("Added");
		
		em.getTransaction().commit();

	}

}
