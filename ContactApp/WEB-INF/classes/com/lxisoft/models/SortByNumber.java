package com.lxisoft.models;
import com.lxisoft.Domain.*;
import java.util.Comparator;

public class SortByNumber implements Comparator<Contact>
{
	public int compare(Contact con,Contact cont)
	{
		return con.getNo().compareTo(cont.getNo());
	}
}