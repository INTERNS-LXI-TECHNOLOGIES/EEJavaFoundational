package com.lxisoft.project.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.lxisoft.project.model.Cell;
import com.lxisoft.project.service.CellService;

@Controller
public class GameController {

    @Autowired
    private CellService cellService;
   public List<Cell> cells;

    @GetMapping("/game")
    public String game(Model model) {
         cells = cellService.getAllCellsWithQuestions();
        if (cells.isEmpty()) {
            System.out.println("No cells found.");
        } else {
            cells.forEach(cell -> System.out.println("Cell: " + cell.getName() + ", Questions: " + cell.getQuestions().size()));
        }
        System.out.println("thid is controller");
        model.addAttribute("cells", cells);
        System.out.println(cells.get(0).getName());
        return "game";
    }
    
}
