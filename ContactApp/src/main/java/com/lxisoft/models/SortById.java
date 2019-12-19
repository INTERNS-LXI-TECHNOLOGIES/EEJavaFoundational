package com.lxisoft.models;
import com.lxisoft.Domain.*;
import java.util.Comparator;

public class SortById implements Comparator<Contact>
{
	public int compare(Contact con,Contact cont)
	{
		return con.getId()-(cont.getId());
	}
}