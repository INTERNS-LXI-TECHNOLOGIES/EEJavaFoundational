package com.lxisoft.Repository;
import com.lxisoft.model.ContactModel;
import java.util.ArrayList;
public interface Repository
{
	public void writeContact(ArrayList<ContactModel> contacts);
	public ArrayList<ContactModel> readContact(ArrayList<ContactModel> contact);
	public void updateContact(ContactModel contact);
	public void deleteContact(ContactModel contact);
	public void searchContact(ContactModel contact);
}