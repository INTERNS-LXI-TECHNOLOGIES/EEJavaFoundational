package com.lxisoft.View;
import java.util.*;
import com.lxisoft.Model.ContactModel;
import com.lxisoft.View.ContactView;
import com.lxisoft.Repository.FileRepository;
public class ContactView
{
	static Scanner sc = new Scanner(System.in);	
	public int selectYourChoice()
	{
		System.out.println("Contact App");
		System.out.println("\n1.Contacts \n2.Create new Contact \n 3.Search \n4.Exit");
		int i = sc.nextInt();
		return i;
	}
	public int contactDetails()
	{
		System.out.println("Choose a option");
		System.out.println("\n1.Edit \n2.View\n3.Delete \n4.Search \n5.Back To Main Menu");
		int a = sc.nextInt();
		return a;
	}	
	public void invalidOption()
	{
		System.out.println("Invalid option");
	}
	public void noContactFound()
	{
		System.out.println("No Contact Found");
	}
	public int addToContact()
	{
		System.out.println("\n1.Add");
		int p=sc.nextInt();
		return p;
	}	
	public ContactModel addContactDetails(ContactModel contact)
	{		
		System.out.println("Contact id");
		contact.setId(sc.nextInt());
		System.out.println("Enter contact name");
		contact.setName(sc.next()); 
		System.out.println("Phone number");
		contact.setPhoneNumber(sc.nextLong());
		return contact;		        	
	}
	public void displayAllContact(ArrayList<ContactModel> contacts)
	{
		try
		{
			System.out.println("Contact Details");
			Collections.sort(contacts);
			for(int i=0; i<contacts.size(); i++)
			{	
				System.out.printf("%-20.30s %-20.30s %-20.30s%n",contacts.get(i).getId(),contacts.get(i).getName(),contacts.get(i).getPhoneNumber());
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public int editContact(ArrayList<ContactModel> contacts)
	{
		System.out.println("Which contact you want to edit");
		int s=sc.nextInt();
		return s;
	}
	public int editContactDetail()
	{
		System.out.println("What you want to edit");
		System.out.println("\n1.Name \n2.PhoneNumber");
		int e=sc.nextInt();
		return e;
	}
	public String editName()
	{
		System.out.println("Enter your name");
		String s=sc.next();
		return s;
	}
	public Long editPhoneNumber()
	{
		System.out.println("Enter phone number");
		Long p=sc.nextLong();
		return p;
	}
	public int deleteContact()
	{
		System.out.println("Which contact want to delete");
		int e=sc.nextInt();
		return e-1;
	}
	public String searchContact()
	{
		System.out.println("Enter a name");
		String c=sc.next();
		return c;
	}
	public void contactExist()
	{
		System.out.println("Contact exist");
	}
	public String searchElement()
	{
		System.out.println("Enter your search");
		String m=sc.next();
		return m;
	}

}

		
		
		