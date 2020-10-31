package com.Lxisoft.MovieScriptApp;
import java.util.*;

public class Admin
{
 public void adminFunctions()
 {
        
        boolean quit=false;

         int choice=0;
        do
        {

            System.out.println("\n \n ***ENTER YOUR DESIRED OPERATION TO PERFORM***");
            System.out.println("1.  ADD");
            System.out.println("2.  DELETE");
            System.out.println("3.  UPDATE");
            
            System.out.println("0.  TO EXIT");

            System.out.println("Enter your choice");
             choice=scanner.nextInt();


            
            
        
                if(choice==1)
                {
                this.addDynamically();
                }
                if(choice==2)
                {
                this.removeDynamically();
                }
                if(choice==3)
                {
                this.modifyNameDynamically();
                }
                
                else if (choice==0)
                {
                System.out.println(" ");
                }
            }
            while(choice>0);
      
                
            

            
            }
}