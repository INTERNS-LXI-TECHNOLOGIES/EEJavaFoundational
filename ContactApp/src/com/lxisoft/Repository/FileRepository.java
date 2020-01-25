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
public class FileRepository
{
	public File file = new File("D:\\gitcontact\\EEJavaFoundational\\ContactApp\\src\\com\\lxisoft\\Repository\\contact.csv");
	public boolean fileExist(File file)
	{
		boolean isCheck=file.exists();
		return isCheck;
	}
	public void writeToFile(ArrayList<ContactModel> contacts)
	{
		try
		{
			FileWriter fw = new FileWriter(file,false);
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i=0; i<contacts.size(); i++)
			{
				bw.write(contacts.get(i).getId()+","+contacts.get(i).getName()+","+contacts.get(i).getPhoneNumber());  		
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
	public ArrayList<ContactModel> readFromFile(ArrayList<ContactModel> contacts) throws Exception , IOException
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

	
	
		

