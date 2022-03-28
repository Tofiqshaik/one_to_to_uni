package com.ty.onetoone.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Inserting {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		
		Branch b = new Branch();
		b.setName("jsp");
		b.setPhone(424);
		//b.setId(10);
		
		Address a = new Address();
		a.setArea("Rajajinagar");
		a.setPin(570021);
		a.setState("Karanataka");
		
		b.setAddress(a);
		
		entityTransaction.begin();
		entityManager.persist(a);
		entityManager.persist(b);
		entityTransaction.commit();

	}

	
}
