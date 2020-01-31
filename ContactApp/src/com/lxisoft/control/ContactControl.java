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
		ArrayList<ContactModel> reader= file.fromFile(fileCopy);
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
			writeToFile(modelArray);

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
			 modelArray.clear();
			 modelArray=file.fromFile(file.newFile);
			int c= view.displayContacts(modelArray);
			editOrDelete(c);
		}
		else
		{
			view.defaultText2();
		}
	}
	public void edit()
	{
		int a=view.selectName();
		int c=view.editContact(modelArray.get(a-1));
		if(c==1)
		{
			String s=view.editName();
			 modelArray.get(a-1).setName(s);
		}
		if(c==2)
		{
			long l=view.editMob();
			 modelArray.get(a-1).setMob(l);
		}
		if(c==3)
		{
			int i=view.editId();
			modelArray.get(a-1).setId(i);
		}
		writeToFile(modelArray);
	}
	public void editOrDelete(int c)
	{int x=0;
	do{
		switch(c)
		{
			case 1: edit();
					break;
			default: view.defaultText1();
		}
		x=view.defaultText4();
		}while(x==1);
	}
}