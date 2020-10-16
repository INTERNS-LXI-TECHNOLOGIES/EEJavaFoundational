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
	
	Director director=new Director();
	Producer producer=new Producer();
	Comedian comedian=new Comedian();
    FileReppo filereppo=new FileReppo();
    Scanner scanner=new Scanner(System.in);

	Actors actors=new Actors();

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
        System.out.println("\n MOVIE NAME:DESPICABLE ME");
        this.display();

	}

    public void display(){
        System.out.println("PRESS 0 TO CONTINUE");
         int choice=scanner.nextInt();
         
        if(choice==0){


        System.out.println("\n A RANDOM SCENE");
        System.out.println("************************************************************************************************");
        comedian.setcomedianDialoges();
        filereppo.fileCreation();


            }


    }

    public void writeToFile(ArrayList<String> comedianScript){
        

        try{
            FileOutputStream writeData = new FileOutputStream("newfile.txt");
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

            writeStream.writeObject(actors.comedian.comedianScript);
            writeStream.flush();
            writeStream.close();

            }catch (IOException e) {
            e.printStackTrace();
        }
    }



   
	



	
	
}