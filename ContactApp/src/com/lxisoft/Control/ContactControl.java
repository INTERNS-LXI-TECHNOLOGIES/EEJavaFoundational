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
		boolean isTest=false;
		do
		{
			isTest=false;
			int m=view.selectYourChoice();
			switch (m)
			{
				case 1:	selectAllContact();isTest=true;break;
				case 2: isTest=true;break;				
				case 3: System.exit(0); break;	
			}
		}while(isTest);			
	}	
	public void selectAllContact()
	{
		try
		{
			contacts.clear();
			contacts=filerepo.readFromFile(contacts);
			view.displayAllContact(contacts);	
			addNewContact();
		}
		catch(Exception e)
		{
			System.out.println("No Contacts Found");
		}
	}	
	public void addNewContact() 
	{
		boolean isCheck=false;
		do
		{
			isCheck=false;
			int c=view.contactDetails();
			switch(c)
			{
				case 1:createNewContact();isCheck=true;break;
				case 2:;isCheck=true;break;
				case 3:view.editContact(contacts,filerepo);isCheck=true;break;
			}
		}while(isCheck);
	}
	public void createNewContact()
	{
		contacts.add(new ContactModel());
		String[] d=view.addContactDetails();
		for(int i=0;i<contacts.size();i++)
		{
			if(contacts.get(i).getId()==0)
			{
				contacts.get(i).setId(Integer.parseInt(d[0]));
				contacts.get(i).setName(d[1]);
				contacts.get(i).setPhoneNumber(Long.parseLong(d[2]));
			}
		}
		filerepo.writeToFile(contacts);	
	}
	public void editNewContact()
	{
		int c=view.editContact(contacts,filerepo);
		for(int j=0;j<contacts.size();j++)
		{
			if((contacts.get(j).getId())==c)
		 	{
		 		view.editContactDetail();		 		
		 	}
		}	
	}
	// 
	// public void updateContact()
	// {
		
	// }
}