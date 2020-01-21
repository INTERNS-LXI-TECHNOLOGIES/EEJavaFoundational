package com.lxisoft.view;
import com.lxisoft.controller.ContactControler;
import com.lxisoft.model.ContactModel;
import java.util.*;
public class ContactView
{
	public static Scanner scanner = new Scanner(System.in);
	private ContactControler controler ;
	public static void main(String[] args)
	{
		// ContactView view = new ContactView();
		// view.displayOrAddContact(); 
		ContactControler controler = new ContactControler();
		controler.displayOrAddContact(); 
	}
	public int selectOption()
	{
		System.out.println("!!! My Contact App !!!");
		System.out.println("Press ==> 1.Display All Contact 2.Add New Contact");
		int select = scanner.nextInt();
		return select;
	}
	public void createNewContact(int iD,String name,Long phoneNumber)
	{	
		System.out.println("Enter contactID");
		iD = scanner.nextInt();
		System.out.println("Enter Contact Name");
		name = scanner.next();
		System.out.println("Enter Contact Number");
		phoneNumber = scanner.nextLong();
	}
	public void displayAllContacts(ArrayList<ContactModel> contacts)
	{
		for(int i=0;i<contacts.size();i++)
		{
			System.out.printf("%-20.30s %-20.30s %-20.30s%n",contacts.get(i).getId(),contacts.get(i).getName(),contacts.get(i).getPhoneNumber());
		}
	}
}