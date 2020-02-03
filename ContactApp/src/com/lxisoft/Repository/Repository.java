package com.lxisoft.Repository;
import java.util.ArrayList;
import com.lxisoft.model.ContactModel;
import java.util.ArrayList;
public interface Repository
{
	public void writeContact(ArrayList<ContactModel> contacts);
	public ArrayList<ContactModel> readContact(ArrayList<ContactModel> contact);
	public void updateContactName(ContactModel contact);
	public void updateContactNumber(ContactModel contact);
	public void deleteContact(ContactModel contact);
	public ArrayList<ContactModel> searchContact(String searchName,ArrayList<ContactModel> contacts);
}