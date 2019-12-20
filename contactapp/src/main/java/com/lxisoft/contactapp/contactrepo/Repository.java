package com.lxisoft.contactapp.contactrepo;
import java.io.*;
import java.util.*;
import com.lxisoft.contactapp.model.*;
public interface Repository{
Contact contact=new Contact();
ArrayList<Contact> contacts=new ArrayList<Contact>();
public void setContact(Contact contact);
public ArrayList<Contact>  getAll();
public void editList(Contact c,String[] t);
public Contact searchList(String name);
public void deleteList(String cn);
public void clearList();

}