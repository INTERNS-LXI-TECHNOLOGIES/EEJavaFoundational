package com.lxisoft.Contact.model;
import java.util.*;
public class SignupModel{

	private String name;
	private String phoneNumber;
	private String mailId;
	private String username;
	private String password;

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber=phoneNumber;
	}
	public String getPhoneNumber(){
		return this.phoneNumber;
	}
	public void setMailId(String mailId){
		this.mailId=mailId;
	}
	public String getMailId(){
		return this.mailId;
	}
	public void setUserName(String username){
		this.username=username;
	}
	public String getUserName(){
		return this.username;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public String getPassword(){
		return this.password;
	}
	public String toString(){  
		return name+" "+phoneNumber+" "+mailId+" "+password+" "+username;
	}
	

}