package com.lxisoft.view;
import com.lxisoft.controller.ContactControler;
import com.lxisoft.model.ContactModel;
import java.util.*;
/**
* Display The Output.
*/
public class ContactView
{
	public static Scanner scanner = new Scanner(System.in);
	/**
	* Give a name for my ContactApp
	*/
	public void myAppName()
	{
		System.out.println("              !!! My Contact App !!!");
	}
	/**
	* select Option
	*/
	public int selectOption()
	{
		System.out.println("Press ==> 1.Contacts / 2.Add New Contact / 3.Search Contact / 4.Exit");
		int select = scanner.nextInt();
		return select;
	}
	/**
	* Sop for Wrong Seletion
	*/
	public void wrongSelection()
	{
		System.out.println("Select Options From Above !!!");
	}
	/**
	* SOP for table not found
	*/
	public void fileNotFound()
	{
		System.out.println("No Contacts Found...!!!!");
	}
	/**
	* Select option for view a contact
	* @return variable of selected option
	*/
	public int contactOperations()
	{
		System.out.println("Press==> 1.View Contact 2.Back 3.Exit");
		int select = scanner.nextInt();
		return select;
	}
	/**
	* Select Options for CRUD Operations
	* @return variable of selected option
	*/
	public int crudeOperations()
	{
		System.out.println("Press==> 1.Edit 2.Delete 3.Back 4.Exit");
		int select = scanner.nextInt();
		return select;
	}
	/**
	* Contact delete Message
	*/
	public void contactDeleteMessage()
	{
		System.out.println("Contact Deleted...!!!");
	}
	/**
	* Contact Added Message
	*/
	public void contactAddedMessage()
	{
		System.out.println("New Contact Added...!!!");
	}
	/**
	* View a COntact
	* @param contact for display contact.
	*/
	public void viewContact(ContactModel contact)
	{
		System.out.printf("%-20.30s %-20.30s %-20.30s%n","Contact ID","Contact Name","Phone Number");
		System.out.printf("%-20.30s %-20.30s %-20.30s%n",contact.getId(),contact.getName(),contact.getPhoneNumber());	
	}
	public void contactHeading()
	{
		System.out.printf("%-20.30s %-20.30s %-20.30s%n","Contact ID","Contact Name","Phone Number");
	}
	public void contactData(ContactModel contact)
	{
		System.out.printf("%-20.30s %-20.30s %-20.30s%n",contact.getId(),contact.getName(),contact.getPhoneNumber());	
	}
	/**
	* Create New Contact.
	* @param contact for create new Contact.
	*/
	public ContactModel createNewContact(ContactModel contact)
	{
		// System.out.println("Enter contactID");
		// contact.setId(scanner.nextInt());
		System.out.println("Enter Contact Name");
		contact.setName(scanner.nextLine());
		contact.setName(scanner.nextLine());
		System.out.println("Enter Contact Number");
		contact.setPhoneNumber(scanner.nextLong());
		return contact;
	}
	/**
	* For select a Contact
	* @return index value
	*/
	public int selectContact()
	{
		System.out.print("Select a Contact : ");
		int select = scanner.nextInt();
		return select;
	}
	/**
	* select option for edit a contact
	* @return selected option
	*/
	public int  editContact()
	{
		System.out.println("Press==> 1.Edit Name 2.Edit Phone Number 3.Back");
		int select = scanner.nextInt();
		return select;
	}
	/**
	* Edit Contact name.
	* @param contact for edit.
	* @return updated Contact.
	*/
	public ContactModel enterName(ContactModel contact)
	{
		System.out.println("Enter Name");
		contact.setName(scanner.nextLine());
		contact.setName(scanner.nextLine());
		System.out.println("Name Updated...!!!");
		return contact;
	}
	/**
	* Edit PhoneNumber
	* @param contact for edit.
	* @return updated Contact.
	*/
	public ContactModel enterPhoneNumber(ContactModel contact)
	{
		System.out.println("Enter PhoneNumber");
		contact.setPhoneNumber(scanner.nextLong());
		System.out.println("Number Updated...!!!");
		return contact;
	}
	/**
	* For Search a Contact.
	* @return name for search.
	*/
	public String contactSearch()
	{
		System.out.print("Enter Contact Name For Search : ");
		String name = scanner.nextLine();
		name = scanner.nextLine();
		return name;
	}
	/**
	* No contacts Found Message.
	*/
	public void noContactFoundMessage()
	{
		System.out.println("No Contacts Matched...!!!");
	}
	/**
	* For display Contacts.
	* @param contacts data contained ArrayList.
	*/
	public void displayAllContacts(ArrayList<ContactModel> contacts)
	{
		int j = 1;
		Collections.sort(contacts);
		System.out.printf("%-20.30s %-20.30s %-20.30s%n","Sl-NO","Contact ID","Contact Name");
		for(int i=0;i<contacts.size();i++)
		{
			System.out.printf("%-20.30s %-20.30s %-20.30s%n",j,contacts.get(i).getId(),contacts.get(i).getName());
			j++;
		}
	}
}