package com.lxisoft.Repository;
import com.lxisoft.model.ContactModel;
import java.util.*;
import java.io.*;
public class FileRepository
{
	public File contactFile = new File("D:\\Program Files\\workspace\\EEProjects\\EEJavaFoundational\\ContactApp\\src\\com\\lxisoft\\File\\ContactsFile.csv");
	public File createNewFile()
	{
		try
		{
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
	public boolean fileExists(File file)
	{
		boolean isTrue = file.exists();
		return isTrue;
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
				bw.write(Integer.toString(contacts.get(i).getId())+","+contacts.get(i).getName()+","+Long.toString(contacts.get(i).getPhoneNumber()));
				bw.newLine();
			}
			bw.flush();
			bw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void writeToFileWithoutOverriding(ArrayList<ContactModel> contacts)
	{
		try
		{
			File contactFile = this.createNewFile();
			FileWriter fw = new FileWriter(contactFile,true);
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i=0;i<contacts.size();i++)
			{
				bw.write(Integer.toString(contacts.get(i).getId())+","+contacts.get(i).getName()+","+Long.toString(contacts.get(i).getPhoneNumber()));
				bw.newLine();
			}
			bw.flush();
			bw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public ArrayList<ContactModel> readFromFile(ArrayList<ContactModel> contacts,File file) throws Exception
	{
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String data;
		while((data = br.readLine())!=null)
		{
			String[] str = data.split(",",3);
			contacts.add(new ContactModel());
			for(int i=0;i<contacts.size();i++)
			{
				if(contacts.get(i).getName()==null)
				{
					contacts.get(i).setId(Integer.parseInt(str[0]));
					contacts.get(i).setName(str[1]);
					contacts.get(i).setPhoneNumber(Long.parseLong(str[2]));
				}
			}
		}
		br.close();
		return contacts;
	}
}