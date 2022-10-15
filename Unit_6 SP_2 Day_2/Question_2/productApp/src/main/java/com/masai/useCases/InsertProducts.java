package com.masai.useCases;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.masai.entities.Product;
import com.masai.utilities.EMUtil;

public class InsertProducts {

	public static void main(String[] args) {

      
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Product Name");
     String proName = sc.next();
     System.out.println("Enter Product Price");
     int proPrice = sc.nextInt();
     System.out.println("Enter Product quntity");
     int proQ = sc.nextInt();
    
     EntityManager em = EMUtil.provideEntityManager();
     Product pro = new Product();
     pro.setProductName(proName);
     pro.setPrice(proPrice);
     pro.setQuantity(proQ);
     em.getTransaction().begin();
     em.persist(pro);
     em.getTransaction().commit();
     em.close();
     System.out.println("Producted inserted");
      
	}

}
