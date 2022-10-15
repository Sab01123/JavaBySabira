package com.masai.entities;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.masai.utilities.EMUtil;

public class TotalPrice {

	public static void main(String[] args) {
	     EntityManager em = EMUtil.provideEntityManager();

	     String jpql = "select sum(price) from Product";
	    
	     TypedQuery<Long> q=em.createQuery(jpql,Long.class);
			
			long sum= q.getSingleResult();
			
			System.out.println("Total sum of all Products: "+sum);
		    em.close();
	}

}
