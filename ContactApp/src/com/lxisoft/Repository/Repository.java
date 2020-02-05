package com.lxisoft.Repository;
import java.util.ArrayList;
import com.lxisoft.model.ContactModel;
/**
*/
public interface Repository
{
	public void insertContact(ArrayList<ContactModel> contacts);
	public ArrayList<ContactModel> readContact(ArrayList<ContactModel> contact)throws Exception;
	public void updateContactName(ContactModel contact);
	public void updateContactNumber(ContactModel contact);
	public void deleteContact(ContactModel contact);
	public ArrayList<ContactModel> searchContact(String searchName,ArrayList<ContactModel> contacts)throws Exception;
}