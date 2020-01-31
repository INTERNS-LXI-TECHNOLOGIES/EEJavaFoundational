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
	Scanner scr=new Scanner(System.in);
	Contact contact=new Contact();
	ArrayList<Contact> details= new ArrayList<Contact>();
	View view=new View();
	//int a = this.activities();
	public int activities()
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("1 : Display Contacts \n2 : Create Contact \n3 : Select Contact \n4 : search contact");
		int select=scr.nextInt();
		//Controller controller=new Controller();
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
					searchContact();
					break;		
		}
		return 0;
	}
	public void displayContacts()
	{
		details=filerepository.readFile();
		view.displayContacts(details);
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
		Boolean value=true;
		
        filerepository.writeFile(contacts,value);
        
	}
	public void selectContact()
	{
		
		view.selectContact(details);
		int num=view.selectContact(details);	
				switch(num)
				{
					case 1:
							editContact();
							break;
					case 2:
							deleteContact();
							break;
				}
			
			
				


	}
	public void editContact()
	{
		ArrayList<Contact> details=filerepository.readFile();
		
		view. editContact(details);
		Boolean value=false;
		filerepository.writeFile(details,value);

	}
	public void deleteContact()
	{
		ArrayList<Contact> details=filerepository.readFile();
		int num=view.deleteContact(details);
			details.remove(num-1);
			Boolean value=false;
			filerepository.writeFile(details,value);
	}
	public void searchContact()
	{
		ArrayList<Contact> details=filerepository.readFile();
		int i=1;
		for(int j=0;j<details.size();j++)
		{
			System.out.print(i+" : "+details.get(j).getName()+" : "+details.get(j).getNumber()+"\n");
			i++;
		}
		String name=view.searchContact();
		for (int m=0;m< details.size();m++ ) 
		{
			if(name.equals(details.get(m).getName()))
			{
				System.out.println(details.get(m).getName()+" : "+details.get(m).getNumber());
			}
		}
		


	}

}