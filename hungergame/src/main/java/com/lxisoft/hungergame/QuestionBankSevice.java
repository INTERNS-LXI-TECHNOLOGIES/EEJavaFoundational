package com.lxisoft.hungergame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionBankSevice {
    
    @Autowired
    private MultipleChoiceQuestionRepository mcRepository ;

    @Autowired
    private TrueOrFalseRepository tfRepository ;

    public void addMultipleChoice(MultipleChoiceQuestion question)
    {
        mcRepository.save(question);
    }

    public void addTrueOrFalse(TrueOrFalse question)
    {
        tfRepository.save(question);
    }
    
}

