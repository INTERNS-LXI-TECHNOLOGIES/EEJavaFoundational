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
		System.out.println("\n1.Contacts \n2.Create new Contact");
		int i = sc.nextInt();
		return i;
	}
	public int contactDetails()
	{
		System.out.println("Choose a option");
		System.out.println("\n1.Add \n2.View \n3.Edit \n4.Delete \n5.Back To Main Menu");
		int a = sc.nextInt();
		return a;
	}	
	public String[] addContactDetails()
	{		
		String[] s=new String[3]; 
		System.out.println("Contact id");
		s[0]=sc.next();
		System.out.println("Enter contact name");
		s[1]=sc.next();
		System.out.println("Phone number");
		s[2]=sc.next();	
		return s;			        	
	}
	public void displayAllContact(ArrayList<ContactModel> contacts)
	{
		try
		{
			System.out.println("Contact Details");
			//System.out.println("yaaaaaaaaaaaaaaaaaaaaaaaahuuuuuuuuuuuuuuuuuuuuuuuuuuu");
			//System.out.println("Size : "+contacts.size());
			for(int i=0; i<contacts.size(); i++)
			{			

				System.out.printf("%-20.30s %-20.30s%n",contacts.get(i).getId(),contacts.get(i).getName());
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public void viewAllContact()
	{
		// System.out.println("Contacts are");
		// System.out.printf("%-20.30s %-20.30s %-20.30s%n","Contact ID","Contact Name","Phone Number");
		// System.out.printf("%-20.30s %-20.30s %-20.30s%n",contact.getId(),contact.getName(),contact.getPhoneNumber());
		
	}
	public int editContact(ArrayList<ContactModel> contacts)
	{
		System.out.println("Which contact you want to edit");
		int s=sc.nextInt();
		return s;
	}
	public void editContactDetail()
	{
		System.out.println("What you want to edit");
		System.out.println("\n1.Name \n2.PhoneNumbere ");
	}
}

		
		
		