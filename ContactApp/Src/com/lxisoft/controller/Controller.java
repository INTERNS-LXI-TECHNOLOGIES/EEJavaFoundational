package com.lxisoft.controller;
import java.util.Scanner;
import com.lxisoft.view.*;
import com.lxisoft.contact.Contact;
import com.lxisoft.filerepository.Filerepository;
import java.util.*;
import java.util.*;
public class Controller
{
	Filerepository filerepository=new Filerepository();
	ArrayList<String> names = new ArrayList<String>(); 
	ArrayList<Contact> Contacts = new ArrayList<Contact>(); 
	public void activities()
	{
		View view=new View();
		view.display();
	}
	public void displayContacts()
	{
		ArrayList<Contact> details=filerepository.readFile();
		int i=1;
		for ( Contact s : details)
		{
			System.out.print(i+" : "+s.getName());
			System.out.println(s.getNumber());
			i++;
		}
	}
	public void createNewContact()
	{
		Contact contact=new Contact();
		
		Scanner scr=new Scanner(System.in);
        System.out.print("write name :");
        String name=scr.next();
        System.out.print("write number :");
        String number=scr.next();
        contact.setName(name);
        contact.setNumber(number);
        filerepository.writeFile(contact);
       
        
	}
	public void selectContact()
	{
				Scanner scr=new Scanner(System.in);
		ArrayList<Contact> details=filerepository.readFile();
		int i=1;
		for ( Contact s : details)
		{
			System.out.print(i+" : "+s.getName()+"\n");
			names.add(s.getName());
			i++;
		}
		System.out.println("Select Contact");
		int num=scr.nextInt();
			//System.out.println(names.get(--num));
		filerepository.readContact(names.get(--num));

		
	}
	public void editContact()
	{
		
	}
	

}