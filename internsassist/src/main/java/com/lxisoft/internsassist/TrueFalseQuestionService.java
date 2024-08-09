package com.lxisoft.internsassist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrueFalseQuestionService {

    @Autowired
    private TrueFalseQuestionRepository trueFalseQuestionRepository;

    public List<TrueFalseQuestion> getAllTrueFalseQuestions() {
        return trueFalseQuestionRepository.findAll();
    }

    public Optional<TrueFalseQuestion> getTrueFalseQuestionById(Long id) {
        return trueFalseQuestionRepository.findById(id);
    }

    public TrueFalseQuestion saveTrueFalseQuestion(TrueFalseQuestion trueFalseQuestion) {
        return trueFalseQuestionRepository.save(trueFalseQuestion);
    }

    public void deleteTrueFalseQuestion(Long id) {
        trueFalseQuestionRepository.deleteById(id);
    }
}
