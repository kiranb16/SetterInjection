package com.SetterInjection2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
   public static void main(String[] args) {
	 ApplicationContext context = new ClassPathXmlApplicationContext("config2.xml");
	     Student std=(Student) context.getBean("stud");
	     System.out.println(std);
}
}
