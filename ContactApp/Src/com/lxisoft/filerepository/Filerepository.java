package com.lxisoft.filerepository;
import java.util.Scanner;
import java.io.BufferedReader;
import com.lxisoft.contact.Contact;
import java.io.*;
import java.util.*;
public class Filerepository
{
	public void writeFile(Contact contact)
	{
		String csvFile="/home/sanfar/Desktop/Contact app 2/Src/com/lxisoft/filerepository/Contact.csv";
        String line = "";   
        FileWriter fr = null;
        BufferedWriter br = null;
        Scanner scr=new Scanner(System.in);
        /*System.out.println("write new contact");
        System.out.println("write name :");
        String name=scr.next();
        System.out.println("write number :");
        long number=scr.nextLong();*/
        

        String name=contact.getName();
        String number=contact.getNumber();
        try{
            fr = new FileWriter(csvFile,true);
            br = new BufferedWriter(fr);
            br.write(name+","+number);    
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
	/*public void readFile()
	{
		String[] data=new String[10];
        String line = "";
       try{
	       	   String csvFile = "../Contact App/com/lxisoft/fileoperation/Contacts.csv";
    	       BufferedReader br = new BufferedReader(new FileReader(csvFile));
    	       int i=0;
	           while ((line = br.readLine()) != null)
	           { 
    	           String[] datas= line.split(","); 
                   if(actordia.equals(datas[0]))
                   {
    	               data[i++]=datas[1];
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
        int randVar=(int)(Math.random()*4);
        return data[randVar];     
	}*/
}