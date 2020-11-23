package com.lxisoft.control;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import com.lxisoft.modal.*;
import com.lxisoft.view.*;
import com.lxisoft.repository.*;



public class Control
{
	public ArrayList<Contact> contact=new ArrayList<Contact>();
						AddressBook addressbook=new AddressBook();


	public void addMenu()
	{
		contact.add(new Contact());
		contact.get(0).setName("Aaron");
		contact.get(0).setEmail("aaron@lximail.com");
		contact.get(0).setNumber(9893409);

		contact.add(new Contact());
		contact.get(1).setName("Abhi");
		contact.get(1).setEmail("abhi@lximail.com");
		contact.get(1).setNumber(9087654);

		contact.add(new Contact());
		contact.get(2).setName("Akshay");
		contact.get(2).setEmail("akshay@lximail.com");
		contact.get(2).setNumber(9086341);

		contact.add(new Contact());
		contact.get(3).setName("Amal");
		contact.get(3).setEmail("amal@lximail.com");
		contact.get(3).setNumber(9087892);

		contact.add(new Contact());
		contact.get(4).setName("Ashish");
		contact.get(4).setEmail("ashish@lximail.com");
		contact.get(4).setNumber(9087687);

		contact.add(new Contact());
		contact.get(5).setName("Aswin");
		contact.get(5).setEmail("aswin@lximail.com");
		contact.get(5).setNumber(9789032);

		contact.add(new Contact());
		contact.get(6).setName("Febin");
		contact.get(6).setEmail("febin@lximail.com");
		contact.get(6).setNumber(4567856);

		contact.add(new Contact());
		contact.get(7).setName("Gokul");
		contact.get(7).setEmail("gokul@lximail.com");
		contact.get(7).setNumber(9009097);

		contact.add(new Contact());
		contact.get(8).setName("Jose");
		contact.get(8).setEmail("jose@lximail.com");
		contact.get(8).setNumber(9087916);

		contact.add(new Contact());
		contact.get(9).setName("Karthik");
		contact.get(9).setEmail("karthik@lximail.com");
		contact.get(9).setNumber(6789785);

	}
	
	public void userControl(int choice)
	{	
			

	
			
	
		if(choice==1)
		{
									ContactApp contactapp=new ContactApp();

			contactapp.display(contact);
		}
		else if(choice==2)
		{
		for(int i=0;i<10;i++)
		{
		addressbook.addToDatabase(contact.get(i));
		}
						addressbook.database(contact);
						//						addressbook.databaseConnection();


		}
		else if(choice==3)
		{
		for(int i=0;i<10;i++)
		{
		addressbook.addToDatabase(contact.get(i));
		}
		
								//addressbook.database(contact);
						addressbook.delete(contact);


	

		

	
}
}
}