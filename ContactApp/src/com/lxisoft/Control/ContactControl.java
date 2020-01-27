package com.lxisoft.Control;
import com.lxisoft.View.ContactView;
import com.lxisoft.Model.ContactModel;
import com.lxisoft.Repository.FileRepository;
import java.util.Scanner;
import java.util.ArrayList;
public class ContactControl
{
	ContactView view = new ContactView();
	ContactModel model = new ContactModel();
	FileRepository filerepo = new FileRepository();
	ArrayList<ContactModel> contacts = new ArrayList<ContactModel>();
	public void contactMenu()
	{
		try
		{
			boolean isTest=false;
			do
			{
				isTest=false;
				int m=view.selectYourChoice();
				switch (m)
				{
					case 1:	selectAllContact();isTest=true;break;
					case 2: addNewContact();isTest=true;break;				
					case 3: System.exit(0); break;	
					default: view.invalidOption();break;
				}
			}while(isTest);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}			
	}	
	public void selectAllContact()
	{
		try
		{
			contacts.clear();
			contacts=filerepo.readFromFile(contacts);
			view.displayAllContact(contacts);
			editDelete(); 	
		}
		catch(Exception e)
		{
			view.noContactFound();							
		}
	}	
	public void editDelete() 
	{
		boolean isCheck=false;
		do
		{
			isCheck=false;
			int c=view.contactDetails();
			switch(c)
			{
				case 1:editNewContact();break;
				case 2:view.displayAllContact(contacts);isCheck=true;break;
				case 3:deleteContacts();break;
				case 4:searchContacts();break;
				default:view.invalidOption(); break;
			}
		}while(isCheck);
	}
	public void addNewContact()
	{
		String[] d=view.addContactDetails();
		contacts.add(new ContactModel());
		for(int i=0;i<contacts.size();i++)
		{
			if(contacts.get(i).getId()==0)
			{
				contacts.get(i).setId(Integer.parseInt(d[0]));
				contacts.get(i).setName(d[1]);
				contacts.get(i).setPhoneNumber(Long.parseLong(d[2]));
			}
		}
		filerepo.appendFile(contacts);	
	}			
	public void editNewContact()
	{
		boolean isTrue=false;
		do
		{
			isTrue=false;
			view.displayAllContact(contacts);
			int i=view.editContact(contacts);
			view.editContactDetail();
			switch(i)
			{
				case 1: editNameDetail(contacts.get(i-1));break;
				case 2: editPhoneNumberDetail(contacts.get(i-1));break;
				default:view.invalidOption();break;
			}
		}while(isTrue);
	}		
	
	public void editNameDetail(ContactModel contact)
	{
		String a=view.editName();
		contact.setName(a);
		filerepo.writeToFile(contacts);
	}
	public void editPhoneNumberDetail(ContactModel contact)
	{
		Long i=view.editPhoneNumber();
		contact.setPhoneNumber(i);
		filerepo.writeToFile(contacts);
	}
	public void backToMenu()
	{
		view.selectYourChoice();
	}	
	public void deleteContacts()
	{
		contacts.remove(view.deleteContact());
		filerepo.writeToFile(contacts);
	}
	public void searchContacts()
	{
		view.searchContact();
	} 
}