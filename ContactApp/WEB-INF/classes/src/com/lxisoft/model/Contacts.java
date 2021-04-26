package com.lxisoft.model;
import  com.lxisoft.repository.*;
import java.util.*;

public class Contacts{
	String userName;
	String number;
	String eMail;
	public void setName(String name){
		this.userName = name;
	}
	public String getName(){
		return userName;
	}
	public void setNumber(String num){
		this.number = num;
	}
	public String getNumber(){
		return number;
	}
	public void setEmail(String mail){
		this.eMail = mail;
	}
	public String getEmail(){
		return eMail;
	}
}