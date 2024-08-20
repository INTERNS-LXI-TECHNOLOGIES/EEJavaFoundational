package com.diviso.interns.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.diviso.interns.entity.Question;
import com.diviso.interns.repo.QuestionRepository;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public List<Question> findMultipleChoiceQuestionsByCellId(Long cellId) {
        // Logic to retrieve multiple choice questions based on cellId
        return questionRepository.findByCellIdAndOptionsQuestionIsNotNull(cellId);
    }

    public List<Question> findTrueFalseQuestionsByCellId(Long cellId) {
        // Logic to retrieve true/false questions based on cellId
        return questionRepository.findByCellIdAndTrueFalseQuestionIsNotNull(cellId);
    }

    public List<Question> findRealTestQuestionsByCellId(Long cellId) {
        // Logic to retrieve questions for the real test based on cellId
        return questionRepository.findByCellId(cellId);
    }

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public Question saveQuestion(Question question) {
        return questionRepository.save(question);
    }
}
