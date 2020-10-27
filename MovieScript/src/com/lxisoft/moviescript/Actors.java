package com.lxisoft.moviescript;
import com.lxisoft.moviescript.Movie;
import java.util.*;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner; 
import java.io.*;
import java.io.FileWriter;
import java.util.ArrayList;

public class Actors   implements Serializable{
    private String sceneNo;
    private String actorName;
    private String actorDialogue;

    public Actors(String sceneNo, String actorName,String actorDialogue ) {
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


    public void addDialogues(){
        
  		Actors a1     = new  Actors("SCENE1","CORAL","man delivered");
        Actors a2 = new Actors("SCENE1","MARLIN", "And it wasn't so easy.");
        Actors a3 = new Actors("SCENE1","CORAL", "Because a lot of other clownfish had their eyes on this place..");

        Actors a4 = new Actors("SCENE1", "MARLIN", "You better believe they did--every single one of them.");

        ArrayList<Actors> actorsDialogue = new ArrayList<>();

        actorsDialogue.add(a1);
        actorsDialogue.add(a2);
        actorsDialogue.add(a3);
    }


	

	

}