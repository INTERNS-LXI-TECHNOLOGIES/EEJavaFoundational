package com.lxisoft.chatjson;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public void saveQuestionsFromJson() {
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<Question>> typeReference = new TypeReference<>() {};
        InputStream inputStream = TypeReference.class.getResourceAsStream("/static/questions.json");

        try {
            List<Question> questions = mapper.readValue(inputStream, typeReference);
            questionRepository.saveAll(questions);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}
