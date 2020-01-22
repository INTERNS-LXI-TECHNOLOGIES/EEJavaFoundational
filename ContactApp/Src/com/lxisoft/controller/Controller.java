package com.lxisoft.controller;
import java.util.Scanner;
import com.lxisoft.view.*;
import com.lxisoft.contact.Contact;
import com.lxisoft.filerepository.Filerepository;
public class Controller
{
	public void activities()
	{
		View view=new View();
		view.display();
	}
	public void displayContacts()
	{
		
	}
	public void createNewContact()
	{
		Contact contact=new Contact();
		Filerepository filerepository=new Filerepository();
		Scanner scr=new Scanner(System.in);
        System.out.println("write name :");
        String name=scr.next();
        System.out.println("write number :");
        String number=scr.next();
        contact.setName(name);
        contact.setNumber(number);
        filerepository.writeFile(contact);
	}
	public void selectContact()
	{
		
	}
	

}