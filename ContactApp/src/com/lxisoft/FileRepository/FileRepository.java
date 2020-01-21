package com.lxisoft.FileRepository;
import java.util.*;
import java.io.*;
public class FileRepository
{
	public File createNewFile()
	{
		try
		{
			File contactFile = new File("D:\\Program Files\\workspace\\EEProjects\\EEJavaFoundational\\ContactApp\\src\\com\\lxisoft\\File\\contactFile.csv");
			boolean ifExists = contactFile.exists();
			if(!ifExists)
			{
				contactFile.createNewFile();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return contactFile;
	}
	public void writeToFile(ArrayList<ContactModel> contacts)
	{
		try
		{
			File contactFile = this.createNewFile();
			FileWriter fw = new FileWriter(contactFile,false);
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i=0;i<contacts.size();i++)
			{
				bw.write(contacts.get(i).getName()+","+Integer.toString(contacts.get(i).getId())+","+Long.toString(contacts.get(i).getPhoneNUmber()));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public ArrayList<ContactModel> readFromFile(ArrayList<ContactModel> contacts,File file)
	{
		try
		{
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String data;
			while(data = br.readLine()!=null)
			{
				String str = data.split(",",3);
				contacts.add(new ContactModel());
				for(int i=0;i<contacts.size();i++)
				{
					if(contacts.get(i).getName()==null)
					{
						contacts.get(i).setId(str[0]);
						contacts.get(i).setName(str[1]);
						contacts.get(i).setPhoneNumber(str[2]);
					}
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return contacts;
	}
}