package com.SetterInjectionList;

import java.util.Iterator;
import java.util.List;

public class Question {
private int id;
private String Name;
private List<String>answers;
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
public List<String> getAnswers() {
	return answers;
}
public void setAnswers(List<String> answers) {
	this.answers = answers;
}
 public void displayInfo() {
	 System.out.println(id+" "+Name);
	 Iterator<String> itr= answers.iterator();
	 while(itr.hasNext()) {
		 System.out.println(itr.next());
	 }
 }
}
