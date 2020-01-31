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
	FileRepository filerepo = new FileRepository();
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
					default:;break;
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
			contacts = sqlrepo.readFromTable(contacts);
			//contacts=filerepo.readFromFile(contacts);
			view.displayAllContact(contacts);
			editDelete(); 	
		}
		catch(Exception e)
		{
			view.noContactFound();
			//e.printStackTrace();							
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
		contacts.clear();
		contacts.add(new ContactModel());
		for(int i=0;i<contacts.size();i++)
		{
			if(contacts.get(i).getId()==0)
			{
				view.addContactDetails(contacts.get(i));
			}
		}
		filerepo.appendFile(contacts);
		sqlrepo.createTable();	
		sqlrepo.insertDataToTable(contacts);
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
		//contacts.remove(view.deleteContact());
		sqlrepo.deleteQuery();
		//filerepo.writeToFile(contacts);

	}
	public void searchContacts()
	{
		try
		{
			String n=view.searchContact();
			contacts.clear();
			contacts=filerepo.readFromFile(contacts);
			for(int i=0;i<contacts.size();i++)
			{
				if(n.equals(contacts.get(i).getName())) 
				{
					view.contactExist();
					System.out.println(contacts.get(i).getName());		
					System.out.println(contacts.get(i).getPhoneNumber());
				}				
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}	
	} 
	public void searchElements()
	{
		try
		{
			boolean isTest = false;
			String name=view.searchElement();
			contacts.clear();
			Pattern p=Pattern.compile(name);			
			contacts = filerepo.readFromFile(contacts);
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