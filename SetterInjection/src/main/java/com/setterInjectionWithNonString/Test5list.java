package com.setterInjectionWithNonString;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5list {
 public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("config5.xml");
	   Question qe=(Question) context.getBean("que");
	     qe.displayInfo();
}
}
