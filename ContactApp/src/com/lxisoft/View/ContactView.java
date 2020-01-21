package com.lxisoft.View;
import java.util.*;
import com.lxisoft.Model.ContactModel;
import com.lxisoft.View.ContactView;
public class ContactView
{
	static Scanner sc = new Scanner(System.in);	
	public int selectYourChoice()
	{
		System.out.println("Contact App");
		System.out.println("\n1.Contact Details \n2.Create new Contact");
		int i = sc.nextInt();
		return i;
	}
	public int contactDetails()
	{
		System.out.println("Select Your Choice");
		System.out.println("\n1.Add \n2.View \n3.Edit \n4.Delete");
		int a = sc.nextInt();
		return a;
	}	
	public void addContact(ArrayList<ContactModel> contacts)
	{		
		ContactModel contact = new ContactModel(); 
		System.out.println("Contact id");
		contact.setId(sc.nextInt());
		System.out.println("Enter contact name");
		contact.setName(sc.next());
		System.out.println("Phone number");
		contact.setPhoneNumber(sc.nextLong());
		contacts.add(contact);			        	
	}
	public void displayAllContact(ArrayList<ContactModel> contacts)
	{
		System.out.println("Contact Details");
		for(int i=0; i<contacts.size(); i++)
		{			
			System.out.printf("%-20.30s %-20.30s %-20.30s%n",contacts.get(i).getId(),contacts.get(i).getName(),contacts.get(i).getPhoneNumber());
		}
	}
}

		
		
		