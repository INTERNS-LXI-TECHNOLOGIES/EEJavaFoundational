package com.lxisoft.repository;
import java.io.*;
import com.lxisoft.model.*;
import com.lxisoft.domain.*;
import java.util.*;
import com.lxisoft.repository.*;

public class FileRepository implements Repository
{
	File file=new File("C:\\Users\\kpmuh\\Desktop\\java\\github\\CoreJavaFoundational\\ContactApp\\src\\com\\lxisoft\\repository\\Contactlist.csv");
	/**
	 *to save contact
	 *
	 *@param contact saving one contact
	 */
	public void save(Contact contact)
	{
		int id=index();
		++id;
		try
		{
			if(file.exists())
			{
				FileWriter fw1=new FileWriter(file,true);
				BufferedWriter bw1=new BufferedWriter(fw1);
				bw1.write(id+","+contact.getName()+","+contact.getNumber()+"\n");
				bw1.flush();
				bw1.close();
			}
			else
			{
				System.out.println("\nfile created and contact saved");
				FileWriter fw=new FileWriter(file);
				BufferedWriter bw=new BufferedWriter(fw);
				System.out.println("NEW FILE CREATED");
				bw.write(id+","+contact.getName()+","+contact.getNumber()+"\n");
				bw.flush();
				bw.close();
			}
		}
		catch(IOException e)
		{
			System.out.println("Exception: "+e);
		}
	}
	/**
	 *to get last index
	 *
	 *@return integer
	 */
	public int index()
	{
		ArrayList<Contact> contactList=findAll();
		if(file.exists())
		{
			int n=0,x;
			for(int i=0;i<contactList.size();i++)
			{
				x=Integer.parseInt(contactList.get(i).getId());
				if(n<x)
					n=x;
			}
			return n;
		}
		else
		{
			return 0;
		}
	}
	/**
	 *to edit contact
	 *
	 *@param editModel object of edit model class
	 *@param tempEdit update value
	 *@return arraylist
	 */
	public void edit(EditModel editModel,String[] tempEdit)
	{
		ArrayList<Contact> contactList=findAll();
		for(int i=0;i<contactList.size();i++)
		{
			if(contactList.get(i).getName().equals(editModel.getContact().getName()))
			{
				System.out.println("updating conatact "+editModel.getContact().getName());
				editModel.getContact().setName(tempEdit[0]);
				editModel.getContact().setNumber(tempEdit[1]);
				contactList.set(i,editModel.getContact());
			}
		}
		syncFile(contactList);
	}
	/**
	 *to find all contacts
	 *
	 *@return arraylist
	 */
	public ArrayList<Contact> findAll()
	{
		ArrayList<Contact> contactList=new ArrayList<Contact>();
		Set<Contact> contactsSet=new TreeSet<Contact>();
		try
		{
			if(file.exists())
			{
				FileReader fr=new FileReader(file);
				BufferedReader  br=new BufferedReader(fr);
				String details;
				while((details=br.readLine())!=null)
				{
					String[] data=details.split(",");
					Contact contact=new Contact();
					contact.setId(data[0]);
					contact.setName(data[1]);
					contact.setNumber(data[2]);
					contactsSet.add(contact);
				}
				contactList.addAll(contactsSet);
				br.close();
			}
			else
				System.out.println("\nfile not present");
		}
		catch(IOException e)
		{
			System.out.println("Exception: "+e);
		}
		return contactList;
	}	
	/**
	 *to delete contact
	 *
	 *@param contact contact to delete
	 *@return updated arraylist
	 */
	public void delete(Contact contact)
	{
		ArrayList<Contact> contactList=findAll();
		for(int i=0;i<contactList.size();i++)
		{
			if(contactList.get(i).getName().equals(contact.getName()))
			{
				System.out.println("deleting conatact "+contactList.get(i).getName());
				contactList.remove(i);
			}
		}
		syncFile(contactList);
	} 
	/**
	 *to synchronise file with arraylist
	 *
	 *@param contact
	 *@param i to delete file for saving entire arraylist after updation
	 */
	public void syncFile(ArrayList<Contact> contactList)
	{
		try
		{
			int i=0;
			for(Contact contact: contactList)
			{
				if(i==0)
				{
					file.delete();
				}
				FileWriter fwr1=new FileWriter(file,true);
				BufferedWriter bw1=new BufferedWriter(fwr1);
				bw1.write(contact.getId()+","+contact.getName()+","+contact.getNumber()+"\n");
				bw1.flush();
				bw1.close();
				i++;		
			}
		}
		catch(IOException e)
		{
			System.out.println("Exception: "+e);
		}
	}

	public void clear()
	{
		try
		{	
			FileWriter fwr1=new FileWriter(file);
			BufferedWriter bw1=new BufferedWriter(fwr1);
			bw1.close();		
		}
		catch(IOException e)
		{
			System.out.println("Exception: "+e);
		}
		
	}
}


