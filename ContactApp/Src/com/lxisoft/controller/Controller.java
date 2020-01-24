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
	public String createNewContact()
	{
		Contact contact=new Contact();
		
		Scanner scr=new Scanner(System.in);
        System.out.println("write name :");
        String name=scr.next();
        System.out.println("write number :");
        String number=scr.next();
        contact.setName(name);
        contact.setNumber(number);
        filerepository.writeFile(contact);
        names.add(name);
        //selectContact(name);
        return names;
	}
	public void selectContact()
	{
				Scanner scr=new Scanner(System.in);
		ArrayList<Contact> details=filerepository.readFile();
		int i=1;
		for ( Contact s : details)
		{
			System.out.print(i+" : "+s.getName()+"\n");
			
			i++;
		}
		System.out.println("Select Contact");
		int num=scr.nextInt();
		filerepository.readContact(names);

		
	}
	

}