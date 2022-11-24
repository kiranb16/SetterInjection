package com.SetterInjectionMapNonString;

public class User {
 private int id;
 private String Name;
 private String email;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int id, String name, String email) {
	super();
	this.id = id;
	Name = name;
	this.email = email;
}
@Override
public String toString() {
	return "User [id=" + id + ", Name=" + Name + ", email=" + email + "]";
}
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
}
