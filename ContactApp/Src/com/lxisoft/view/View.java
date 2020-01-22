package com.lxisoft.view;
import java.util.Scanner;
import com.lxisoft.controller.*;
public class View
{
	public void display()
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("1 : Display Contact \n2 : Create Contact \n3 : Select Contact");
		int select=scr.nextInt();
		Controller controller=new Controller();
/*		controller=null;
*/		switch(select)
		{
			case 1:
					controller.displayContacts();
					break;
			case 2:
					controller.createNewContact();
					break;
			case 3:
					controller.selectContact();
					break;	
		}
	}
	
}