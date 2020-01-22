package com.lxisoft.controller;
import com.lxisoft.view.*;
import com.lxisoft.model.*;
import com.lxisoft.sqlrepository.*;
import java.util.*;
import com.lxisoft.repository.*;
import com.lxisoft.test.*;

public class Controller
{
	Contact contact ;
	Repository rep = new Sqlrepository();
	//Repository rep = new Filerepository();
	View view = new View();
	public ArrayList <Contact> contactList = new ArrayList<Contact>();
	public void choice()
	{

		view.dateDisplay();
		int n=view.begin();
		switch(n)
		{
			case 1 : addContact(); break;
			 case 2 : view.search();break;
			 case 3 : display(); break;
			case 4 : view.clear();break;
			default: view.defaultPrint(0);
		}		
	}

	public void addContact()
	{ 
		contact= view.addContact();
        rep.write(contact,true);
        choice();

	}
	
	public Contact search(String name)
	{
		contact = new Contact();
		contactList = rep.read();
		for(int i= 0;i<contactList.size();i++)
		{
			if(name.equals(contactList.get(i).getName()))
			{	
				contact = contactList.get(i);
			}
		}
		return contact;
		
	}
	public int getId(String name)
	{
		contact = new Contact();
		contact = search(name);
		int id = contact.getId();
		return id;		
	}

	public ArrayList<Contact> read()
	{
		//contact = new Contact();
		ArrayList <Contact> contactDetail = new ArrayList<Contact>();
		return contactDetail=rep.read();

	}

	public void editContact(int id,String name,String number)
	{	
         rep.edit(id,name,number);
		 choice();
	}

	public void deleteContact(int id)
	{
		rep.delete(id);
		
	}
	public void display()
	{
		int n=view.display();
		switch(n)
		{
			case 1 : view.dateDisplay(); break;
		    case 2 : view.sortByname();break;
		    case 3 : view.sortByid(); break;
		}
		
		choice();
	}
	
	// public int getArraySize()
	// {
	// 	return rep.getArraysize();
	// }
	// public String getName()
	// {
	// 	return contact.getName();
	// }
	// public String getNumber()
	// {
	// 	return contact.getNumber();
	// }
	public void deleteAll()
	{
		rep.clear();
		choice();
	}
}
