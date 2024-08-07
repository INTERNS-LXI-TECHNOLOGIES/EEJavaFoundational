package com.lxisoft.hungergame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GameController {

    Cell[] cells = new Cell[100];

    @Autowired
    private GameService gameService ;

    @GetMapping("/game/main")
    public String getMainPage(Model model) {
        for (int i = 0; i < 100; i++) {
            cells[i] = new Cell();
            cells[i].setNumber(i+1);
            cells[i].setLocked(i != 0); 
        }
        model.addAttribute("cells", cells);
        return "main";
    }

    @GetMapping("/cell-details") 
    public String getCellDetails(@RequestParam("cellNumber") int cellNumber, Model model) {
        Cell cell = getCell(cellNumber-1);
        model.addAttribute("cell", cell);
        return "cell-details";
    }

    public Cell getCell(int number)
    {
        return cells[number];
    }

    @GetMapping("/missionMultipleChoice")
    public String getMultipleChoice(Model model) {
        MultipleChoiceQuestion mcQueston = gameService.getMultipleChoiceQuestion();
        model.addAttribute("question", mcQueston);
        return "multipleChoice";
    }

    @GetMapping("/missionTrueOrFalse")
    public String getTrurOrFalse(Model model) {
        TrueOrFalse tfQueston = gameService.getTrurOrFalseQuestion();
        model.addAttribute("question", tfQueston);
        return "trueOrFalse";
    }
    
}
