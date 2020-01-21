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
		boolean test=false;
		do
		{
			test=false;
			int m=view.selectYourChoice();
			switch (m)
			{
				case 1:	addNewContact();test=true;break;
				case 2: test=true;break;				
				case 3: System.exit(0); break;	
			}
		}while(test);			
	}
	public void addNewContact()
	{
		boolean check=false;
		do
		{
			check=false;
			int c=view.contactDetails();
			switch(c)
			{
				case 1:view.addContact(contacts,filerepo);check=true;break;
				case 2:view.displayAllContact(contacts,filerepo);check=true;break;
			}
		}while(check);
	}
	// public void addToArraylist()
	// {
		
	// }
	// public void selectAllContact()
	// {

	// }
	// public void createNewContact()
	// {

	// }
	// public void updateContact()
	// {
		
	// }
}