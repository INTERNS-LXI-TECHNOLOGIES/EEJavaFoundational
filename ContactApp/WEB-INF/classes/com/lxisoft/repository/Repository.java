package com.lxisoft.repository;
import java.util.*;
import com.lxisoft.filerepository.*;
import java.io.*;
import com.lxisoft.test.*;
import com.lxisoft.model.*;
public interface Repository
{
	public void delete(int id);
	public void write(Contact contact, boolean isTrue);
	public void clear();
	 public  ArrayList <Contact> read();
	public void edit(int id,String name, String number);
}