package com.lxisoft.Repository;
import com.lxisoft.Control.ContactControl;
import com.lxisoft.Model.ContactModel;
import com.lxisoft.View.ContactView;
import com.lxisoft.Repository.FileRepository;
import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class FileRepository
{
	File file = new File("E:\\contact.csv");
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
	// public void readFromFile()
	// {
	// 	try
	// 	{
	// 		FileReader fr = new FileReader(file);
	// 		BufferedReader br = new BufferedReader(fr);
	// 		String str;
	// 		while((str=br.readLine())!=null)
	// 		{	
	// 			String[] s = str.split(",",3);	
	// 			ContactModel contact = new ContactModel();
	// 			contact.setId(s[0]);
	// 			contact.setName(s[1]);
	// 			contact.setPhoneNumber(Long.parseLong(s[2]));
	// 			System.out.println(s[0] + (s[1]));	
	// 		}
	// 	}
	// 	catch(Exception e)
	// 	{
	// 		System.out.println("Error"+e);
	// 		e.printStackTrace();
	// 	}
	// }	
}

	
	
		

