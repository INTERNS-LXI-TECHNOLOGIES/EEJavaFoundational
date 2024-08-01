package com.lxisoft.internsassist;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BooleanQuestionService {
    @Autowired
    private BooleanQuestionRepository booleanQuestionRepository;


    public BooleanQuestion saveQuestion(BooleanQuestion question) {
        return booleanQuestionRepository.save(question);
    }

    public List<BooleanQuestion> getQuestions()
    {
        return  booleanQuestionRepository.findAll();
    }
 }