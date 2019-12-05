package com.lxisoft.contactapp.model;
import com.lxisoft.contactapp.Domain.*;
import java.util.Comparator;

public class SortByName implements Comparator<Contact>
{
	public int compare(Contact con,Contact cont)
	{
		return con.getName().compareTo(cont.getName());
	}
}