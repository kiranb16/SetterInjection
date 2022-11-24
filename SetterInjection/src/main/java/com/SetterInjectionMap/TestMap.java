package com.SetterInjectionMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMap {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("config6.xml");
	           Question que = (Question) context.getBean("que");
	           que.displayInfo();
}
}
