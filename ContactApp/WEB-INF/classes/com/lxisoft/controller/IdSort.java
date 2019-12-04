package com.lxisoft.controller;
import com.lxisoft.domain.*;
import java.util.*;

public class IdSort implements Comparator<Contact>
{
    public int compare(Contact c1,Contact c2) 
    { 
    	int x=Integer.parseInt(c1.getId());
    	int y=Integer.parseInt(c2.getId());
    	return x-y; 
 	 
    } 
}