package com.Lxisoft.MovieScriptApp;
import com.Lxisoft.MovieScriptApp.*;
//import com.Lxisoft.Files.*;
//import java.util.io.*;
import java.util.*;

public class Movie
{
	Thanos thanos = new Thanos();
	Thor thor = new Thor();
	//Director director=new Director();
	//Producer producer=new Producer();
	//Comedian comedian=new Comedian();
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
   		this.choice();
    }

    public void choice(){
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
}
}
