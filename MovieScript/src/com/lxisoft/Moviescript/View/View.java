package com.Lxisoft.Moviescript.View;
//import com.Lxisoft.Moviescript.Model.*;
import com.Lxisoft.Moviescript.Control.*;
//import com.Lxisoft.Files.*;
//import java.util.io.*;
import java.util.*;
//import java.io.FileNotFoundException;
public class View 
{
	//Scene1 s1 =new Scene1();
	Scanner scanner=new Scanner(System.in);
	public void intro()
    {
    	System.out.println("\n\t\t-------------------------------------------\t");
   		System.out.println("\t\t-------------------------------------------\t");
   		System.out.println("\t\t------------------ Marvels ----------------\t");
   		System.out.println("\t\t-------------   The Avengers  -------------\t");
   		System.out.println("\t\t--------------  THE END GAME --------------\t");
   		System.out.println("\t\t-------------------------------------------\t");
   		System.out.println("\t\t-------------------------------------------\t");
   		System.out.println("\t\t------- Scripted by -----------------------\t");
   		System.out.println("\t\t---------------- Faris --------------------\t");
   		System.out.println("\t\t-------------------------------------------\t");
   		
   		this.admin();

    }

    public void admin()
{  
 int choice=0;
    do
    {
      System.out.println("\n________________________");
        System.out.println("\n\n1. Director  \n\n2. Movie Script \n\n3. Casts \n\n Press 0 for Exit \n");
        choice=scanner.nextInt();
        if(choice==1)
        {
        	this.adminFunctions();   
        }
        if(choice==2)
        {
             
           this.scenes();
         
        }
        if(choice==3)
        {
             
           //admin.getMenu();
         
        }
        else if(choice==0)
        {
            System.out.println(" ");
        }
    }
    while(choice>0);
      
}




	public void scenes()
	{  
 	int choice=0;
    do
   		{
      	System.out.println("\n________________________");
        System.out.println("\n\n1. Scene-1 \n\n2. Scene-2  \n\n Press 0 for Exit \n");
        choice=scanner.nextInt();
        if(choice==1)
        {
            //s1.sc1();

        }
        if(choice==2)
        {
            //s1.sc2() 
           //admin.getMenu();
         
        }
        if(choice==3)
        {
             
           //admin.getMenu();
         
        }
        else if(choice==0)
        {
            System.out.println(" ");
        }
    }
    while(choice>0);
      
}
public void adminFunctions()
 {
        
        
        boolean quit=false;
        //Scene1 sc1 =new Scene1();
        
       int choice=0;
        do
        {

            System.out.println("\n \n Welcome Mr.Director");
            System.out.println("1.  Add");
            System.out.println("2.  Delete");
            System.out.println("3.  Update");
            
            System.out.println("0.  Exit");

            System.out.println("Enter your choice");
             choice=scanner.nextInt();


            
            
        
                if(choice==1)
                {
                //this.addDynamically();
                }
                if(choice==2)
                {
                //this.removeDynamically();
                }
                if(choice==3)
                {
                //this.modifyNameDynamically();
                }
                
                else if (choice==0)
                {
                System.out.println(" ");
                }
            }
            while(choice>0);
      
                
            

            
            }

}