package com.lxisoft.Repository;
import com.lxisoft.Repository.*;
import com.lxisoft.Domain.*;
import com.lxisoft.View.*;
import com.lxisoft.Models.*;
import com.lxisoft.Controllers.*;
import java.io.*;
import java.util.*;
/**
*file repository class
*/
public class FileRepository implements Repository
{
	File file=new File(fileName);
	ArrayList<Contact> contacts =new ArrayList<Contact>();
	static int id=1;
	/**
	*method to write the contact details to file
	*@param contact contact to write
	*@param write indication for new contact/editing 
	*/
	public void writeNewContact(Contact contact,boolean write)
	{
		
		try
		{
			FileWriter bf=new FileWriter(file,true);
			if(write)
			{
				setId();
				bf.write(id+","+contact.getName()+","+contact.getNo()+"\n");
			}
			else
			{
				bf.write(contact.getId()+","+contact.getName()+","+contact.getNo()+"\n");
			}
			bf.flush();
			
		}
		catch(Exception e)
		{
			System.out.println("error1");
		}

	}
	/**
	*method to view all contact details in file
	*/
	public void viewAllContacts()
	{
		try
		{
			BufferedReader bf=new BufferedReader(new FileReader(file));
			String str=null;
			while((str=bf.readLine())!=null)
			{
				System.out.println(str);
			}
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
	}
	/**
	*method to get all contacts in an arraylist
	*@return return all contacts
	*/
	public ArrayList<Contact> getAllContacts()
	{
		try
		{
			FileWriter d=new FileWriter(file,true);
			BufferedReader bf=new BufferedReader(new FileReader(file));
			String str=null;
			Contact contact=null;
			contacts.clear();
			while((str=bf.readLine())!=null)
			{
				contact=new Contact();
				String[] strln=str.split(",",3);
				
				contact.setId((Integer.parseInt(strln[0])));
				contact.setName(strln[1]);
				contact.setNo(strln[2]);
				contacts.add(contact);
			}
		}
		catch(Exception e)
		{
			System.out.println("error2");
		}
		return contacts;
	}
	/**
	*method to get id from the last existing contact
	*@return return id
	*/
	public void setId()
	{
		try
		{
			id=0;
			BufferedReader bf=new BufferedReader(new FileReader(file));
			String str=null;
			while((str=bf.readLine())!=null)
			{
				
				String[] strln=str.split(",",2);
				int idtemp=Integer.parseInt(strln[0]);	
				if(idtemp>id)id=idtemp;
			}
			id++;
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
		
	}
	/**
	*method to edit a contact detail 
	*/
	public void editContact(Contact contact, int i)
	{
		contacts=getAllContacts();
		contacts.set(i,contact);
		clearAllContacts();
		resetFile();
	}
	/**
	*method for rewriting the conatcts to file
	*/
	public void resetFile()
	{ for(int i=0;i<contacts.size();i++)
		{
			writeNewContact(contacts.get(i),false);
		}
	}
	/**
	*method to delete a contact
	*/
	public void deleteContact(int i)
	{
		contacts=getAllContacts();
		contacts.remove(i);
		clearAllContacts();
		resetFile();
	}
	/**
	*method to clear the file
	*/
	public void clearAllContacts()
	{
		try
		{
			
			FileWriter fi=new FileWriter(file);
		}catch(Exception e)
		{
			System.out.println("error");
		}
	id=0;
	}
	public void sorting(ArrayList<Contact> contacts)
	{
		TreeSet <Contact> ts=new TreeSet <Contact>();
		for(Contact c : contacts)
		   ts.add(c);

		 // System.out.println(ts);
		clearAllContacts();
		for(Contact c : ts)
		   writeNewContact(c, false);
  	}
  	public void sortByName()
  	{
  		contacts=getAllContacts();
		Collections.sort(contacts, new SortByName());
		clearAllContacts();
		resetFile();

  	}
  	public void sortById()
  	{
  		contacts=getAllContacts();
		Collections.sort(contacts, new SortById());
		clearAllContacts();
		resetFile();

  	}
  	public void sortByNumber()
  	{
  		contacts=getAllContacts();
		Collections.sort(contacts, new SortByNumber());
		clearAllContacts();
		resetFile();

  	}

}