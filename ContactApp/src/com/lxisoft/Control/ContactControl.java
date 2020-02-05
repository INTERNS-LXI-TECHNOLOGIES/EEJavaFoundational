package com.lxisoft.Control;
import com.lxisoft.View.ContactView;
import com.lxisoft.Model.ContactModel;
import com.lxisoft.Repository.FileRepository;
import com.lxisoft.Repository.SqlRepository;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
	* This is a Control class here all control logics
*/
public class ContactControl
{

	ContactView view = new ContactView();
	ContactModel model = new ContactModel();
	//FileRepository filerepo = new FileRepository();
	SqlRepository sqlrepo = new SqlRepository();
	ArrayList<ContactModel> contacts = new ArrayList<ContactModel>();
	/**
		* This method for selecting options when entering the app
	*/
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
					case 1:	contact();isTest=true;break;
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
	/**
		This method to select a contact 
	*/	
	public void contact()
	{
		try
		{
			contacts.clear();						  
			contacts = sqlrepo.readFromDatabase(contacts);
			//contacts=filerepo.readFromDatabase(contacts);
			view.displayAllContact(contacts);			
			int a=view.selectAContact();
			crudOperation(contacts.get(a-1)); 	

		}
		catch(Exception e)
		{
			view.noContactFound();
		}
	}
	/**
		* This method is use for crud operation
		* @param contact variable for crud 
	*/
	public void crudOperation(ContactModel contact) 
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
	/**
		*This method to edit a contact
		*@param contact variable to edit contact
	*/
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
	/**
		* This method to delete a contact
		* @param contact variable to delete a contact
	*/	
	public void deleteContacts(ContactModel contact)
	{
		
		int index = contacts.indexOf(contact);
		sqlrepo.deleteQuery(contact);		
		contacts.remove(view.deleteContact());
		//filerepo.writeToFile(contacts);
	}	
	/**
		* This method to add new contact
	*/
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
	/**
	 	* This method to edit contact name
	 	* @param contact variable to edit a contact name 
	*/	
	public void editNameDetail(ContactModel contact)
	{
		
		contact=view.editName(contact);
		sqlrepo.updateContactName(contact);
		//filerepo.writeToDatabase(contacts);
	}
	/**
		* This method to edit contact number 
		* @param contact variable to edit contact number
	*/
	public void editPhoneNumberDetail(ContactModel contact)
	{
		contact=view.editPhoneNumber(contact);
		sqlrepo.updateContactNumber(contact);
		//filerepo.writeToDatabase(contacts);
	}
	/**
		*This method to back to menu
	*/
	public void backToMenu()
	{
		view.selectYourChoice();
	}	
	/**
	 	*This method to search contacts
	*/
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
