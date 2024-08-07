package com.lxisoft.taskgame.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxisoft.taskgame.model.Cell;
import com.lxisoft.taskgame.model.QuestionBank;
import com.lxisoft.taskgame.repository.CellRepository;

@Service
public class CellService {

    @Autowired
    private CellRepository cellRepository;

    @Autowired
    private QuestionBankService qbService;

    private List <Cell> storedCells;

    public Cell getCellByQbLevCell(int level){
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
    }

    public Cell[][] generateCells(){
        
        Cell[][] cells = new Cell[10][10];
        if(cellRepository.count()== 0){ 
            
            Set <QuestionBank> cellQuestions = new HashSet<>();
            List <QuestionBank> qb

            for(int i=0; i<10; i++){
                for(int j=0; j<10; j++){
                    cells[i][j] = new Cell();
                    if(i<10){
                        cells[i][j].setQb(qbService.getQbByLevel(i+1));
                    }
                    if(i>=10 && i<20){
                        cells[i][j].setQb(qbService.getQbByLevel(i+1));
                    }
                    if(i>=20 && i<30){
                        cells[i][j].setQb(qbService.getQbByLevel(i+1));
                    }
                    if(i>=30 && i<40){
                        cells[i][j].setQb(qbService.getQbByLevel(i+1));
                    }if(i>=40 && i<50){
                        cells[i][j].setQb(qbService.getQbByLevel(i+1));
                    }
                    if(i>=50 && i<60){
                        cells[i][j].setQb(qbService.getQbByLevel(i+1));
                    }
                    if(i>=60 && i<70){
                        cells[i][j].setQb(qbService.getQbByLevel(i+1));
                    }
                    if(i>=70 && i<80){
                        cells[i][j].setQb(qbService.getQbByLevel(i+1));
                    }
                    if(i>=80 && i<90){
                        cells[i][j].setQb(qbService.getQbByLevel(i+1));
                    }
                    if(i>=90 && i<100){
                        cells[i][j].setQb(qbService.getQbByLevel(i+1));
                    }

                cellRepository.save(cells[i][j]);
                }
            }
        return cells;
        }
        else{      
              for(int i =0;i<10;i++){
                for(int j=0;j<10;j++){
                    if(qbService !=null){
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
