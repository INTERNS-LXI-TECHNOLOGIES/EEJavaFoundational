package com.lxisoft.hungergame;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    @Autowired
    private PlayerRepository playerRepository ;

    @Autowired
    private UserRepository userRepository ;

    @Autowired
    CoustomUserDetails userDetails ;

    @Autowired
    private MultipleChoiceQuestionRepository multipleChoiceQuestionRepository;

    @Autowired
    private TrueOrFalseRepository trueOrFalseRepository;
    
    public void addPlayerName(String name)
    {
        User user = userRepository.findByUsername(name);

        Player player = new Player();
        player.setName(user.getUsername());
        player.setEmail(user.getEmail());
        player.setUser(user);

        playerRepository.save(player);
    }

    public List<Player> getInterns()
    {
        return playerRepository.findAll();
    }

    public MultipleChoiceQuestion getMultipleChoiceQuestion()
    {
        List<MultipleChoiceQuestion> mcQuestions = multipleChoiceQuestionRepository.findAll();
        int random = (int) (Math.random() * mcQuestions.size());

        MultipleChoiceQuestion question = mcQuestions.get(random);

        return question ;
    }

    public TrueOrFalse getTrurOrFalseQuestion()
    {
        List<TrueOrFalse> tfQuestions = trueOrFalseRepository.findAll();
        int random = (int) (Math.random() * tfQuestions.size());

        TrueOrFalse question = tfQuestions.get(random);

        return question;
    }
}
