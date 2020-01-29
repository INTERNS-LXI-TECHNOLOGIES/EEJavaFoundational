package com.lxisoft.view;
import java.util.Scanner;
import com.lxisoft.controller.*;
import com.lxisoft.contact.Contact;
import com.lxisoft.filerepository.Filerepository;

import java.util.*;
public class View
{
	Filerepository filerepository=new Filerepository();
	Scanner scr=new Scanner(System.in);
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
	public String[] createNewContact()
	{
		String[]data=new String[2];
        System.out.print("write name :");
        data[0]=scr.next();
        System.out.print("write number :");
        data[1]=scr.next();
        return data;
       
        
	}
	public int selectContact()
	{
		System.out.println("Select Contact");
		int num=scr.nextInt();
		return num;
	}
	public int editContact(Contact details)
	{
		System.out.println("Select Contact");
		int num=scr.nextInt();
		System.out.println("enter number");
		String number=scr.next();
		details.setNumber(number);
		
		return num;
	}
	public int deleteContact()
	{
		System.out.println("Select Contact");
		int num=scr.nextInt();
		return num;
	}
	
}