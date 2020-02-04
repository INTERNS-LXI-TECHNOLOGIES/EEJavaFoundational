package com.lxisoft.Repository;
import com.lxisoft.Model.*;
import java.util.ArrayList;
public interface Repository
{
	void  writeToDatabase(ArrayList<ContactModel> contacts);
	/*void readFromDatabase(ArrayList<ContactModel> contacts);
	void  deleteQuery(ContactModel contact);
	void updateContactName(ContactModel contact);
	void updateContactNumber(ContactModel contact);*/
}