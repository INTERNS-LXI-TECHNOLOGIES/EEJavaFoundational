package com.lxisoft.internsassist.controller;

import com.lxisoft.internsassist.service.PlayersService;
import com.lxisoft.internsassist.service.QuestionService;
import com.lxisoft.internsassist.repository.PlayerRepository;
import com.lxisoft.internsassist.repository.UserRepository;
import com.lxisoft.internsassist.model.Player;
import com.lxisoft.internsassist.model.Question;
import com.lxisoft.internsassist.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

@Controller
public class PlayerController {
     @Autowired
    private QuestionService questionService;

    @Autowired
    private PlayersService playersService;

    @Autowired
    private UserRepository userRepository;

    private Random random = new Random();

    @GetMapping("/")
    public String showFirstPage() {
        return "firstpage";
    }

    @GetMapping("/home")
    public String showAddPlayerForm(Model model, @AuthenticationPrincipal UserDetails currentUser) {
        // Fetch the User entity from the database
        User user = userRepository.findByUserName(currentUser.getUsername());

        // Create a new Player entity and set the User and Name fields
        Player player = new Player();
        player.setUser(user);
        player.setName(user.getUserName());

        model.addAttribute("player", player);

    return "home";
}





    private Question getRandomQuestion(List<Question> questions) {
        if (questions.isEmpty()) {
            return null; // Handle case with no questions
        }
        int index = random.nextInt(questions.size());
        return questions.get(index);
    }

    @GetMapping("/add")
    public String next(Model model, @AuthenticationPrincipal UserDetails currentUser) {
        Player player = new Player();
        User user = userRepository.findByUserName(currentUser.getUsername());
        player.setUser(user);
        player.setName(user.getUserName());
        model.addAttribute("player", player);


   // Retrieve all questions and categorize them by type
   List<Question> allQuestions = questionService.getAllQuestion();

   // Get the list of already assigned questions
   Set<Question> assignedQuestions = player.getQuestions();

   // Filter available questions by type, excluding already assigned ones
   List<Question> oneWordQuestions = allQuestions.stream()
           .filter(q -> "one_word".equals(q.getType()) && !assignedQuestions.contains(q))
           .collect(Collectors.toList());

   List<Question> multipleChoiceQuestions = allQuestions.stream()
           .filter(q -> "multiple_choice".equals(q.getType()) && !assignedQuestions.contains(q))
           .collect(Collectors.toList());

   List<Question> trueFalseQuestions = allQuestions.stream()
           .filter(q -> "true_false".equals(q.getType()) && !assignedQuestions.contains(q))
           .collect(Collectors.toList());

   // Randomly select one question of each type, if available
   List<Question> selectedQuestions = new ArrayList<>();

   if (!oneWordQuestions.isEmpty()) {
       Question randomOneWordQuestion = getRandomQuestion(oneWordQuestions);
       selectedQuestions.add(randomOneWordQuestion);
   }

   if (!multipleChoiceQuestions.isEmpty()) {
       Question randomMultipleChoiceQuestion = getRandomQuestion(multipleChoiceQuestions);
       selectedQuestions.add(randomMultipleChoiceQuestion);
   }

   if (!trueFalseQuestions.isEmpty()) {
       Question randomTrueFalseQuestion = getRandomQuestion(trueFalseQuestions);
       selectedQuestions.add(randomTrueFalseQuestion);
   }

   // Assign the selected questions to the player if they haven't been assigned yet
   playersService.assignQuestionsToPlayer(player, selectedQuestions);

   model.addAttribute("oneWordQuestion", oneWordQuestions);
   model.addAttribute("multipleChoiceQuestion", multipleChoiceQuestions);
   model.addAttribute("trueFalseQuestion", trueFalseQuestions);
   

        return "game-board";
    }
    /*
     * @PostMapping("/add")
     * public String addPlayer(@ModelAttribute("player") @Validated Player player,
     * BindingResult result, Principal principal) {
     * if (result.hasErrors()) {
     * return "home";
     * }
     * 
     * // Get the authenticated user's username
     * String username = principal.getName();
     * 
     * // Find the user by username
     * User user = userRepository.findByUserName(username);
     * 
     * if (user != null) {
     * player.setUser(user);
     * playersService.savePlayer(player);
     * }
     * 
     * return "game-board";
     * }
     */
}
