package com.Lxisoft.MovieScriptApp;
import com.Lxisoft.MovieScriptApp.*;
//import com.Lxisoft.Files.*;
//import java.util.io.*;
import java.util.*;

public class Movie
{
	Thanos thanos = new Thanos();
	Thor thor = new Thor();
	Admin admin =new Admin();
	//Director director=new Director();
	//Producer producer=new Producer();
	//Comedian comedian=new Comedian();
    MovieScript movieScript=new MovieScript();
    Filecrtn file=new Filecrtn();
    Scanner scanner=new Scanner(System.in);
    //Actors actors=new Actors();

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
        	admin.adminFunctions();   
        }
        if(choice==2)
        {
             
           movieScript.scenes();
         
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
}


    /*public void choice(){
        System.out.println("PRESS 0 TO CONTINUE");
        int choice=scanner.nextInt();
         
        if(choice==0)
        {

		System.out.println("\n\t\t      Scene ");
        System.out.println("\n\t\t The Entry Of Thanos");
        System.out.println("-----------------------------------------------");
        thor.setThorDialoges();
        thanos.thanosDialogueMethod();
        file.fileCreation();
        


            }
        //if(choice==1)
           //{
           
          	//admin.adminFunctions();
          // }
         //else System.out.println("exit");
}
}
*/