package com.Lxisoft.MovieScriptApp;
import java.io.FileNotFoundException;


import java.util.*;
import java.util.Scanner; 
import java.io.*;
import java.io.FileWriter;
import java.util.ArrayList;
public class Admin
{
    String dialogue;
     Scanner scanner=new Scanner(System.in);
     Scene1 s1 =new Scene1();
 public void adminFunctions()
 {
        
        
        boolean quit=false;
        Scene1 sc1 =new Scene1();
        
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

            public void addDynamically(){


            System.out.println("Enter the nextLine" );
             dialogue=scanner.next();


         s1.scene1.add(dialogue);
            
           
            }
             public void removeDynamically()
             {
            System.out.println("Enter the index Number of item to be deleted");
            int indexnumber=scanner.nextInt();

          
          s1.scene1.remove(indexnumber);
            }

            
            
             public void  modifyNameDynamically(){
                System.out.println("Enter the index number to be modified");
                int indexnumber=scanner.nextInt();
                System.out.println("Enter the new name");
                String newDialouge=scanner.next();
               // comedian.comedianScript[indexnumber].set(newDialouge);
            }
}