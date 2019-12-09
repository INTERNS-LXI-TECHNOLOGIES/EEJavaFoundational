package com.lxisoft.model;
import com.lxisoft.view.*;
import com.lxisoft.controller.*;
import java.util.*;
import com.lxisoft.test.*;

public class SortId implements Comparator<Contact>
{
 public int compare ( Contact c,Contact c1)
   {
		int x = c.getId()-(c1.getId());
	    return x ;
   }
}    