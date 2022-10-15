package com.masai.useCase;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.entities.Address;
import com.masai.entities.Customer;
import com.masai.utility.EMUtil;

public class AllDetailsOfCus {

	public static void main(String[] args) {
         EntityManager em =  EMUtil.provideEntityManager();
         
         Scanner sc = new Scanner(System.in);
         int id =0;
         try {
        	 System.out.println("enter id");
              id = sc.nextInt();
             
             
             
             String jpql = "from Customer where cid ="+id;
             
            Query q = em.createQuery(jpql);
           List<Customer> clist =  q.getResultList();
           for(Customer c: clist) {
        	   List<Address> adrs = c.getAddreses();
        	   for(Address addresses:adrs) {
        		   System.out.println(addresses);
        	   }
           }
		} catch (Exception e) {
       System.out.println("Customer with this "+id +" not found");		
}
         
        
       em.close();
	}

}
