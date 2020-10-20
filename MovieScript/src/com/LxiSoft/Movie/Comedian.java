package com.LxiSoft.Movie;
import java.util.*;
public class Comedian extends Actors 
{
public ArrayList<String> comediDialogue= new ArrayList<String>();
	Random random=new Random();

private String comedyDialogue;

public void setComedyDialogue(String a)
{
	this.comedyDialogue=a;
}	
public String getComedyDialogue()
{
	return comedyDialogue;
}

public void randomComedyDialogue()
	{
		comediDialogue.add("Trainer: If an old man and a child come near your car, what will you hit?\nGirl: Old man.\nTrainer: Idiot. You should hit the BRAKE.");
		comediDialogue.add("Boy: Hey, you look so beautiful\nGirl: Aww. Thank you. I don’t know what to say.\nBoy: Just lie something, like I did.");							
	
	System.out.println(comediDialogue.get(random.nextInt(comediDialogue.size())));
	}

}