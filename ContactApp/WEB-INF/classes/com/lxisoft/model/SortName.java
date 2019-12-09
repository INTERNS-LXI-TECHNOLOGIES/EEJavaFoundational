package com.lxisoft.model;
import com.lxisoft.view.*;
import com.lxisoft.controller.*;
import java.util.*;
import com.lxisoft.test.*;

public class SortName implements Comparator<Contact>
{
 public int compare(Contact c,Contact c1)
    
    {
		return c.getName().compareTo(c1.getName());
   }
}