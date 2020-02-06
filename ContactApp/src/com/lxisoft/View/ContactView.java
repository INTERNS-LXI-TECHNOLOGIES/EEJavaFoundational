package com.lxisoft.View;
import java.util.*;
import com.lxisoft.Model.ContactModel;
import com.lxisoft.View.ContactView;
import com.lxisoft.Repository.FileRepository;
/**
	* This is View class to display all 
*/
public class ContactView
{
	static Scanner sc = new Scanner(System.in);	
	/**
		* This method for selecting a choice  
		* @return i variable for selecting a choice		
	*/
	public int selectYourChoice()
	{
		System.out.println("\n\t      Contact App");
		System.out.println("\n1.Contacts \n2.Create new Contact \n3.Search \n4.Exit");
		int i = sc.nextInt();
		return i;
	}
	/**
		* This method for selecting a contact 
		* @return a variable for selecting a contact		
	*/
	public int selectAContact()
	{
		System.out.println("Select a contact");
		int a=sc.nextInt();
		return a;
	}
	/**
		* This method for selecting a contact details  
		* @return a variable for selecting a choice		
	*/
	public int contactDetails()
	{
		System.out.println("Choose a option");
		System.out.println("\n1.Edit \n2.Delete \n3.Back");
		int a = sc.nextInt();
		return a;
	}	
	/**
		* This method for adding a contact
		* @return p variable for choose adding 		
	*/
	public int addToContact()
	{
		System.out.println("\n1.Add");
		int p=sc.nextInt();
		return p;
	}	
	/**
		* This method for adding details to contact
		* @return contact variable after set details
		* @param contact variable for add detail to contact
	*/
	public ContactModel addContactDetails(ContactModel contact)
	{		
		/* System.out.println("Contact id");
		 contact.setId(sc.nextInt());*/
		System.out.println("Enter contact name");
		contact.setName(sc.nextLine());
		contact.setName(sc.nextLine()); 
		System.out.println("Phone number");
		contact.setPhoneNumber(sc.nextLong());
		return contact;		        	
	}
	/**
		* This method used to display all contact
		* @param contacts to display display all contact 
	*/
	public void displayAllContact(ArrayList<ContactModel> contacts)
	{
		try
		{
			System.out.println("\n  Contacts are...\n");
			System.out.printf("%-20.30s %-20.30s%n","Contact Name","Phone Number");
			Collections.sort(contacts);
			for(int i=0; i<contacts.size(); i++)
			{	
				System.out.printf("%-20.30s %-20.30s%n",contacts.get(i).getName(),contacts.get(i).getPhoneNumber());
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	/**
		* This method to select edit contact
		* @param contact to edit contact
		* @return s to edit contact
	*/
	public int editContact(ContactModel contact)
	{
		System.out.println("Which contact you want to edit");
		int s=sc.nextInt();
		return s;
	}
	/**
		* This method to choose name or number want to edit 
		* @return e to choose what edit 
	*/
	public int editContactDetail()
	{
		System.out.println("What you want to edit");
		System.out.println("\n1.Name \n2.PhoneNumber");
		int e=sc.nextInt();
		return e;
	}
	/**	
		* This method to choose edit name
		* @return contact to edit contact name
		* @param contact to edit contact name 
	*/
	public ContactModel editName(ContactModel contact)
	{
		System.out.println("Enter your name");
		contact.setName(sc.nextLine());
		contact.setName(sc.nextLine());
		return contact;
	}
	/**	
		* This method to choose edit phone number
		* @return contact to edit contact phone number
		* @param contact to edit contact phone number 
	*/
	public ContactModel editPhoneNumber(ContactModel contact)
	{
		System.out.println("Enter phone number");
		contact.setPhoneNumber(sc.nextLong());
		return contact;
	}
	/**
		* This method to delete contact
		* @return e-1 to delete contact 
	*/
	public int deleteContact()
	{
		System.out.println("Which contact want to delete");
		int e=sc.nextInt();
		return e-1;
	}
	/**
		* This method to exit contact
		
	*/	
	public void contactExist()
	{
		System.out.println("Contact exist");
	}
	/**
		* This method to search element
		* @return m to choose search element 
	*/
	public String searchElement()
	{
		System.out.println("Enter your search");
		String m=sc.next();
		return m;
	}
	/**
		* This method to display a contact
	*/
	public void displayAContact(ContactModel contact)
	{
		System.out.println("Contact is");
		System.out.println(contact.getId());
		System.out.println(contact.getName());
		System.out.println(contact.getPhoneNumber());		
	}
	/**
		* This method for display invalid message
	*/
	public void invalidOption()
	{
		System.out.println("Invalid option");
	}
	/**
		* This method for display no contact found message
	*/
	public void noContactFound()
	{
		System.out.println("No Contact Found");
	}
	/**
		* This method for display file not found
	*/
	public void fileNotFound()
	{
		System.out.println("File not found");
	}
	/**
		* This method to display delete message
	*/
	public void deleteMessage()
	{
		System.out.println("Contact Deleted");
	}

}

		
		
		