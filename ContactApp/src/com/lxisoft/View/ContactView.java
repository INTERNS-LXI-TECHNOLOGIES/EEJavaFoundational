package com.lxisoft.View;
import java.util.*;
import com.lxisoft.Model.ContactModel;
import com.lxisoft.Repository.FileRepository;
public class ContactView
{
	static Scanner sc=new Scanner(System.in);	
	public ArrayList<ContactModel> contacts=new ArrayList<ContactModel>();
	FileRepository filerepo = new FileRepository();
	public int selectYourChoice()
	{
		System.out.println("Contact App");
		System.out.println("\n1.Contacts \n2.Create new Contact");
		int i=sc.nextInt();
		return i;
	}
	public int contactDetails()
	{
		System.out.println("Select Your Choice");
		System.out.println("\n1.Add \n2.View \n3.Edit \n4.Delete");
		int a=sc.nextInt();
		return a;
	}	
	public void addContact()
	{		
		ContactModel contact = new ContactModel(); 
		System.out.println("Enter contact name");
		contact.setName(sc.next());
		System.out.println("Phone number");
		contact.setPhoneNumber(sc.nextInt());
		contacts.add(contact);	
		filerepo.writeToFile();		
		        	
	}
	public void displayContact()
	{
		System.out.println("Contact Deatails");
		for(int i=0;i<contacts.size();i++)
		{			
			System.out.printf("%-20.30s %-20.30s%n",contacts.get(i).getName(),contacts.get(i).getPhoneNumber());
		}
	}
}

		
		
		