package com.lxisoft.ContactApp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contact
{
	@Id
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	private String name;
	private String contactNumber;
	public Contact()
	{
	}
	public Contact(String name, String contactNumber) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", contactNumber=" + contactNumber + "]";
	}
	
	
	
}