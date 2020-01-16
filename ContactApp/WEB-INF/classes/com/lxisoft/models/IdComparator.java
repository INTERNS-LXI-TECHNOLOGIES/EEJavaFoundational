package com.lxisoft.models;
import com.lxisoft.controllers.*;
import com.lxisoft.repository.*;
import com.lxisoft.models.*;
import com.lxisoft.domain.*;
import com.lxisoft.view.*;
import java.util.*;
import java.io.*;
public class IdComparator implements Comparator<Contact>
{
	public int compare(Contact c,Contact c1)
    {
    	return (Integer.parseInt(c.getId()))-(Integer.parseInt(c1.getId()));
    }
}