package com.lxisoft.controller;
import com.lxisoft.view.ContactView;
import com.lxisoft.model.ContactModel;
import com.lxisoft.Repository.FileRepository;
import com.lxisoft.Repository.SqlRepository;
import java.util.regex.*;
import java.util.*;
import java.io.*;
public class ContactControler
{
	private ArrayList<ContactModel> contacts = new ArrayList<ContactModel>();
	private SqlRepository sqlReppo = SqlRepository.getInstance();
	private ContactView view = new ContactView();
/**
*  Stating the ContactApp..
*/
	public void contactApp()
	{
		view.myAppName();
		boolean isTrue = false;
		do
		{
			isTrue = false;
			int select = view.selectOption();
			switch(select)
			{
				case 1:
					this.contactManagement();
					isTrue = true;
					break;
				case 2:
					this.addNewContact();
					isTrue = true;
					break;
				case 3:
					this.searchContact();
					isTrue = true;
					break;
				case 4:
					System.exit(0);
					break;
				default :
					view.wrongSelection();
					isTrue = true;
					break;
			}
		}while(isTrue);
	}
	/**
	* Manage Contacts.
	*/
	public void contactManagement()
	{
		try
		{
			contacts.clear();
			contacts = sqlReppo.readContact(contacts);
			boolean isTrue = false;
			do
			{
				view.displayAllContacts(contacts);
				isTrue = false;
				int select = view.contactOperations();
				switch(select)
				{
					case 1 :
						int selectedContact = view.selectContact();
						view.viewContact(contacts.get(selectedContact-1));
						this.crudeOperation(contacts.get(selectedContact-1));
						isTrue = true;
						break;
					case 2 :
						break;
					case 3 :
						System.exit(0);
						break;
					default :
						view.wrongSelection();
						isTrue = true;
						break;
				}
			}while(isTrue);
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			view.fileNotFound();
		}
	}
	/**
	* Create New Contact.
	*/
	public void addNewContact()
	{
		contacts.clear();
		contacts.add(new ContactModel());
		for(int i=0;i<contacts.size();i++)
		{
			if((contacts.get(i).getId())==0)
			{
				view.createNewContact(contacts.get(i));
			}
		}
			sqlReppo.insertContact(contacts);
			view.contactAddedMessage();
	}
	/**
	* Search a Contact.
	*/
	public void searchContact()
	{
		try
		{
			//boolean isTrue = false;
			String name = view.contactSearch();
			contacts.clear();
			contacts = sqlReppo.searchContact(name,contacts);
			//Pattern p = Pattern.compile(name);
			this.contactSearching();
			//contacts.clear();
			//contacts = fileReppo.readFromFile(contacts,fileReppo.contactFile);
			//view.contactHeading();
			view.displayAllContacts(contacts);
			// for(ContactModel test : contacts)
			// {
			// 	String splitObjectName = test.getName();
			// 	Matcher m = p.matcher(splitObjectName);
			// 	boolean isMatch = m.find();
			// 	if(isMatch)
			// 	{
			// 		view.contactData(test);
			// 		isTrue = true;
			// 	}
			// }
			// if(!isTrue)
			// {
			// 	view.noContactFoundMessage();
			// }
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			view.fileNotFound();
		}
	}
	/**
	* CRUD Operations.
	*/
	public void crudeOperation(ContactModel contact)
	{
		boolean isTrue = false;
		do
		{
			isTrue = false;
			int select = view.crudeOperations();
			switch(select)
			{
				case 1 :
					this.editContact(contact);
					break;
				case 2 :
					this.deleteContact(contact);
					break;
				case 3 :
					break;
				case 4 :
					System.exit(0);
					break;
				default :
					view.wrongSelection();
					isTrue = true;
					break;
			}
		}while(isTrue);
	}
	/**
	* For Edit a Contact.
	* @param contact that need to be edited.
	*/
	public void editContact(ContactModel contact)
	{
		boolean isTrue = false;
		do
		{
			isTrue = false;
			int select = view.editContact();
			switch(select)
			{
				case 1:
					this.editName(contact);
					break;
				case 2:
					this.editPhoneNumber(contact);
					break;
				default :
					view.wrongSelection();
					break;
			}
		}while(isTrue);
	}
	/**
	* For Edit Name.
	* @param contact that need to be edited.
	*/
	public void editName(ContactModel contact)
	{
		contact = view.enterName(contact);
		sqlReppo.updateContactName(contact);
	}
	/**
	* For Edit PhoneNumber.
	* @param contact that need to be edited.
	*/
	public void editPhoneNumber(ContactModel contact)
	{
		contact = view.enterPhoneNumber(contact);
		sqlReppo.updateContactNumber(contact);
	}
	/**
	* For Delete a Contact.
	* @param contact that need to be Deleted.
	*/
	public void deleteContact(ContactModel contact)
	{
		int index = contacts.indexOf(contact);
		contacts.remove(index);
		view.contactDeleteMessage();
		sqlReppo.deleteContact(contact);
	}
	/**
	* For Searching message.
	*/
	public void contactSearching()
	{
		try
		{
			System.out.print("Searching ");
			for(int i=0;i<3;i++)
			{
				Thread.sleep(400l);
				System.out.print(".");

			}
			System.out.println("");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}