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
		System.out.println("\n1.Contacts \n2.Create new Contact \n3.Search \n4.Exit");
		int i = sc.nextInt();
		return i;
	}
	public int selectAContact()
	{
		System.out.println("Select a contact");
		int a=sc.nextInt();
		return a;
	}
	public int contactDetails()
	{
		System.out.println("Choose a option");
		System.out.println("\n1.Edit \n2.View \n3.Delete \n4.Back To Main Menu");
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
	public void fileNotFound()
	{
		System.out.println("File not found");
	}
	public int addToContact()
	{
		System.out.println("\n1.Add");
		int p=sc.nextInt();
		return p;
	}	
	public ContactModel addContactDetails(ContactModel contact)
	{		
		// System.out.println("Contact id");
		// contact.setId(sc.nextInt());
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
				System.out.printf("%-20.30s %-20.30s%n",contacts.get(i).getName(),contacts.get(i).getPhoneNumber());
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public int editContact(ContactModel contact)
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
	public ContactModel editName(ContactModel contact)
	{
		System.out.println("Enter your name");
		contact.setName(sc.next());
		return contact;
	}
	public ContactModel editPhoneNumber(ContactModel contact)
	{
		System.out.println("Enter phone number");
		contact.setPhoneNumber(sc.nextLong());
		return contact;
	}
	public int deleteContact()
	{
		System.out.println("Which contact want to delete");
		int e=sc.nextInt();
		return e-1;
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
	public void displayAContact(ContactModel contact)
	{
		System.out.println("Contact is");
		System.out.println(contact.getId());
		System.out.println(contact.getName());
		System.out.println(contact.getPhoneNumber());		
	}

}

		
		
		