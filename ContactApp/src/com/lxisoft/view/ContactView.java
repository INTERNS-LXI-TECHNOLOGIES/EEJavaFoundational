package com.lxisoft.view;
import com.lxisoft.controller.ContactControler;
import com.lxisoft.model.ContactModel;
import java.util.*;
public class ContactView
{
	public static Scanner scanner = new Scanner(System.in);
	private ContactControler controler ;
	public int selectOption()
	{
		System.out.println("!!! My Contact App !!!");
		System.out.println("Press ==> 1.Display All Contact  2.Add New Contact");
		int select = scanner.nextInt();
		return select;
	}
	public void wrongSelection()
	{
		System.out.println("Select Options From Above !!!");
	}
	public String[] createNewContact()
	{	
		String[] data = new String[3];
		System.out.println("Enter contactID");
		data[0] = scanner.next();
		System.out.println("Enter Contact Name");
		data[1] = scanner.next();
		System.out.println("Enter Contact Number");
		data[2] = scanner.next();
		return data;
	}
	public void displayAllContacts(ArrayList<ContactModel> contacts)
	{
		System.out.printf("%-20.30s %-20.30s %-20.30s%n","Contact ID","Contact Name","Contact Number");
		for(int i=0;i<contacts.size();i++)
		{
			System.out.printf("%-20.30s %-20.30s %-20.30s%n",contacts.get(i).getId(),contacts.get(i).getName(),contacts.get(i).getPhoneNumber());
		}
	}
	public boolean addMoreContact()
	{
		boolean isTrue = false;
		System.out.println("Press ==> 1.Add More Contact 2.Back");
		int x = scanner.nextInt();
		if(x==1)
		{
			isTrue = true;
		}
		return isTrue;
	}
}