package com.lxisoft.repository;
import java.util.*;
//import com.lxisoft.filerepository.*;
import java.io.*;
import com.lxisoft.servlet.*;
import com.lxisoft.model.*;
public interface Repository
{
	public void sqlrepository();
	public void delete(int id);
	public void write(Contact contact, boolean isTrue);
	public void clear();
	 public  ArrayList <Contact> read();
	public void edit(Contact contact);
}