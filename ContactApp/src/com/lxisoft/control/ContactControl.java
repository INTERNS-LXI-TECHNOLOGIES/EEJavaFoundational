package com.lxisoft.control;
import com.lxisoft.model.*;
import com.lxisoft.view.*;
import java.io.*;
import com.lxisoft.fileRepository.*;
import java.util.ArrayList;
public class ContactControl
{
	ArrayList<ContactModel>modelArray=new ArrayList<ContactModel>();
	ContactView view =new ContactView();
	FileRepository file= new FileRepository(); 
	public void controlView()
	{	
		int x=0;
		do{
		ArrayList<String>s=new ArrayList<String>();
		int c =view.display();
		switch(c)
		{
			case 1:s= view.addContacts();
				   getDetails(s);
				   break;
			case 2: displayContact();
					break;
			default: view.defaultText1();
		}
		x=view.defaultText3();
		}while(x==1);
	}
	public void readFromFile(File fileCopy)
	{
		modelArray.clear();
		modelArray = file.fromFile(fileCopy);
	}
	public void getDetails(ArrayList<String> s)
	{
			modelArray.add(new ContactModel());
			for(int i=0;i<modelArray.size();i++)
			{
				if(modelArray.get(i).getName()==null)
			{		
			 modelArray.get(i).setName(s.get(0));
			modelArray.get(i).setMob(Long.parseLong(s.get(1)));
			modelArray.get(i).setId(Integer.parseInt(s.get(2)));
			}
			}
			writeToFile(modelArray,true);

	}
	public void writeToFile(ArrayList<ContactModel> s,boolean a)
	{
		File fileCopy=file.toFile(s,a);
		readFromFile(fileCopy);
	}
	public void displayContact()
	{
		 if(file.newFile.exists())
		{
			 modelArray.clear();
			 modelArray=file.fromFile(file.newFile);
			view.displayContacts(modelArray);
			int c = view.selectName();
			editOrDelete(modelArray.get(c-1));
		}
		else
		{
			view.defaultText2();
		}
	}
	public void edit(ContactModel contact)
	{
		//int a=view.selectName();
		int c=view.editContact(contact);
		if(c==1)
		{
			 contact = view.editName(contact);
		}
		if(c==2)
		{
			contact =view.editMob(contact);
		}
		if(c==3)
		{
			contact = view.editId(contact);
		}
		writeToFile(modelArray,false);
	}
	public void delete()
	{
		int c=view.selectDelete();
		modelArray.remove(c-1);
		writeToFile(modelArray,false);
	}
	public void editOrDelete(ContactModel contact)
	{int x=0;
	do{
		int c = view.editOrDelete();
		switch(c)
		{
			case 1: edit(contact);
					break;
			case 2: delete();
					break;
			default: view.defaultText1();
		}
		x=view.defaultText4();
		}while(x==1);
	}
}