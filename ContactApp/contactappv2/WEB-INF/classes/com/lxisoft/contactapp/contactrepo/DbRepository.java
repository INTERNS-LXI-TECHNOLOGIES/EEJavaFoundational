package com.lxisoft.contactapp.contactrepo;
import java.io.*;
import java.util.*;
import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.view.*;
import com.lxisoft.contactapp.controller.*;
import java.sql.*; 
public class DbRepository implements Repository{
	Connection con;
	Contact contact=new Contact();
	PreparedStatement ps;	
public ArrayList<Contact>getAll(){
	ArrayList<Contact> conlist=new ArrayList<Contact>();
	Set<Contact> conset=new TreeSet<Contact>();
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contacts","root","root");


		Statement s=con.createStatement();
	/*	s.executeUpdate("create table  contactlist (ID int auto_increment primary key,NAME varchar(15),NUMBER varchar(15))");
        ps=con.prepareStatement("insert into contactlist (NAME,NUMBER) values(?,?)");*/
		ResultSet rs=s.executeQuery("select * from contactlist");
		while(rs.next()){
			Contact contact=new Contact();
			contact.setId(rs.getInt("ID"));
			contact.setName(rs.getString("NAME"));
			contact.setNumber(rs.getString("NUMBER"));
			conset.add(contact);
		}              
		conlist.addAll(conset);
	}
	catch(Exception ee){
		System.out.println("Exceptioon......................"+ee);} 
		return conlist;
  }
public void setContact(Contact contact){
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contacts","root","root");
		Statement s=con.createStatement();
		s.executeUpdate("insert into contactlist(NAME,NUMBER) values('"+contact.getName()+"','"+contact.getNumber()+"')");
		con.close();
	}
	catch(Exception ee){
		System.out.println(ee);} 
	}

	
public Contact searchList(String name){
	Contact contact=new Contact();
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contacts","root","root");
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from contactlist where(NAME ='"+name+"')");
		contact.setId(rs.getInt("ID"));
		contact.setName(rs.getString("NAME"));
		contact.setNumber(rs.getString("NUMBER"));
        }
    catch(Exception ee){
		System.out.println("****Exception*****"+ee);} 
		return contact;
   }
public void editList(Contact contac,String[] temp){
	ArrayList<Contact> colist=this.getAll();
	try{
		String a=temp[1];
		String b=temp[2];
		String c=temp[0];
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contacts","root","root");
		Statement s=con.createStatement();
		s.executeUpdate("update contactlist set NAME='"+a+"',NUMBER='"+b+"' where NAME ='"+contac.getName()+"'");
	    }
	catch(Exception ee){
		System.out.println(ee);}   
   }

public void deleteList(String cn){
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contacts","root","root");
		Statement s=con.createStatement();
		s.executeUpdate("delete from contactlist where NAME ='"+cn+"'");	
       }
    catch(Exception ee){
		System.out.println(ee);}
   }

public void clearList(){
	 ArrayList<Contact> clist=new  ArrayList<Contact>();
  }
 }