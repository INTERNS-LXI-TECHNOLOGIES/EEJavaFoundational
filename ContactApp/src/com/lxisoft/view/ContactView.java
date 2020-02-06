package com.lxisoft.view;
import com.lxisoft.model.*;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class ContactView
{
    static Scanner sc=new Scanner(System.in);
	public int display()
	{
		System.out.println("contact App");
		System.out.println("************");
		System.out.println("1.Add contact");
		System.out.println("2.Display contacts");
		System.out.println("3.search contact");
		System.out.println("select your choice : ");
		int choice1 =sc.nextInt();
		return choice1;
	}
	public ContactModel addContacts(ContactModel contact)
	{
		System.out.println("enter the name :");
		contact.setName(sc.nextLine());
		contact.setName(sc.nextLine());
		System.out.println("enter the phone number : ");
		contact.setMob(sc.nextLong());
		return contact;
	}
	public String searchContact()
	{
		System.out.println("search name : ");
		String search=sc.next();
		return search;
	}
	public int selectName()
	{
		System.out.println("select the name:");
		int a=sc.nextInt();
		return a;
	}
	public int selectDelete()
	{
		System.out.println(" select the contact that to be deleted");
		int a=sc.nextInt();
		return a;
	}
	public void defaultText1()
	{
		System.out.println("please enter the correct choice ");
	}
	public void defaultText2()
	{
		System.out.println(" no contacts ");
	}
	public int defaultText3()
	{
		System.out.println("enter 1 if you want to continue ");
		int x=sc.nextInt();
		return x;
	}
	public int defaultText4()
	{
		System.out.println("enter 1 if you want to continue editing ");
		int x=sc.nextInt();
		return x;
	}
	public void displayContacts(ArrayList<ContactModel> reader)
	{
		Collections.sort(reader);
		for(int i=0;i<reader.size();i++)
		{
			System.out.println(i+1+"."+reader.get(i).getName()+" : "+reader.get(i).getMob()+"(ID :"+reader.get(i).getId()+")");
		}
	}
	public int editOrDelete()
	{
		System.out.println("1. Edit   2.Delete 3.back");
		System.out.println("Select your choice ");
		int c= sc.nextInt();
		return c;
	}
	public void displayOneContact(ContactModel contact)
	{
		System.out.println("name : "+contact.getName()+"\nphone : "+contact.getMob()+"\nID : "+contact.getId());
		
	}
	public int editContact()
	{
		System.out.println(" which one you want to edit");
		System.out.println("1. Name 2.Mobile 3. back");
		int c=sc.nextInt();
		return c;
	}
	public ContactModel editName(ContactModel contact)
	{
		System.out.println(" enter the name : ");
		contact.setName(sc.nextLine());
		contact.setName(sc.nextLine());
		return contact;
	}
	public ContactModel editMob(ContactModel contact)
	{
		System.out.println("enter the mobile number : ");
		contact.setMob(sc.nextLong());
		return contact;
	}
	public ContactModel editId(ContactModel contact)
	{
		System.out.println("enter the Id : ");
		contact.setId(sc.nextInt());
		return contact;
	}
}