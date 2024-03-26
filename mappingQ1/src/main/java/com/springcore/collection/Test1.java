package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ApplicationContext cnt=new ClassPathXmlApplicationContext("com/springcore/collection/configuration.xml");
		     Emp emp1=(Emp) cnt.getBean("myClassBean");
		     System.out.println("the following are the course durations for the batch:");
		     System.out.println(emp1.getCourses());
	}

}
