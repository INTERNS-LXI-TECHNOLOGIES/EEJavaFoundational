package com.lxisoft.contactapp.model;
import com.lxisoft.contactapp.Domain.*;
import java.util.Comparator;

public class SortByNumber implements Comparator<Contact>
{
	public int compare(Contact con,Contact cont)
	{
		return con.getNo().compareTo(cont.getNo());
	}
}