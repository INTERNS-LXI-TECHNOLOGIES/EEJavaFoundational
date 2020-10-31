package com.lxisoft.moviescript;
import com.lxisoft.moviescript.Movie;
import java.util.*;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner; 
import java.io.*;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;

public class Actors   implements Serializable{
	 ArrayList<String>  actordialogue= new ArrayList<>();
     Scanner scanner=new Scanner(System.in);
	 Random random=new Random();
	 private int randomNumber;
    public void setRandomNumber(int a){
        this.randomNumber=a;

    }
    public int getRandomNumber(){
        return randomNumber;
    }

	public void addingDialogue(){
   
  

   actordialogue.add("SCENE 1");
   actordialogue.add(" SCENE 1 Marlin: WOW");

   actordialogue.add("SCENE 1 :CORAL Mmm.");

actordialogue.add("SCENE 1:MARLIN Wow.");

actordialogue.add("SCENE 1:CORAL Mmm-hmm.");

actordialogue.add("SCENE 1:MARLIN Wow.");

actordialogue.add("SCENE 1:CORAL :Yes, Marlin. No, I see it. It's beautiful.");

actordialogue.add("SCENE 1:MARLIN:So, Coral, when you said you wanted an ocean view, you didn't think that we we're gonna get the whole ocean, did you? Huh? [sighs] Oh yeah. A fish can breath out here. Did yourman deliver or did he deliver?");

actordialogue.add("SCENE 2");

actordialogue.add(" SCENE 2 NEMO :First day of school! First day of school! Wake up, wake up! C'mon, first day of school! ");

actordialogue.add("SCENE 2 MARLINI: don't wanna go to school. Five more minutes.");

actordialogue.add("SCENE 2 NEMO :Not you, dad. Me!");

actordialogue.add("SCENE 2 MARLIN: Okay...huh?");
actordialogue.add("SCENE 2 NEMO: Get up, get up! It's time for school! It's time for school! It's time for school!It's time for school! Oh boy! Oh boy! ");

actordialogue.add("SCENE 2MARLIN:All right, I'm up.");

actordialogue.add("SCENE 2:NEMO :Oh boy--whoa! ");

actordialogue.add("............THE END..............");


this.createFile();
this.randomSelection();
}

public void createFile(){
	try{
            FileOutputStream writeData = new FileOutputStream("F:\\Program files\\EEJavaFoundational\\MovieScript\\src\\com\\lxisoft\\moviescript\\moviescriptfile.ser");
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

            writeStream.writeObject(actordialogue);
            writeStream.flush();
            writeStream.close();

        }catch (IOException e) {
            e.printStackTrace();
        }
}

public void randomSelection(){
     int index = random.nextInt(actordialogue.size());
     String randomDialogue=actordialogue.get(index);
     System.out.println("RANDOM DIALOGUE:"+randomDialogue);
     System.out.println("PRESS 0 TO CONTINUE");
      int choice=scanner.nextInt();
      if(choice==0){


     for(int i=index;i<actordialogue.size();i++){
        System.out.println(actordialogue.get(i));

     }}//for if

     public void randomSelection(){
     int index = random.nextInt(actordialogue.size());
     String randomDialogue=actordialogue.get(index);
     System.out.println("RANDOM DIALOGUE:"+randomDialogue);
     System.out.println("PRESS 0 TO CONTINUE");
      int choice=scanner.nextInt();
      if(choice==0){


     for(int i=index;i<actordialogue.size();i++){
        System.out.println(actordialogue.get(i));

     }}//for if


}


	

}