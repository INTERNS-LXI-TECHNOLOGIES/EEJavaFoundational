package com.lxisoft.sqlrepository;
import com.lxisoft.model.Model;
import java.util.*;
public class Tdd
{
	public static void main (String [] args)
	{
		Sqlrepository r = new Sqlrepository();
		ArrayList<Model> m=new ArrayList<Model>();
		m=r.readquestion(); 
		System.out.println("Array Size : "+m.size());

	}
}