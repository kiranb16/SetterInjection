package com.SetterInjectionList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestList {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("config4.xml");
	                  Question q=(Question) context.getBean("que");
	                  q.displayInfo();
}
}
