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
					case 2: createNewContact();isTest=true;break;				
					case 3: System.exit(0); break;	
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
			//editDelete(contact);
		}
		catch(Exception e)
		{
			System.out.println("No Contacts Found");
			e.printStackTrace();
			//editDelete(contact);
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
				case 1:editNewContact();isCheck=true;break;
				case 2:view.displayAllContact(contacts);isCheck=true;break;
				case 3:   break;
				case 4:backToMenu();isCheck=true;break;
			}
		}while(isCheck);
	}
	public void createNewContact()
	{
		contacts.add(new ContactModel());
		int s=view.addToContact();
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
	// public void editNewContact()
	// {
	// 	boolean isTrue=false;
	// 	do
	// 	{
	// 		isTrue=false;
	// 		int i=view.editContact(contacts);
	// 		switch(i)
	// 		{
	// 			case 1: view.editContactDetail();isTrue=true;break;
	// 		}
	// 	}while(isTrue);
	// }		
	// public void editNameDetail(ContactModel contact)
	// {
	// 	String a=view.editName();
	// 	contact.setName(a);
	// 	filerepo.writeToFile(contacts);
	// }
	// public void editPhoneNumberDetail(ContactModel contact)
	// {
	// 	Long i=view.editPhoneNumber();
	// 	contact.setPhoneNumber(i);
	// 	filerepo.writeToFile(contacts);
	// }
	// public void backToMenu()
	// {
	// 	view.selectYourChoice();
	// }	
	public void editNewContact()
	{
		boolean isTrue=false;
		do
		{
			isTrue=false;
			int i=view.editContact(contacts);
			int k=view.editContactDetail();
			switch(k)
			{
				case 1: editNameDetail(contacts.get(i-1));isTrue=true;break;
				case 2: editPhoneNumberDetail(contacts.get(i-1));isTrue=true;break;
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
}