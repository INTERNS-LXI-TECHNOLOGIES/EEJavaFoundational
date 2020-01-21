package com.lxisoft.controller;
import com.lxisoft.view.ContactView;
import com.lxisoft.model.ContactModel;
import java.util.*;
public class ContactControler
{
	ArrayList<ContactModel> contacts = new ArrayList<ContactModel>();
	//FileRepository fileReppo = new FileRepository();
	ContactView view = new ContactView();
	// public void selectAllContact()
	// {
		
	// }
	public void displayOrAddContact()
	{
		boolean isTrue = false;
		do
		{
			isTrue = false;
			int select = view.selectOption();
			switch(select)
			{
				case 1:
					view.displayAllContacts(contacts);
					isTrue = true;
					break;
				case 2:
					this.addNewContact();
					isTrue = true;
					break;
				default :
					System.out.println("Select options From Above");
					break;
			}
		}while(isTrue);
	}
	public void addNewContact()
	{
		int iD=0;String name="";Long phoneNumber=0l;
		contacts.add(new ContactModel());
		view.createNewContact(iD,name,phoneNumber);
		for(int i=0;i<contacts.size();i++)
		{
			if((contacts.get(i).getId())==0)
			{
				contacts.get(i).setId(iD);
				contacts.get(i).setName(name);
				contacts.get(i).setPhoneNumber(phoneNumber);
			}
		}
		view.displayAllContacts(contacts);
	}
}