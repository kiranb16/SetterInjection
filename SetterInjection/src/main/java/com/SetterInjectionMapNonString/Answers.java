package com.SetterInjectionMapNonString;

import java.util.Date;

public class Answers {
private int id;
private String answer;
private Date PostedDate;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}
public Date getPostedDate() {
	return PostedDate;
}
public void setPostedDate(Date postedDate) {
	PostedDate = postedDate;
}
public Answers(int id, String answer, Date postedDate) {
	super();
	this.id = id;
	this.answer = answer;
	PostedDate = postedDate;
}
public Answers() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Answers [id=" + id + ", answer=" + answer + "]";
}
}
