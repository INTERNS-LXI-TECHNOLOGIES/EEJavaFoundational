package com.lxisoft.view;
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
	public void defaultText()
	{
		System.out.println("please enter the correct choice ");
	}
}