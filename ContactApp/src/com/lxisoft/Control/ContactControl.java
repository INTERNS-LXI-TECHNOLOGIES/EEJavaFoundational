package com.lxisoft.Control;
import com.lxisoft.View.ContactView;
import com.lxisoft.Model.ContactModel;
import com.lxisoft.Repository.FileRepository;
import com.lxisoft.Repository.SqlRepository;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ContactControl
{
	ContactView view = new ContactView();
	ContactModel model = new ContactModel();
	//FileRepository filerepo = new FileRepository();
	SqlRepository sqlrepo = new SqlRepository();
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
					case 3: searchElements();isTest=true;break;			
					case 4: System.exit(0); break;	
					default: break;
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
			contacts = sqlrepo.readFromDatabase(contacts);
			//contacts=filerepo.readFromDatabase(contacts);
			view.displayAllContact(contacts);			
			int a=view.selectAContact();
			crudeOperation(contacts.get(a-1)); 	

		}
		catch(Exception e)
		{
			view.noContactFound();
		}
	}
	public void crudeOperation(ContactModel contact) 
	{
		boolean isCheck=false;
		do
		{
			isCheck=false;			
			view.displayAContact(contact);
			int c=view.contactDetails();
			switch(c)
			{
				case 1:editNewContact(contact);break;
				case 2:view.displayAllContact(contacts);isCheck=true;break;
				case 3:deleteContacts(contact);break;
				default: break;
			}
		}while(isCheck);
	}
	public void editNewContact(ContactModel contact)
	{
		boolean isTrue=false;
		do
		{
			isTrue=false;
		//	view.displayAllContact(contacts);
			//int i=view.editContact(contact);
			int i = view.editContactDetail();
			switch(i)
			{

				case 1: editNameDetail(contact);break;
				case 2: editPhoneNumberDetail(contact);break;
				default:view.invalidOption();break;
			}
		}while(isTrue);
	}		
	public void deleteContacts(ContactModel contact)
	{
		
		int index = contacts.indexOf(contact);
		sqlrepo.deleteQuery(contact);		
		contacts.remove(view.deleteContact());
		//filerepo.writeToFile(contacts);
	}	
	public void addNewContact()
	{
		contacts.clear();
		contacts.add(new ContactModel());
		for(int i=0;i<contacts.size();i++)
		{
			if(contacts.get(i).getId()==0)
			{
				view.addContactDetails(contacts.get(i));
			}
		}
		/*filerepo.appendFile(contacts);*/
		sqlrepo.createTable();	
		sqlrepo.writeToDatabase(contacts);
	}		
	public void editNameDetail(ContactModel contact)
	{
		
		contact=view.editName(contact);
		sqlrepo.updateContactName(contact);
		//filerepo.writeToDatabase(contacts);
	}
	public void editPhoneNumberDetail(ContactModel contact)
	{
		contact=view.editPhoneNumber(contact);
		sqlrepo.updateContactNumber(contact);
		//filerepo.writeToDatabase(contacts);
	}
	public void backToMenu()
	{
		view.selectYourChoice();
	}	
	public void searchElements()
	{
		try
		{
			boolean isTest = false;
			String name=view.searchElement();
			contacts.clear();
			Pattern p=Pattern.compile(name);			
		/*	contacts = filerepo.readFromDatabase(contacts);*/
			System.out.printf("%-20.30s %-20.30s %-20.30s%n","Contact ID","Contact Name","Phone Number");
			for(ContactModel t : contacts)
			{	
				String n=t.getName();
				Matcher m=p.matcher(n);	
				if(m.find())
				{
					System.out.printf("%-20.30s %-20.30s %-20.30s%n",t.getId(),t.getName(),t.getPhoneNumber());
					isTest=true;
				}				
			}	
			if(!isTest)
			{
				view.fileNotFound();
			}	
		}
		catch(Exception e)
		{
			e.printStackTrace();		
		
		}
	} 	
}
