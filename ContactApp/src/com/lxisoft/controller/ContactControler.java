package com.lxisoft.controller;
import com.lxisoft.view.ContactView;
import com.lxisoft.model.ContactModel;
import com.lxisoft.FileRepository.FileRepository;
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
					//this.selectAllContact();
					isTrue = true;
					break;
				case 2:
					this.addNewContact();
					isTrue = true;
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
						this.crudeOperation(contacts.get(selectedContact-1));
//call crude Operations....
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
			e.printStackTrace();
			view.fileNotFound();
		}
	}
	public void addNewContact()
	{
		contacts.add(new ContactModel());
		String[] data = view.createNewContact();
		for(int i=0;i<contacts.size();i++)
		{
			if((contacts.get(i).getId())==0)
			{
				contacts.get(i).setId(Integer.parseInt(data[0]));
				contacts.get(i).setName(data[1]);
				contacts.get(i).setPhoneNumber(Long.parseLong(data[2]));
			}
		}
		fileReppo.writeToFile(contacts);
	}
	public void selectAllContact()
	{
		try
		{
			contacts.clear();
			contacts = fileReppo.readFromFile(contacts,fileReppo.contactFile);
			view.displayAllContacts(contacts);
			int select = view.contactOperations();
			view.viewContact(contacts.get(select-1));
			this.crudeOperation(contacts.get(select-1));
		}
		catch(Exception e)
		{
			e.printStackTrace();
			view.fileNotFound();
		}
	}
	public void crudeOperation(ContactModel contact)
	{
	// refactor this method....
		boolean isTrue = false;
		do
		{
			isTrue = false;
			int select = view.crudeOperations();
			switch(select)
			{
				case 1 :
					this.editContact(contact);
					//isTrue = true;
					break;
				case 2 :
					this.deleteContact();
					//isTrue = true;
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
	public void editContact(ContactModel contact)
	{
		boolean isTrue = false;
		do
		{
			isTrue = false;
			//int selectedContact = view.selectContact();
			//view.viewContact(contact);
			int select = view.editContact();
			switch(select)
			{
				case 1:
					this.editName(contact);
// Sort ArryList....
					//Collections.sort(contacts);
					fileReppo.writeToFile(contacts);
					break;
				case 2:
					this.editPhoneNumber(contact);
					fileReppo.writeToFile(contacts);
					break;
				default :
					view.wrongSelection();
					break;
			}
		}while(isTrue);
		
	}
	public void editName(ContactModel contact)
	{
		String name = view.enterName();
		contact.setName(name);
		//contacts.add(contact);
	}
	public void editPhoneNumber(ContactModel contact)
	{
		Long phoneNumber = view.enterPhoneNumber();
		contact.setPhoneNumber(phoneNumber);
		//contacts.add(contact);
	}
	public void deleteContact()
	{

	}
	public void selectContact()
	{
		try
		{

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}