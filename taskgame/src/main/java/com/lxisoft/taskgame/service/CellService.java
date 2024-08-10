package com.lxisoft.taskgame.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxisoft.taskgame.model.Cell;
import com.lxisoft.taskgame.model.QuestionBank;
import com.lxisoft.taskgame.repository.CellRepository;
import com.lxisoft.taskgame.repository.QuestionBankRepository;

@Service
public class CellService {

    @Autowired
    private CellRepository cellRepository;

    @Autowired
    private QuestionBankService qbService;

    @Autowired
    private QuestionBankRepository questionBankRepository;

    private List <Cell> storedCells;

//METHOD FOR GETTING THE CELL BY THE QB LEVEL
   /*  public Cell getCellByQbLevCell(int level){
        storedCells = new ArrayList<>();
        List <Cell> cellByQbLevel = cellRepository.findAll();
        Cell cell =null;
        for(Cell c : cellByQbLevel){
            if(c.getQb().getLevel()== level){
                cell =c;
                break;
            }
        }
        return cell;
    } */

    //METHOD FOR GET A RANDOM ONE WORD QUESTION
    public QuestionBank getQuestion(String type,Long level){
        List<QuestionBank>questionsByIdAndType = qbService.getByQuestionTypeAndLevel(type,level);
        int index = (int) (Math.random() * questionsByIdAndType.size());
        return questionsByIdAndType.get(index);
    }

    //METHOD FOR GENARATING 100 CELLS
    public Cell[][] generateCells(){
        
        Cell[][] cells = new Cell[10][10];
        if(cellRepository.count()== 0){ 
            for(int i=0; i<10; i++){
                for(int j=0; j<10; j++){

                    cells[i][j] = new Cell();
                    if(i<10){
                        List <QuestionBank> prepQuestionBanks = new ArrayList<>();
                        List <QuestionBank> finalQuestionBanks = new ArrayList<>();

                        prepQuestionBanks.add(getQuestion("oneWord",(long)i+1));
                        prepQuestionBanks.add(getQuestion("objective",(long)i+1));
                        prepQuestionBanks.add(getQuestion("hackathon",(long)i+1));
                        prepQuestionBanks.add(getQuestion("speech",(long)i+1));

                            while(finalQuestionBanks.size()<=3){
                                int prepIndex = (int)(Math.random()*prepQuestionBanks.size());
                                if(!finalQuestionBanks.contains(prepQuestionBanks.get(prepIndex))){
                                    finalQuestionBanks.add(prepQuestionBanks.get(prepIndex));
                                }
                            }

                            cells[i][j].setPrepQB(prepQuestionBanks);
                            cells[i][j].setFinalQB(finalQuestionBanks);

                    }
                    if(i>=10 && i<20){
                        List <QuestionBank> prepQuestionBanks = new ArrayList<>();
                        List <QuestionBank> finalQuestionBanks = new ArrayList<>();

                        prepQuestionBanks.add(getQuestion("oneWord",(long)i+1));
                        prepQuestionBanks.add(getQuestion("objective",(long)i+1));
                        prepQuestionBanks.add(getQuestion("hackathon",(long)i+1));
                        prepQuestionBanks.add(getQuestion("speech",(long)i+1));

                            while(finalQuestionBanks.size()==3){
                                int prepIndex = (int)(Math.random()*prepQuestionBanks.size());
                                if(finalQuestionBanks.contains(prepQuestionBanks.get(prepIndex))){
                                    finalQuestionBanks.add(prepQuestionBanks.get(prepIndex));
                                }
                            }

                            cells[i][j].setPrepQB(prepQuestionBanks);
                            cells[i][j].setFinalQB(finalQuestionBanks);
                    }
                    if(i>=20 && i<30){
                        List <QuestionBank> prepQuestionBanks = new ArrayList<>();
                        List <QuestionBank> finalQuestionBanks = new ArrayList<>();

                        prepQuestionBanks.add(getQuestion("oneWord",(long)i+1));
                        prepQuestionBanks.add(getQuestion("objective",(long)i+1));
                        prepQuestionBanks.add(getQuestion("hackathon",(long)i+1));
                        prepQuestionBanks.add(getQuestion("speech",(long)i+1));

                            while(finalQuestionBanks.size()==3){
                                int prepIndex = (int)(Math.random()*prepQuestionBanks.size());
                                if(finalQuestionBanks.contains(prepQuestionBanks.get(prepIndex))){
                                    finalQuestionBanks.add(prepQuestionBanks.get(prepIndex));
                                }
                            }

                            cells[i][j].setPrepQB(prepQuestionBanks);
                            cells[i][j].setFinalQB(finalQuestionBanks);                  
                    }
                    if(i>=30 && i<40){
                        List <QuestionBank> prepQuestionBanks = new ArrayList<>();
                        List <QuestionBank> finalQuestionBanks = new ArrayList<>();

                        prepQuestionBanks.add(getQuestion("oneWord",(long)i+1));
                        prepQuestionBanks.add(getQuestion("objective",(long)i+1));
                        prepQuestionBanks.add(getQuestion("hackathon",(long)i+1));
                        prepQuestionBanks.add(getQuestion("speech",(long)i+1));

                            while(finalQuestionBanks.size()==3){
                                int prepIndex = (int)(Math.random()*prepQuestionBanks.size());
                                if(finalQuestionBanks.contains(prepQuestionBanks.get(prepIndex))){
                                    finalQuestionBanks.add(prepQuestionBanks.get(prepIndex));
                                }
                            }

                            cells[i][j].setPrepQB(prepQuestionBanks);
                            cells[i][j].setFinalQB(finalQuestionBanks);                    
                    }
                    if(i>=40 && i<50){
                        List <QuestionBank> prepQuestionBanks = new ArrayList<>();
                        List <QuestionBank> finalQuestionBanks = new ArrayList<>();

                        prepQuestionBanks.add(getQuestion("oneWord",(long)i+1));
                        prepQuestionBanks.add(getQuestion("objective",(long)i+1));
                        prepQuestionBanks.add(getQuestion("hackathon",(long)i+1));
                        prepQuestionBanks.add(getQuestion("speech",(long)i+1));

                            while(finalQuestionBanks.size()==3){
                                int prepIndex = (int)(Math.random()*prepQuestionBanks.size());
                                if(finalQuestionBanks.contains(prepQuestionBanks.get(prepIndex))){
                                    finalQuestionBanks.add(prepQuestionBanks.get(prepIndex));
                                }
                            }

                            cells[i][j].setPrepQB(prepQuestionBanks);
                            cells[i][j].setFinalQB(finalQuestionBanks);                    
                    } 
                    if(i>=50 && i<60){
                        List <QuestionBank> prepQuestionBanks = new ArrayList<>();
                        List <QuestionBank> finalQuestionBanks = new ArrayList<>();

                        prepQuestionBanks.add(getQuestion("oneWord",(long)i+1));
                        prepQuestionBanks.add(getQuestion("objective",(long)i+1));
                        prepQuestionBanks.add(getQuestion("hackathon",(long)i+1));
                        prepQuestionBanks.add(getQuestion("speech",(long)i+1));

                            while(finalQuestionBanks.size()==3){
                                int prepIndex = (int)(Math.random()*prepQuestionBanks.size());
                                if(finalQuestionBanks.contains(prepQuestionBanks.get(prepIndex))){
                                    finalQuestionBanks.add(prepQuestionBanks.get(prepIndex));
                                }
                            }

                            cells[i][j].setPrepQB(prepQuestionBanks);
                            cells[i][j].setFinalQB(finalQuestionBanks);                     
                    }
                    if(i>=60 && i<70){
                        List <QuestionBank> prepQuestionBanks = new ArrayList<>();
                        List <QuestionBank> finalQuestionBanks = new ArrayList<>();

                        prepQuestionBanks.add(getQuestion("oneWord",(long)i+1));
                        prepQuestionBanks.add(getQuestion("objective",(long)i+1));
                        prepQuestionBanks.add(getQuestion("hackathon",(long)i+1));
                        prepQuestionBanks.add(getQuestion("speech",(long)i+1));

                            while(finalQuestionBanks.size()==3){
                                int prepIndex = (int)(Math.random()*prepQuestionBanks.size());
                                if(finalQuestionBanks.contains(prepQuestionBanks.get(prepIndex))){
                                    finalQuestionBanks.add(prepQuestionBanks.get(prepIndex));
                                }
                            }

                            cells[i][j].setPrepQB(prepQuestionBanks);
                            cells[i][j].setFinalQB(finalQuestionBanks);                    
                    }
                    if(i>=70 && i<80){
                            List <QuestionBank> prepQuestionBanks = new ArrayList<>();
                            List <QuestionBank> finalQuestionBanks = new ArrayList<>();
    
                            prepQuestionBanks.add(getQuestion("oneWord",(long)i+1));
                            prepQuestionBanks.add(getQuestion("objective",(long)i+1));
                            prepQuestionBanks.add(getQuestion("hackathon",(long)i+1));
                            prepQuestionBanks.add(getQuestion("speech",(long)i+1));
    
                                while(finalQuestionBanks.size()==3){
                                    int prepIndex = (int)(Math.random()*prepQuestionBanks.size());
                                    if(finalQuestionBanks.contains(prepQuestionBanks.get(prepIndex))){
                                        finalQuestionBanks.add(prepQuestionBanks.get(prepIndex));
                                    }
                                }
    
                                cells[i][j].setPrepQB(prepQuestionBanks);
                                cells[i][j].setFinalQB(finalQuestionBanks);                        
                    }
                    if(i>=80 && i<90){
                        List <QuestionBank> prepQuestionBanks = new ArrayList<>();
                        List <QuestionBank> finalQuestionBanks = new ArrayList<>();

                        prepQuestionBanks.add(getQuestion("oneWord",(long)i+1));
                        prepQuestionBanks.add(getQuestion("objective",(long)i+1));
                        prepQuestionBanks.add(getQuestion("hackathon",(long)i+1));
                        prepQuestionBanks.add(getQuestion("speech",(long)i+1));

                            while(finalQuestionBanks.size()==3){
                                int prepIndex = (int)(Math.random()*prepQuestionBanks.size());
                                if(finalQuestionBanks.contains(prepQuestionBanks.get(prepIndex))){
                                    finalQuestionBanks.add(prepQuestionBanks.get(prepIndex));
                                }
                            }

                            cells[i][j].setPrepQB(prepQuestionBanks);
                            cells[i][j].setFinalQB(finalQuestionBanks);                      
                    }
                    if(i>=90 && i<100){
                        List <QuestionBank> prepQuestionBanks = new ArrayList<>();
                        List <QuestionBank> finalQuestionBanks = new ArrayList<>();

                        prepQuestionBanks.add(getQuestion("oneWord",(long)i+1));
                        prepQuestionBanks.add(getQuestion("objective",(long)i+1));
                        prepQuestionBanks.add(getQuestion("hackathon",(long)i+1));
                        prepQuestionBanks.add(getQuestion("speech",(long)i+1));

                            while(finalQuestionBanks.size()==3){
                                int prepIndex = (int)(Math.random()*prepQuestionBanks.size());
                                if(finalQuestionBanks.contains(prepQuestionBanks.get(prepIndex))){
                                    finalQuestionBanks.add(prepQuestionBanks.get(prepIndex));
                                }
                            }
                            cells[i][j].setPrepQB(prepQuestionBanks);
                            cells[i][j].setFinalQB(finalQuestionBanks);                     
                    }
                    cellRepository.save(cells[i][j]);
                }
            }
            return cells;
        }
        else{      
              for(int i =0;i<10;i++){
                for(int j=0;j<10;j++){
                    if(questionBankRepository.count()!=0){
                        cells[i][j] = getCellById((long)(i*10+j+1));    
                    }
                    else{
                        System.out.println("qb is null");
                    }
                }
              }
            return cells;
        }
    }

    public Cell getCellById(Long id){
        Cell cell =null;
        Optional<Cell>cellOptional = cellRepository.findById(id);
        if(cellOptional.isPresent()){
            cell = cellOptional.get();
        }
        return cell;
    }
}
