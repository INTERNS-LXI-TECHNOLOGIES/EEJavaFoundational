package com.lxisoft.models;
import com.lxisoft.Domain.*;
import java.util.Comparator;

public class SortByName implements Comparator<Contact>
{
	public int compare(Contact con,Contact cont)
	{
		return con.getFullName().compareTo(cont.getFullName());
	}
}