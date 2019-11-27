package com.lxisoft.Sample;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User
{
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Integer vNo;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer id, String name, Integer vNo) {
		super();
		this.id = id;
		this.name = name;
		this.vNo = vNo;
	}
	public Integer getvNo() {
		return vNo;
	}
	public void setvNo(Integer vNo) {
		this.vNo = vNo;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}