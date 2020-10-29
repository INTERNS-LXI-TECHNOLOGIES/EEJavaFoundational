package com.Lxisoft.MovieScriptApp;
import java.util.*;

public class CaptainAmerica
{
	public ArrayList<String> caArray = new ArrayList<String>();
	private String caDialogue;
	Random random=new Random();
	
	public void setcaDialogue(String a)
	{
		this.caDialogue=a;

	}

	public String getcaDialogue()
	{
		return caDialogue;
	}

	public void caDialogueMethod()
	{
		caArray.add("Thanos : Iam Waitinng");
		caArray.add("Thanos : Give Throne With Stone");
		System.out.println(caArray.get(random.nextInt(caArray.size())));

		
		
	}
}