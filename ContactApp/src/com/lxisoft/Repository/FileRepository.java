package com.lxisoft.Repository;
import java.util.*;
import java.io.*;
import com.lxisoft.Control.ContactControl;
import com.lxisoft.Model.ContactModel;
import com.lxisoft.View.ContactView;
public class FileRepository
{
	File file = new File("E:\\contact.csv");
	public void writeToFile(ArrayList<ContactModel> contacts)
	{
		try
		{
			FileWriter fw = new FileWriter(file,false);
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i=0; i<model.getContacts().size(); i++)
			{
				bw.write(model.getContacts().get(i).getId()+","+model.getContacts().get(i).getName()+","+model.getContacts().get(i).getPhoneNumber());  		
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
	public void readFromFile()
	{
		try
		{
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String str;
			while((str=br.readLine())!=null)
			{	
				String[] s = str.split(",",3);	
				ContactModel contact = new ContactModel();
				contact.setId(s[0]);
				contact.setName(s[1]);
				contact.setPhoneNumber(Long.parseLong(s[2]));
				System.out.println(s[0] + (s[1]));	
			}
		}
		catch(Exception e)
		{
			System.out.println("Error"+e);
			e.printStackTrace();
		}
	}	
}

	
	
		

