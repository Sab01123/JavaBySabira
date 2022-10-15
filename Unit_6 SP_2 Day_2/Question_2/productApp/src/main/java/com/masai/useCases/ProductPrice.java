package com.masai.useCases;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.entities.Product;
import com.masai.utilities.EMUtil;

public class ProductPrice {

	public static void main(String[] args) {
		Product p = new Product();
		     Scanner sc = new Scanner(System.in);
		     System.out.println("Enter Product Id");
		     int proid = sc.nextInt();
		    
		     EntityManager em = EMUtil.provideEntityManager();
		     
		 Query q =  em.createNamedQuery("pro.getproPrice");
		 q.setParameter("proId", proid);
		 
	Integer price= (Integer) q.getSingleResult();
		
		 System.out.println(price);
		 em.close();
		     
	}

}
