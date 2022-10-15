package com.masai.utilities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {

	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("productUnit");

	public static EntityManager provideEntityManager() {
		return emf.createEntityManager();
	}
}
