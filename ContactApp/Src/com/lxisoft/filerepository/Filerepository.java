package com.lxisoft.filerepository;
import java.util.Scanner;
import java.io.BufferedReader;
import com.lxisoft.contact.Contact;
import java.io.*;
import java.util.*;
import java.util.*;
public class Filerepository
{
	public void writeFile(ArrayList<Contact> contacts,Boolean value)
	{
		String csvFile="/home/sanfar/Desktop/Contact app 2/Src/com/lxisoft/filerepository/Contact.csv";
        String line = "";   
        FileWriter fr = null;
        BufferedWriter br = null;
       
       
        try{

            fr = new FileWriter(csvFile,value);
            br = new BufferedWriter(fr);
            for(int i=0;i<contacts.size();i++)
            {
                br.write(contacts.get(i).getName()+","+contacts.get(i).getNumber());
                br.newLine();    
            }
             
        }
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        finally
        {
            try 
            {
                br.close();
                fr.close();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }   
        }
    }
	public ArrayList<Contact> readFile()
	{
        ArrayList<Contact> data = new ArrayList<Contact>(); 
		
        String line = "";
       try{
	       	   String csvFile = "/home/sanfar/Desktop/Contact app 2/Src/com/lxisoft/filerepository/Contact.csv";
    	       BufferedReader br = new BufferedReader(new FileReader(csvFile));
    	       int i=0;
	           while ((line = br.readLine()) != null)
	           { 
    	          String[] datas= line.split(",",2); 
                  data.add(new Contact());
                   for(int j=0;j<data.size();j++)
                   {
                    if(data.get(j).getName()==null)
                    {
                        data.get(j).setName(datas[0]);
                        data.get(j).setNumber(datas[1]);
                    }
                   } 
	           }
           }
    		catch (FileNotFoundException e)
          	{
            	e.printStackTrace();
        	}
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        
        return data;     
	}
}