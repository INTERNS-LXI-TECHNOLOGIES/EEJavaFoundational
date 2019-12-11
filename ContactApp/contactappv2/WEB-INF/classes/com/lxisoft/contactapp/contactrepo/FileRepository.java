package com.lxisoft.contactapp.contactrepo;
import java.io.*;
import java.util.*;
import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.view.*;
import com.lxisoft.contactapp.controller.*;
/**
*class for file repository
*/ 
public class FileRepository implements Filestorage{
String directory="D:\\project\\CoreJavaFoundational\\ContactApp\\src\\com\\lxisoft\\contactapp\\contactrepo\\contact.csv";
File file=new File(directory);
static int id=1;
int temp=1;
//Controller controlller=new Controller();
ArrayList<Contact> contacts=new ArrayList<Contact>();
/**
*method used to write contact to the file
*@param Contact single contact
*/
public void setContact(Contact contact){
	id=count();
	++id;
try{
	//if(file.exists()){
        FileWriter write=new FileWriter(file,true);
		BufferedWriter fwrite=new BufferedWriter(write);
		contact.setId(id);
		fwrite.write(contact.getId()+","+contact.getName()+","+contact.getNumber()+"\n");  
		fwrite.flush();
		fwrite.close();
	   // }
/*	else{
	    FileWriter write1=new FileWriter(file);
		BufferedWriter fwrite1=new BufferedWriter(write1);
		contact.setId(id);
		fwrite1.write(contact.getId()+","+contact.getName()+","+contact.getNumber()+"\n");  
		fwrite1.flush();
		fwrite1.close();
        }*/
    }
catch(IOException e){
    	System.out.println("Exception "+e);
    }	
  }
/**
*method used to count
*@return int
*/
public int count(){
 	ArrayList<Contact> contacts=getAll();
 	if(file.exists()){
 		int c=0,t;
 		for(int i=0;i<contacts.size();i++){
 			t=contacts.get(i).getId();
 			if(c<t){
 				c=t;
 			}
 		}
 		return c;
 	}
 	else{
 		return 0;
 	}
 }
/**
*method used to read from the file
*@return ArrayList contact list
*/
public ArrayList<Contact>  getAll(){
	 contacts=new ArrayList<Contact>();
	 TreeSet<Contact>contactlist=new TreeSet<Contact>();
	try{
		FileReader read=new FileReader(file);
		BufferedReader bread=new BufferedReader(read);
		String data;
		while((data=bread.readLine())!=null){	
			String[] dataArray=data.split(",");
				Contact contact=new Contact();
				contact.setId(Integer.parseInt((dataArray[0])));	
				contact.setName(dataArray[1]);
			 	contact.setNumber(dataArray[2]);
				contactlist.add(contact);
		}
		contacts.addAll(contactlist);
	}
	catch(IOException e){
    	System.out.println("Exception "+e);
    }

    return contacts;
  }

  public void sortNumber(){
  	Collections.sort(contacts,new SortNumber());
  	for(Contact contact:contacts){
  		System.out.println(contact.getId()+"------"+contact.getName());
  	}
 }

   public void sortId(){
  	Collections.sort(contacts,new SortId());
  	for(Contact contact:contacts){
  		System.out.println(contact.getId()+"------"+contact.getName());
  	}
 }
  /**
*method used to search a contact from the file
*@param String contact name
*@return Contact single contact
*/
 
public Contact searchList(String name){
 int count=0;
 Contact c=null;			
 contacts=this.getAll();
for(int i=0;i<contacts.size();i++){
	if(name.equals(contacts.get(i).getName())){
		count=1;
		c=contacts.get(i);
		} 
	 }
	 return c;

  } 
/**
*method used to edit a contact from list
*@param String[],Contact array contains name and number,single contact
*/

public void editList(Contact contac,String[] temp){  
	ArrayList<Contact> con=this.getAll();
	for(int i=0;i<con.size();i++){
		if(con.get(i).getName().equals(contac.getName())){
			Contact contact=new Contact();
			String a=temp[0];
			contact.setId(Integer.parseInt(a));
			contact.setName(temp[1]);
			contact.setNumber(temp[2]);
			con.set(i,contact);
		}
	}
	  this.clearList();
      for(int i=0;i<con.size();i++){
      	this.setContact(con.get(i));
      } 
  }
 /**
*method used to delete a contact from list
*@param String contact name
*/

public void deleteList(String cn){
ArrayList<Contact> con=this.getAll();
for(int i=0;i<con.size();i++){
	if(cn.equals(con.get(i).getName())){
		con.remove(i);
		
          }
       } 
      this.clearList();
      for(int i=0;i<con.size();i++){
      	this.setContact(con.get(i));
      } 
    } 
/**
*method used to clear all data
*/
public void clearList(){
	try{
		FileWriter f=new FileWriter(file);
	   }
	catch(IOException e){
    	System.out.println("Exception "+e);
      }
    }

}