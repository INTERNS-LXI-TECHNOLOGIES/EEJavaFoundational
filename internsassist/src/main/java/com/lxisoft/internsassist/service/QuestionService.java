package com.lxisoft.internsassist.service;

import com.lxisoft.internsassist.repository.QuestionRepository;
import com.lxisoft.internsassist.model.Question;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    public Optional<Question> getQuestionByCellNumber(int cellNumber) {
        return questionRepository.findByCell_CellNumber(cellNumber);
    }

    public Question saveQuestion(Question question) {
        return questionRepository.save(question);
    }

    public List<Question> getAllQuestion()
    {
        return  questionRepository.findAll();
    }

    
 }
