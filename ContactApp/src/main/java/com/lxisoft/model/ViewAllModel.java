package com.lxisoft.model;
import com.lxisoft.model.*;
import com.lxisoft.domain.*;
import java.util.ArrayList;

public class ViewAllModel
{
	
	ArrayList<Contact> contactList=new ArrayList<Contact>();

	public void setList(ArrayList<Contact> contactList)
	{
		this.contactList=contactList;
	}

	public ArrayList<Contact> getList()
	{
		return contactList;
	}
}




// ViewAllModelMinimal viewAllModelMinimal=new ViewAllModelMinimal();

	// public void setAll(ViewAllModelMinimal viewAllModelMinimal)
	// {
	// 	this.viewAllModelMinimal=viewAllModelMinimal;
	// }

	// public ViewAllModelMinimal getName()
	// {
	// 	return viewAllModelMinimal;
	// }