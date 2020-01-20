package com.lxisoft.Repository;
import java.util.*;
import java.io.*;
import com.lxisoft.View.ContacView;
import com.lxisoft.Control.ContactControl;
import com.lxisoft.Model.ContactModel;
public class FileRepository
{
	File file=new File("D:\\contact.scv");
	ContactModel model=new ContactModel();
	public void writeToFile()
	{
		try
		{
			FileWriter fw=new FileWriter(file,false);
			BufferedWriter bw=new BufferedWriter(fw);
			for(int i=0;i<i++)
			{
				bw.write();  		
			}
			bw.flush();
			bw.close();
		}
		catch(Exception e)
		{
		}
	}
	public void readToFile()
	{
		try
		{
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String str;
			while((str=br.readLine())!=null)
			{	
				String[] s=str.split(",",3);				
				System.out.println(s[0] + (s[1]) + (s[2]));	
			}
		}
		catch(Exception e)
		{
			System.out.println("Error");
			e.printStackTrace();
	 	}
	
}


	
	
		

