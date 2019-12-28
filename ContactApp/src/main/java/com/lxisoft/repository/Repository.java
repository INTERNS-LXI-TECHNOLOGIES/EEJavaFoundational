package com.lxisoft.repository;
import com.lxisoft.Domain.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public interface Repository
{
	// public void dB_Connection(boolean dBexists) throws SQLException,ClassNotFoundException;
	// public void createTable()throws SQLException;
	// public boolean checkTableExists();
	// public void checkDBExists();
	public int getId();
	public ArrayList<Contact> getAllContacts()throws SQLException;
	public void addContactDetails(Contact contact)throws SQLException;
	public void insertContactDetails(Contact contact,boolean tbexists)throws SQLException;
	public void updateRepo(int i,Contact contact)throws SQLException;
	public void deleteContact(int i)throws SQLException;
	public void clearRepository()throws SQLException;
	public void sortContactByFirstName()throws SQLException;
	public void sortContactByLastName()throws SQLException;
	
}