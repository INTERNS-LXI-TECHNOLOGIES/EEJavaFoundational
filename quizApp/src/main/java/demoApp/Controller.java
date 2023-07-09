
package demoApp;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.Option;

public class Controller {
  public int userscore;
  
  public int percent;
  ArrayList<Question> questions = new ArrayList<Question>();
  

  public Controller(){
    
    questions.add(new Question("Goat of Football?", "C.Ronaldo", "Z.Zidane", "L.messi", "C.Ronaldo"));
    questions.add(new Question("Best Footall Club", "Real Madrid", "Bayern", "Liverpool", "Real Madrid"));
    questions.add(new Question("Fastest Animal?", "Lion", "Puma", "Cheetah", "Cheetah"));
    questions.add(new Question("Goat of Midfielder?", "Zidane", "Ozil", "Modric", "Zidane"));
    questions.add(new Question("Footall Club with Most Champions League", "Real Madrid", "Bayern", "AC Milan", "Real Madrid"));
    questions.add(new Question("what kind of liquid is water?", "H20", "its kind of a gel", "coffee", "H20"));
    questions.add(new Question("Which club has most trophies?", "Real Madrid", "Bayern", "Man.Utd","Real Madrid"));
    questions.add(new Question("Player with most Goals in History?", "C.Ronaldo", "Pele", "L.messi", "C.Ronaldo"));
    questions.add(new Question("what is java?", "its a car", "its an oop Language", "its a coffee",  "its an oop Language"));
    questions.add(new Question("what is football", "its a ball", "its an oop", "its a Game", "its a Game"));

 
} 
public String removeLastChar(String s) {
    if (s == null || s.length() == 0) {
        return s;
    }
    return s.substring(0, s.length()-2);
}


public void updateScore(Question question, String option ){
if(question.getRightAnswer().equals(option) ){
  userscore++;
}

}
//percent = (userscore*100)/questions.size();
public ArrayList loadQuestions(){
  return questions;
}
public void passOrFail(){
  
  if(percent>=50){
    System.out.println("You have passed the Quiz");
  }
  else{
    System.out.println("Sorry you Failed!");
  }
  
}


}