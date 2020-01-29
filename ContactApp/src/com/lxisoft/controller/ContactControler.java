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
	ArrayList<ContactModel> contacts = new ArrayList<ContactModel>();
	FileRepository fileReppo = new FileRepository();
	ContactView view = new ContactView();
	public void displayOrAddContact()
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
					this.contacts();
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
	public void contacts()
	{
		try
		{
			contacts.clear();
			contacts = fileReppo.readFromFile(contacts,fileReppo.contactFile);
			view.displayAllContacts(contacts);
			boolean isTrue = false;
			do
			{
				isTrue = false;
				int select = view.contactOperations();
				switch(select)
				{
					case 1 :
						int selectedContact = view.selectContact();
						view.viewContact(contacts.get(selectedContact-1));
						this.crudeOperation(contacts.get(selectedContact-1),selectedContact-1);
						break;
					case 2 :
						isTrue = false;
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
			fileReppo.writeToFileWithoutOverriding(contacts);
			view.contactAddedMessage();
	}
	public void searchContact()
	{
		try
		{
			boolean isTrue = false;
			String name = view.contactSearch();
			Pattern p = Pattern.compile(name);
			this.contactSearching();
			contacts.clear();
			contacts = fileReppo.readFromFile(contacts,fileReppo.contactFile);
			view.contactHeading();
			for(ContactModel test : contacts)
			{
				String splitObjectName = test.getName(); 
				Matcher m = p.matcher(splitObjectName);
				boolean isMatch = m.find();
				if(isMatch)
				{
					view.contactData(test);
					isTrue = true;
				}
			}
			if(!isTrue)
			{
				view.noContactFoundMessage();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void crudeOperation(ContactModel contact,int selectedContact)
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
					this.deleteContact(selectedContact);
					break;
				case 3 :
					isTrue = false;
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
	public void editName(ContactModel contact)
	{
		contact = view.enterName(contact);
		fileReppo.writeToFile(contacts);
	}
	public void editPhoneNumber(ContactModel contact)
	{
		contact = view.enterPhoneNumber(contact);
		fileReppo.writeToFile(contacts);
	}
	public void deleteContact(int selectedContact)
	{
		contacts.remove(selectedContact);
		view.contactDeleteMessage();
		fileReppo.writeToFile(contacts);
	}
	public void contactSearching()
	{
		try
		{
			System.out.print("Searching ");
			for(int i=0;i<3;i++)
			{
				Thread.sleep(600l);
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