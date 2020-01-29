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
	ArrayList<Contact> contacts = new ArrayList<Contact>(); 
	
	Contact contact=new Contact();
	View view=new View();
	//int a = this.activities();
	public int activities()
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("1 : Display Contacts \n2 : Create Contact \n3 : Select Contact \n4 : Edit contact \n5 : Delete Contact");
		int select=scr.nextInt();
		Controller controller=new Controller();
/*		controller=null;
*/		switch(select)
		{
			case 1:
					displayContacts();
					break;
			case 2:
					createNewContact();
					break;
			case 3:
					selectContact();
					break;	
			case 4:
					editContact();
					break;
			case 5:
					deleteContact();
					break;		
		}
		return 0;
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
		
		
		String[]data=view.createNewContact();
		contacts.add(new Contact());
		for(int i=0;i<contacts.size();i++)
		{
			if(contacts.get(i).getName()==null)
			{
				contacts.get(i).setName(data[0]);
        		contacts.get(i).setNumber(data[1]);
			}
			
		}
		
        filerepository.writeFile(contacts);
        
	}
	public void selectContact()
	{
		ArrayList<Contact> details=filerepository.readFile();
		int i=1;
		for(int j=0;j<details.size();j++)
		{
			System.out.print(i+" : "+details.get(j).getName()+" : "+details.get(j).getNumber()+"\n");
			i++;
		}
		int num=view.selectContact();
			System.out.println(details.get(num-1).getName()+" : "+details.get(num-1).getNumber());

	}
	public void editContact()
	{
		ArrayList<Contact> details=filerepository.readFile();
		int i=1;
		for(int k=0;k<details.size();k++)
		{
			System.out.print(i+" : "+details.get(k).getName()+" : "+details.get(k).getNumber()+"\n");
			i++;
		}
			int num=view.selectContact();
			System.out.println(details.get(num-1).getName()+" : "+details.get(num-1).getNumber());
		for(int j=0;j<details.size();j++)
		{
			details.remove(j);
		}
			view. editContact(details.get(num-1));
			filerepository.writeFile(details);

	}
	public void deleteContact()
	{
		ArrayList<Contact> details=filerepository.readFile();
		int i=1;
		for(int k=0;k<details.size();k++)
		{
			System.out.print(i+" : "+details.get(k).getName()+" : "+details.get(k).getNumber()+"\n");
			i++;
		}
			int num=view.selectContact();
			System.out.println(details.get(num-1).getName()+" : "+details.get(num-1).getNumber());
			details.remove(num-1);
			filerepository.writeFile(details);
	}

}