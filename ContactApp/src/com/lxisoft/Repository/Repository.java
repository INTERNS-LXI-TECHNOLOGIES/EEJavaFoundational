package com.lxisoft.Repository;
import com.lxisoft.Model.*;
import java.util.ArrayList;
/**
	*This is Repository interface 
*/
public interface Repository
{
	public void  writeToDatabase(ArrayList<ContactModel> contacts);
	/*public void readFromDatabase(ArrayList<ContactModel> contacts);
	void  deleteQuery(ContactModel contact);
	void updateContactName(ContactModel contact);
	void updateContactNumber(ContactModel contact);*/
}