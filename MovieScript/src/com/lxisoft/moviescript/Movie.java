package com.lxisoft.moviescript;
import com.lxisoft.files.File;
import java.io.FileNotFoundException;


import java.util.*;
import java.util.Scanner; 
import java.io.*;
import java.io.FileWriter;
import java.util.ArrayList;

import java.util.Scanner;
public class Movie{

    Actors actors=new	 Actors(String sceneNo, String actorName,String actorDialogue ) {
        this.sceneNo = sceneNo;
        this.actorName =  actorName;
        this.actorDialogue =  actorDialogue;
    }
     @Override
    public String toString() {
        return "Actors{" +
                " sceneNo  ='" + sceneNo + '\'' +
                ",actorName='" + actorName + '\'' +
                ", actorDialogue=" + actorDialogue +
                "}\n";
    }
   Director director=new Director();
	Producer producer=new Producer();
	Comedian comedian=new Comedian();
    FileReppo filereppo=new FileReppo();
    Scanner scanner=new Scanner(System.in);
    String dialogue;

	public void randomCheck(){
		System.out.println("************************************************************************************************");
        System.out.println("************************************************************************************************");
        System.out.println("************************************************************************************************");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                   MOVIE SCRIPT                                       *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("************************************************************************************************");
        System.out.println("************************************************************************************************");
        System.out.println("************************************************************************************************");
        System.out.println("\n FINDING NEMO");
        this.display();

	}

    public void display(){
        System.out.println("PRESS 0 TO CONTINUE");
         int choice=scanner.nextInt();
         
        if(choice==0){


       
        this.adminFunctions();

         System.out.println("\n A RANDOM SCENE");
        System.out.println("************************************************************************************************");
        

        comedian.setcomedianDialoges();
        filereppo.fileCreation();
        this.fileWrite();
     
        


            }
        }
        public void adminFunctions(){
        System.out.println("**********************************");
        System.out.println("\n \n  ***THE CURRENT Comedian SCRIPT IS***");
       
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

            public void addDynamically(){


            System.out.println("Enter the nextLine" );
             dialogue=scanner.next();


          
            comedian.comedianScript.add(dialogue);
           
            }
             public void removeDynamically(){
            System.out.println("Enter the index Number of item to be deleted");
            int indexnumber=scanner.nextInt();

            comedian.comedianScript.remove(indexnumber);
            }

            
            
             public void  modifyNameDynamically(){
                System.out.println("Enter the index number to be modified");
                int indexnumber=scanner.nextInt();
                System.out.println("Enter the new name");
                String newDialouge=scanner.next();
               // comedian.comedianScript[indexnumber].set(newDialouge);
            }

            public void fileWrite(){
                       
            }
    

   



   
	



	
	
}