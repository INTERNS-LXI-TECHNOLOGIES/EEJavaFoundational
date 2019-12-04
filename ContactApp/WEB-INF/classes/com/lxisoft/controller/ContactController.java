package com.lxisoft.controller;
import com.lxisoft.model.*;
import java.util.Scanner;
import java.util.*;
import com.lxisoft.repository.*;
import com.lxisoft.view.View;
import com.lxisoft.domain.*;
/**
 *controller class
 */
public class ContactController
{
	View view=new View();
	//Repository repository=new FileRepository();
	Repository repository=new DbRepository();
	/**
	 *to select features
	 */
	public void features()
	{
		while(true)
		{
			int option=view.optionsScaning();
			if(option==9)
				break;
			else
			{
				contactOptions(option);
				System.out.println("\n");
			}
		}
		System.out.println("\t\t\t\t THANK YOU");
	}
	/**
	 *to select contact operation
	 *@param option 
	 */
	public void contactOptions(int option)
	{
		switch(option)
		{
			case 1:saveContact();break;
			case 2:contactByName();break;
			case 3:contactById();break;
			case 4:contactSelect();break;
			case 5:contactSort();break;
			case 6:enhancedSearch();break;
			case 7:allContacts();break;
			case 8:repository.clear();break;
		}
	}
	/**
	 *for enhanced searching
	 */
	public void enhancedSearch()
	{
		ArrayList<Contact> contactList=repository.findAll();
		ArrayList<Contact> tempList=new ArrayList<Contact>();
		String word=view.enSearch();
		ViewAllModel tempModel=new ViewAllModel();
		for(Contact contact: contactList)
		{
			if(contact.getName().contains(word))
			{
				tempList.add(contact);
			}
		}
		tempModel.setList(tempList);
		view.findAllContacts(tempModel);
	}	
	/**
	 *to save contact
	 */
	public void saveContact()
	{
		String[] tempSave=view.save();
		Contact contact=new Contact();
		SaveModel saveModel=new SaveModel();
		if(tempSave[2].equals("y"))
		{
			System.out.println("-contact saved-");
			contact.setName(tempSave[0]);
			contact.setNumber(tempSave[1]);
			saveModel.setContact(contact);
			repository.save(saveModel.getContact());
		}
	}
	/**
	 *to sort all contact
	 */
	public void contactSort()
	{
		ArrayList<Contact> contactList=repository.findAll();	
		String option=view.sort();
		if(option.equals("i"))
		{
			Collections.sort(contactList,new IdSort()); 
		}
		else if(option.equals("n"))
		{
			Collections.sort(contactList,new NumberSort()); 
		}
		ViewAllModel temp=new ViewAllModel();
		temp.setList(contactList);
		view.findAllContacts(temp);
	}
	/**
	 *to get all contact
	 */
	public void allContacts()
	{
		ViewAllModel viewAllModel=new ViewAllModel();
		viewAllModel.setList(repository.findAll());
		view.findAllContacts(viewAllModel);
	}
	/**
	 *to get contact details by name
	 */
	public void contactByName()
	{
		String[] tempSearch=view.byName();
		Contact temp=new Contact();
		ViewByNameModel viewByName=new ViewByNameModel();
		viewByName.setList(repository.findAll());
		int i=0;
		if(tempSearch[1].equals("y"))
		{
			System.out.println("-search details-");
			for(Contact contact: viewByName.getList())
			{
				if(contact.getName().equals(tempSearch[0]))
				{
					i=1;
					view.printByName(contact);
					temp=contact;
				}
			}
		}
		if(i==1)
		{
			String ch=view.choose();
			contactChoose(temp,ch);
		}
		else
			view.noContact();
	}
	/**
	 *to get contact details by id
	 */
	public void contactById()
	{
		int i=0;
		String[] tempSearch=view.byId();
		ArrayList<Contact> contactList=repository.findAll();
		ViewByIdModel viewByIdModel=new ViewByIdModel();
		if(tempSearch[1].equals("y"))
		{
			System.out.println("-id search details-");
			for(Contact contact: contactList)
			{
				if(contact.getId().equals(tempSearch[0]))
				{
					i=1;
					viewByIdModel.setContact(contact);
					view.printByName(viewByIdModel.getContact());
				}
			}
		}
		if(i==1)
		{
			String ch=view.choose();
			contactChoose(viewByIdModel.getContact(),ch);
		}
		else
			view.noContact();
	}
	/**
	 *to choose contact operation
	 *@param contact
	 *@param ch
	 */
	public void contactChoose(Contact contact,String ch)
	{
		switch(ch)
		{
			case "e":editContact(contact);break;
			case "d":deleteContact(contact);break;
		}
	}
	/**
	 *to select contact
	 */
	public void contactSelect()
	{
		String name=view.select();
		Contact temp=new Contact();
		SelectModel selectModel=new SelectModel();
		selectModel.setList(repository.findAll());
		int i=0;
		System.out.println("-contact selected-");
		for(Contact contact: selectModel.getList())
		{
			if(contact.getName().equals(name))
			{
				i=1;
				view.printByName(contact);
				temp=contact;
			}
		}
		if(i==1)
		{
			String ch=view.choose();
			contactChoose(temp,ch);
		}
		else
			view.noContact();
	}
	/**
	 *to delete contact
	 *
	 *@param contact
	 */
	public void deleteContact(Contact contact)
	{
		DeleteModel deleteModel=new DeleteModel();
		deleteModel.setContact(contact);
		String del=view.delete();
		if(del.equals("y"))
		{
			repository.delete(deleteModel.getContact());
		}
	}
	/**
	 *to edit contact
	 *
	 *@param contact
	 */
	public void editContact(Contact contact)
	{
		ArrayList<Contact> contactList=repository.findAll();
		String[] tempEdit=view.edit();
		if(tempEdit[2].equals("y"))
		{
			EditModel editModel=new EditModel();
			editModel.setContact(contact);
			repository.edit(editModel,tempEdit);
		}
	}
}