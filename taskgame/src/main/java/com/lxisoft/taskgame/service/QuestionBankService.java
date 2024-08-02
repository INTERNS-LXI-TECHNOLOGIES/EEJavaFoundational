package com.lxisoft.taskgame.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxisoft.taskgame.model.QuestionBank;
import com.lxisoft.taskgame.repository.QuestionBankRepository;

@Service
public class QuestionBankService{
    
    @Autowired
    private QuestionBankRepository qbRepoitory;

    public void addNewQuestion(QuestionBank qb){
        qbRepoitory.save(qb);
    }

    public QuestionBank getQbByLevel(int level){
        return qbRepoitory.findByLevel(level);
    }
}