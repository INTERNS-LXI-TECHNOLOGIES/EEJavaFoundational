package com.lxisoft.Repository;
import com.lxisoft.Control.ContactControl;
import com.lxisoft.Model.ContactModel;
import com.lxisoft.View.ContactView;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.ArrayList; 
import java.io.*;
/**
	* This is a FileRepository class used to store datas in file 
*/
public class FileRepository implements Repository
{
	public File file = new File("D:\\gitcontact\\EEJavaFoundational\\ContactApp\\src\\com\\lxisoft\\Repository\\contact.csv");
	/**
		* This method to check file is exist or not 
		* @param file to create file
		* @return ischeck to return a boolean value
	*/	
	public boolean fileExist(File file)
	{
		boolean isCheck=file.exists();
		return isCheck;
	}
	/**
		* This method to add data to file
		* @param contacts get data from arraylist
	*/	
	public void writeToDatabase(ArrayList<ContactModel> contacts)
	{
		try
		{
			FileWriter fw = new FileWriter(file,false);
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i=0; i<contacts.size(); i++)
			{
				bw.write(contacts.get(i).getId()+","+contacts.get(i).getName()+","+contacts.get(i).getPhoneNumber());  
				bw.newLine();		
			}
			bw.flush();
			bw.close();
		}
		catch(Exception e)
		{
			System.out.println(e+"Error eeeeeee");
			e.printStackTrace();
		}
	}
	public void appendFile(ArrayList<ContactModel> contacts)
	{
		try
		{
			FileWriter fw = new FileWriter(file,true);
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i=0; i<contacts.size(); i++)
			{
				bw.write(contacts.get(i).getId()+","+contacts.get(i).getName()+","+contacts.get(i).getPhoneNumber());  
				bw.newLine();		
			}
			bw.flush();
			bw.close();
		}
		catch(Exception e)
		{
			System.out.println(e+"Error eeeeeee");
			e.printStackTrace();
		}
	}
	/**
		* This method to read data from file
		* @param contacts to get data from arraylist
		* @return contacts to read data
		* @exception IOException exception when read data
	*/		
	public ArrayList<ContactModel> readFromDatabase(ArrayList<ContactModel> contacts) throws Exception , IOException
	{
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String str;
		while((str=br.readLine())!=null)
		{	
			String[] s = str.split(",",3);	
			contacts.add(new ContactModel());
			for(int i=0;i<contacts.size();i++)
			{
				if(contacts.get(i).getName()==null)
				{
					contacts.get(i).setId(Integer.parseInt(s[0]));
					contacts.get(i).setName(s[1]);
					contacts.get(i).setPhoneNumber(Long.parseLong(s[2]));
				}
			}	
		}
		return contacts;
	}	
}

	
	
		

