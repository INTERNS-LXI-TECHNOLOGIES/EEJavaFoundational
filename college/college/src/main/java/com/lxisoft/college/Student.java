package com.lxisoft.college;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
@Id
private int id;
private String name;
private float mark;
public float getMark() {
	return mark;
}
public void setMark(float mark) {
	this.mark = mark;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String toString() {
	return "Student [name=" + name + ", mark=" + mark + "]";
}
public Student() {
	
}
public Student(String name,float mark) {
	super();
	this.name = name;
	this.mark = mark;
}
}
