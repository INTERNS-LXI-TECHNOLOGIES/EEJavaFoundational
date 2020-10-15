package com.lxisoft.moviescript;
import com.lxisoft.files.File;


import java.util.*;
import java.io.*;
import java.io.FileWriter;
import java.util.ArrayList;
public class Movie{
	
	Director director=new Director();
	Producer producer=new Producer();
	Comedian comedian=new Comedian();
    FileReppo filereppo=new FileReppo();

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
        


        System.out.println("\n A RANDOM SCENE");
         System.out.println("************************************************************************************************");

        
        
        comedian.setcomedianDialoges();
        filereppo.fileCreation();
        

	}

    public void writeToFile(String name){
        

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