package com.lxisoft.control;
import com.lxisoft.model.*;
import com.lxisoft.repository.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import java.util.List;
import java.util.ArrayList;
public class Control
{
	Contact contact = new Contact();
	ContactRepository contactrepo = new ContactRepository();
    public void delete(String name)
     {
      contactrepo.deleteRecord(name);  
     }
	public void addContact(String name,String lastname,String number,String email)
	{
	   contact.setFirstName(name);
	   contact.setLastName(lastname);
	   contact.setNumber(number);
	   contact.setMailId(email); 
	   contactrepo.addToDatabase(contact);
	}
	public void searchContact(String name)
	{
		contactrepo.searchDatabase(name);
	}
	public void viewContact(Contact contact)
	{
		contactrepo.viewDatabase(contact);
	}
}