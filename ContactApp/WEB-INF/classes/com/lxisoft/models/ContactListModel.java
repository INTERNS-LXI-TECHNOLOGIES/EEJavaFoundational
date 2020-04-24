package com.lxisoft.models;
import java.util.*;
import java.io.*;
// import com.lxisoft.view.*;
import com.lxisoft.models.*;
// import com.lxisoft.controllers.*;

public class ContactListModel
{
	private List<ContactModel>contactsList=new ArrayList<ContactModel>();
	 /**
 * set arraylist
 */

	  /**
 * @param model contactmodel
 */
	public void setContactsList(ContactModel model)
	{
		contactsList.add(model);	
	}
	 /**
 * get arraylist
 */
	 /**
 * @return arraylist
 */
	public List<ContactModel> getContactsList()
	{
		return contactsList;
	}
}