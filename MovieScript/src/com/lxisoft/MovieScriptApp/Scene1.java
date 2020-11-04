package com.Lxisoft.MovieScriptApp;
import com.Lxisoft.MovieScriptApp.*;
import java.util.*;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner; 
import java.io.*;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;
import java.io.BufferedReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files; 
import java.nio.file.Paths; 
import java.util.ArrayList; 
import java.util.Collections; 
import java.util.List;

public class Scene1
{
	
	Scanner scanner=new Scanner(System.in);
	ArrayList<String>  scene1= new ArrayList<>();
    
	Random random=new Random();
	private int randomNumber;


    public void setRandomNumber(int a)
    {
    this.randomNumber=a;

    }
    public int getRandomNumber(){
        return randomNumber;
    }

	public void addingDialogue()
	{
   
  

   scene1.add("SCENE 1");
   scene1.add(" Tony Stark : Hey!");

   scene1.add("Father : The door is this way, pal.");

scene1.add("Tony Stark : Oh, yeah.");

scene1.add("Father : Looking for Doctor Zola, have you seen him?");

scene1.add("Tony Stark : Yeah, Doctor Zola.\nNo, I haven't seen a soul.");

scene1.add("Tony Stark : Pardon me.");

scene1.add("Father : Do I know you?");

scene1.add("Tony Stark : No, sir.");

scene1.add("Tony Stark : I'm a visitor from MIT.");

scene1.add("Father : MIT.");

scene1.add("Father : Got a name?");

scene1.add("Tony Stark : Howard.");
scene1.add("Father : - That'll be easy to remember.\n - Howard... ");

scene1.add("Father :  Potts.");

scene1.add("Tony Stark : Well, I'm Howard Stark. ");

scene1.add("............THE END( Scene-1 )..............");

}
public void createFile()
{
	try{
            FileOutputStream writeData = new FileOutputStream("MovieScriptData.txt");
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
            System.out.println("File IS Created");
            writeStream.writeObject(scene1);
           
        }catch (IOException e) {
            e.printStackTrace();
        }
}
public void scene1Array()
{
	for(int i=0;i<scene1.size();i++)
		{
			System.out.println(scene1.get(i));
		}
	this.createFile(); 	
} 
public void sc1()
{
   System.out.println("SCENE 1");

	System.out.println(" Tony Stark : Hey!");

   System.out.println("Father : The door is this way, pal.");

System.out.println("Tony Stark : Oh, yeah.");

System.out.println("Father : Looking for Doctor Zola, have you seen him?");

System.out.println("Tony Stark : Yeah, Doctor Zola.\nNo, I haven't seen a soul.");

System.out.println("Tony Stark : Pardon me.");

System.out.println("Father : Do I know you?");

System.out.println("Tony Stark : No, sir.");

System.out.println("Tony Stark : I'm a visitor from MIT.");

System.out.println("Father : MIT.");

System.out.println("Father : Got a name?");

System.out.println("Tony Stark : Howard.");
System.out.println("Father : - That'll be easy to remember.\n - Howard... ");

System.out.println("Father :  Potts.");

System.out.println("Tony Stark : Well, I'm Howard Stark. ");

System.out.println("............THE END( Scene-1 )..............");



}

public void readFile() throws Exception{

List<String> lines = Collections.emptyList(); 
try {
lines = Files.readAllLines(Paths.get(""), StandardCharsets.UTF_8); 
} 
catch (IOException e) {
 // TODO Auto-generated catch block
  e.printStackTrace();
  } System.out.println("Content of List:"); 
  System.out.println(lines);



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

       }
     }//for if




}


	

}
}