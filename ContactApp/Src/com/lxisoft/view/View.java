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
public void displayContacts(ArrayList<Contact> details)
	{
		//ArrayList<Contact> details=filerepository.readFile();
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
	public int selectContact(ArrayList<Contact> details)
	{
			
			System.out.println("Select Contact");
			int num=scr.nextInt();
		
			int choose=0;
			int i=1;
			for(int j=0;j<details.size();j++)
			{
				System.out.print(i+" : "+details.get(j).getName()+" : "+details.get(j).getNumber()+"\n");
				i++;
			}
			
			System.out.println(details.get(num-1).getName()+" : "+details.get(num-1).getNumber());

			System.out.println("you want any custmize in contacts ? y/n");
			char c = scr.next().charAt(0);
			if(c=='y')
			{
				
				System.out.println("1 : Edit Contact \n2 : Delete Contact ");
				choose=scr.nextInt();
				

			}
			else if(c=='n')
			{
				
			}
			else 
			{
				System.out.println("Wrong entry please choose correct entry");
			}
			
		return choose;
	}
	public ArrayList<Contact> editContact(ArrayList<Contact> details)
	{
		System.out.println("Select Contact");
		int num=scr.nextInt();

		int i=1;
		for(int k=0;k<details.size();k++)
		{
			System.out.print(i+" : "+details.get(k).getName()+" : "+details.get(k).getNumber()+"\n");
			i++;
		}
		
			System.out.println(details.get(num-1).getName()+" : "+details.get(num-1).getNumber());
			

		System.out.println("enter number");
		String number=scr.next();
		
		details.get(num-1).setNumber(number);

		return details;
	}
	public int deleteContact(ArrayList<Contact> details)
	{
		System.out.println("Select Contact");
		
		int i=1;
		for(int k=0;k<details.size();k++)
		{
			System.out.print(i+" : "+details.get(k).getName()+" : "+details.get(k).getNumber()+"\n");
			i++;
		}
			int num=scr.nextInt();
			System.out.println(details.get(num-1).getName()+" : "+details.get(num-1).getNumber());
			
		return num;
	}
	public String searchContact()
	{

		System.out.println("enter name");
		String name=scr.next();
		return name;
	}
	
}