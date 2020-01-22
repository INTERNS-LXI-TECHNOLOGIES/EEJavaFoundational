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
					this.selectAllContact();
					isTrue = true;
					break;
				case 2:
					this.addNewContact();
					isTrue = true;
					break;
				default :
					view.wrongSelection();
					break;
			}
		}while(isTrue);
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
		}
		catch(Exception e)
		{
			e.printStackTrace();
			view.fileNotFound();
		}
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