package com.lxisoft.model;
import com.lxisoft.view.*;
import com.lxisoft.controller.*;
import java.util.Scanner;
import com.lxisoft.test.*;

public class SortNumber implements Comparator <Contact>
{
 public int Compare ( Contact c,Contact c1)
   {
		int x = c.getNumber().CompareTo(c1.getNumber());
		return x ;
   }
}