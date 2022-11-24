package com.SetterInjectionMapNonString;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
private int id;
private String Name;
private Map<Answers,User>answers;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public Map<Answers, User> getAnswers() {
	return answers;
}
public void setAnswers(Map<Answers, User> answers) {
	this.answers = answers;
	 
}
public void displayInfo() {
	System.out.println("Que id :"+id);
	System.out.println("Que name :"+Name);
	System.out.println("Answers.......");
	Set<Entry<Answers,User>> set=answers.entrySet();
	Iterator<Entry<Answers,User>> itr= set.iterator();
	while(itr.hasNext()) {
		Entry<Answers,User> entry= itr.next();
		Answers ans=entry.getKey();
		User us = entry.getValue();
		System.out.println("Answer Information....");
		System.out.println(ans);
		System.out.println("posted By:");
		System.out.println(us);
	}
}
}
