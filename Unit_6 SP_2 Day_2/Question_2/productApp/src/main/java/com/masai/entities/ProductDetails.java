package com.masai.entities;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.utilities.EMUtil;

public class ProductDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int proid = sc.nextInt();
	     EntityManager em = EMUtil.provideEntityManager();
	     String jpql = "from Product where productId=:id";
	   Query q =  em.createQuery(jpql);
	   q.setParameter("id", proid);
	   
	    Product p = (Product) q.getSingleResult();
	    System.out.println(p);
       em.close();
	}

}
