package com.ty.onetoone.dto;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertPan {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		Person person = new Person();
		person.setName("shambu");
		person.setGender('m');
		person.setPhone(54321);
		Pan p = new Pan();
		p.setPanNo("BFSRS4223M");
		p.setDate(LocalDate.now());
		p.setPerson(person);
		p.setCountry("India");
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(p);
		entityTransaction.commit();
	}

}
