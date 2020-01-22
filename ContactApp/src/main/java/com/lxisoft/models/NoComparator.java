package com.lxisoft.models;
import java.io.*;
import java.util.*;
import com.lxisoft.models.*;
import com.lxisoft.domain.*;
import com.lxisoft.repository.*;
public class NoComparator implements Comparator<Contact>
{
	public int compare(Contact c,Contact c1)
	{
		return c.getContactNo().compareTo(c1.getContactNo());
	}
}