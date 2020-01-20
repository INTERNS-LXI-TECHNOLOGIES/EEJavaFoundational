package com.lxisoft.view;
import java.util.Scanner;
public class View
{
	public void display()
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("1 : Display Contact \n2 : Create Contact \n3 : Select Contact");
		int select=scr.next();

		switch(select)
		{
			case 1:
					Controller controller=new Controller();
					controller.contact();
					break;
			case 2:
					controller.createnew();
					break;
			case 3:
					controller.selectcontact();
					break;
		}
	}
	
}