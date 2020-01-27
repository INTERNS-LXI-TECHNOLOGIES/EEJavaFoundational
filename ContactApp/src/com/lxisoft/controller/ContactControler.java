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
		String[] data = view.createNewContact();
		contacts.add(new ContactModel());
		for(int i=0;i<contacts.size();i++)
		{
			if((contacts.get(i).getId())==0)
			{
				contacts.get(i).setId(Integer.parseInt(data[0]));
				contacts.get(i).setName(data[1]);
				contacts.get(i).setPhoneNumber(Long.parseLong(data[2]));
			}
		}
			fileReppo.writeToFileWithoutOverriding(contacts);
			view.contactAddedMessage();
	}
	public void searchContact()
	{
		try
		{
			String name = view.contactSearch();
			contacts.clear();
			contacts = fileReppo.readFromFile(contacts,fileReppo.contactFile);
			for(int i=0;i<contacts.size();i++)
			{
				if(name.equals(contacts.get(i).getName()))
				{
					///// not completed...
					//System.out.println("Contact Found");
					view.viewContact(contacts.get(i));
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			view.fileNotFound();
		}
	}
	public void crudeOperation(ContactModel contact,int selectedContact)
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
		String name = view.enterName();
		contact.setName(name);
		fileReppo.writeToFile(contacts);
	}
	public void editPhoneNumber(ContactModel contact)
	{
		Long phoneNumber = view.enterPhoneNumber();
		contact.setPhoneNumber(phoneNumber);
		fileReppo.writeToFile(contacts);
	}
	public void deleteContact(int selectedContact)
	{
		contacts.remove(selectedContact);
		view.contactDeleteMessage();
		fileReppo.writeToFile(contacts);
	}
}