package com.masai.useCases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.masai.entities.Product;
import com.masai.utilities.EMUtil;

public class NameAndQuntity {

	public static void main(String[] args) {

     EntityManager	em = EMUtil.provideEntityManager();
     Query q =  em.createNamedQuery("pro.getnameAndquantity");
     
//     List<Product> list = q.getResultList();
//     list.forEach(Details->System.out.println(Details));
     List<Object[]> result = q.getResultList();
     for(Object[] obj:result) {
    	 String name = (String)obj[0];
    	 Integer qun = (Integer)obj[1];
    	 
    	 System.out.println("Product Name is "+name);
    	 System.out.println("Product Quntity is "+qun);
    	 System.out.println("-------------------------------");
     }
     
     em.close();
	}

}
