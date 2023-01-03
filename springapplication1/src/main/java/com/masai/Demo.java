package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {

	ApplicationContext ctx = 	new ClassPathXmlApplicationContext("applicationContext.xml");
	 MyBusinessClass obj =   ctx.getBean("mb",MyBusinessClass.class);
	 obj.fun1();
	}

}
