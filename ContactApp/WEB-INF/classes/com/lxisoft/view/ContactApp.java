package com.lxisoft.view;
import java.util.*;
import com.lxisoft.modal.*;
import com.lxisoft.control.*;
import com.lxisoft.repository.*;


public class ContactApp
{
	Control control=new Control();
	public void user()
	{int choice=a;
		
		System.out.println("Press\n1.View Contact\n2.Enter the query to update contact list");
		//Scanner scanner=new Scanner(System.in);
		//choice=scanner.nextInt();
		control.addMenu();
		control.userControl(choice);
		this.user();
	
	}
	public void display(ArrayList<Contact> contact)
	{

    	int i;
    System.out.println("|-----------------------------------------------------------------------|");
	System.out.println("|            				Contacts			|");
	System.out.println("|-----------------------------------------------------------------------|");
		for(i=0;i<contact.size();i++)
          	{
          	
            System.out.println("|"+"\t"+(i+1)+"|"+"\t"+contact.get(i).getName()+"\t"+"|"+"\t"+contact.get(i).getNumber()+"\t"+"|"+"\t"+contact.get(i).getEmail()+"\t"+"|");                
            

            }
     System.out.println("|-----------------------------------------------------------------------|");
        this.user();
}
}