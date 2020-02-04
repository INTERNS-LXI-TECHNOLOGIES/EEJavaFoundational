package com.lxisoft.repository;
import com.lxisoft.model.*;
import java.util.ArrayList;
import java.io.*;
public class FileRepository
{
	public File newFile = new File("D:\\lxi\\java\\my Git\\EEJavaProjects\\EEJavaFoundational\\ContactApp\\src\\com\\lxisoft\\file\\ToFile.csv");
	public File toFile(ArrayList<ContactModel> s,boolean a)
	{
		try{
		FileWriter fw= new FileWriter(newFile,a);
		BufferedWriter bw=new BufferedWriter(fw);
		for(int i=0;i<s.size();i++)
		{
			bw.write(s.get(i).getId()+","+s.get(i).getName()+","+s.get(i).getMob());
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return newFile;
	}

	public ArrayList<ContactModel> fromFile(File fileCopy)
	{
		ArrayList<ContactModel>reader=new ArrayList<ContactModel>();
		try{ 
		FileReader fr=new FileReader(fileCopy);
		BufferedReader br= new BufferedReader(fr);
		String s;
		while((s=br.readLine())!=null)
		{	
			String[]str=s.split(",",3);
				reader.add(new ContactModel());
				for(int i=0;i<reader.size();i++)
				{
				if(reader.get(i).getName()==null)
					{
						reader.get(i).setId(Integer.parseInt(str[0]));
						reader.get(i).setName(str[1]);
						reader.get(i).setMob(Long.parseLong(str[2]));
					}
			}
		}
	      }
	      catch(Exception e)
	      {
	      	e.printStackTrace();
	      }
	      return reader;
	}
}