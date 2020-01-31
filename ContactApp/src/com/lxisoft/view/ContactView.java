package com.lxisoft.view;
import com.lxisoft.model.*;
import java.util.Scanner;
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
		System.out.println("select your choice : ");
		int choice1 =sc.nextInt();
		return choice1;
	}
	public ArrayList<String> addContacts()
	{
		ArrayList<String>details=new ArrayList<String>();
		System.out.println("enter the name :");
		details.add(sc.next());
		System.out.println("enter the phone number : ");
		details.add(sc.next());
		System.out.println("enter the id :");
		details.add(sc.next());
		return details;
	}
	public int selectName()
	{
		System.out.println("select the name that to be edited :");
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
	public int displayContacts( ArrayList<ContactModel> reader)
	{
		for(int i=0;i<reader.size();i++)
		{
			System.out.println(i+1+"."+reader.get(i).getName()+" : "+reader.get(i).getMob()+"(ID :"+reader.get(i).getId()+")");
		}
		System.out.println("1. Edit   2.Delete");
		System.out.println("Select your choice ");
		int c= sc.nextInt();
		return c;
	}
	public int editContact(ContactModel contact)
	{
		System.out.println("name : "+contact.getName()+"\nphone : "+contact.getMob()+"\nID : "+contact.getId());
		System.out.println(" which one you want to edit");
		System.out.println("1. Name 2.Mobile 3. Id");
		int c=sc.nextInt();
		return c;
	}
	public String editName()
	{
		System.out.println(" enter the name : ");
		String name= sc.nextLine();
		sc.nextLine();
		return name;
	}
	public long editMob()
	{
		System.out.println("enter the mobile number : ");
		long mob=sc.nextLong();
		return mob;
	}
	public int editId()
	{
		System.out.println("enter the Id : ");
		int id=sc.nextInt();
		return id;
	}
}