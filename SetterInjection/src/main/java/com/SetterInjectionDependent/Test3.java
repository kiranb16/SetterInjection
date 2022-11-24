package com.SetterInjectionDependent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SetterInjection2.Student;

public class Test3 {
	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("config3.xml");
		     Employee em=(Employee) context.getBean("obj");
		     em.displayInfo();
	}

}
