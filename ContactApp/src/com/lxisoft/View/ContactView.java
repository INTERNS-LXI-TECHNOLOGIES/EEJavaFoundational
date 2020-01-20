package com.lxisoft.View;
import java.util.*;
public class ContactView
{
	static Scanner sc=new Scanner(System.in);	
	ContactModel contact=new ContactModel();
	public int selectYourChoice()
	{
		System.out.println("Contact App");
		System.out.println("\n1.Contact Detail \n2.Create new Contact");
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
		
		System.out.println("Enter contact name");
		contact.setName(sc.next());
		

		
		

		
	}
}

		
		
		