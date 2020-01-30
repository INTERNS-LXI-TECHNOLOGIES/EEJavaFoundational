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
			case 3: edit();
					break;
			default: view.defaultText1();
		}
		x=view.defaultText3();
		}while(x==1);
	}
	public void readFromFile(File fileCopy)
	{
		ArrayList<ContactModel> reader= file.fromFile(fileCopy);
	}
	public void getDetails(ArrayList<String> s)
	{
			modelArray.add(new ContactModel());
			for(int i=0;i<modelArray.size();i++)
			{
			// String name=s.get(0);
			// long mob= Long.parseLong(s.get(1));
			// int id= Integer.parseInt(s.get(2));
			 modelArray.get(i).setName(s.get(0));
			modelArray.get(i).setMob(Long.parseLong(s.get(1)));
			modelArray.get(i).setId(Integer.parseInt(s.get(2)));
			writeToFile(modelArray);
			}
	}
	public void writeToFile(ArrayList<ContactModel> s)
	{
		File fileCopy=file.toFile(s);
		readFromFile(fileCopy);
	}
	public void displayContact()
	{
		 if(file.newFile.exists())
		{
			 ArrayList<ContactModel> d=file.fromFile(file.newFile);
			view.displayContacts(d);
		}
		else
		{
			view.defaultText2();
		}
	}
	public void edit()
	{
		displayContact();
		int a=view.selectName();
		//view.editContact(modelArray.get(a-1));
	 	System.out.println("modelArray size"+modelArray.size());
	}
}