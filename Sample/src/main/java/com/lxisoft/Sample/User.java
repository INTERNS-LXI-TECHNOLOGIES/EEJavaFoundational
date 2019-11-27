package com.lxisoft.Sample;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User
{
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int vNo;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, int vNo) {
		super();
		this.id = id;
		this.name = name;
		this.vNo = vNo;
	}
	public int getvNo() {
		return vNo;
	}
	public void setvNo(int vNo) {
		this.vNo = vNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}