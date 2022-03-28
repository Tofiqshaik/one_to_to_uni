package com.ty.onetoone.controller;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Address;
import com.ty.onetoone.dto.Branch;

public class TestBranch {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		Branch  branch=entityManager.find(Branch.class, 1);
		Address address= branch.getAddress();
		
		System.out.println(" Name of Branch is :"+branch.getName());
		System.out.println(" Phone_no of Branch is :"+branch.getPhone());
		System.out.println(" Address of Branch is :");
		System.out.println(" area is :"+address.getArea());
		
	}
	

}
