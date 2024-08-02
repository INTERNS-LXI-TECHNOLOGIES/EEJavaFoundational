package com.lxisoft.taskgame.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxisoft.taskgame.model.Cell;
import com.lxisoft.taskgame.repository.CellRepository;

@Service
public class CellService {

    @Autowired
    private CellRepository cellRepository;

    @Autowired
    private QuestionBankService qbService;

    public Cell getCellByQbLevCell(int level){
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
                    cells[i][j] = getCellByQbLevCell(i+1);   
                    long id =(long)((i*10)+j+1);
                    cells[i][j].setId(id);
                }
              }
            return cells;
        }
    }
}
