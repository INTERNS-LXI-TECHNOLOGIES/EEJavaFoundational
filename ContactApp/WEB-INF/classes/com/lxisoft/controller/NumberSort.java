package com.lxisoft.controller;
import com.lxisoft.domain.*;
import java.util.*;

public class NumberSort implements Comparator<Contact>
{
   @Override
    public int compare(Contact c1,Contact c2) 
    { 

    // for comparison 
    return c1.getNumber().compareTo(c2.getNumber()); 
 	 
    } 
}