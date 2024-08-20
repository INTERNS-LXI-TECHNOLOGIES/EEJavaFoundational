package com.diviso.interns.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.diviso.interns.entity.Cell;
import com.diviso.interns.repo.CellRepository;

@Service
public class CellService {

    @Autowired
    private CellRepository cellRepository;

    public List<Cell> getAllCellsWithQuestions() {
        // Logic to retrieve all cells with their associated questions
        return cellRepository.findAll();
    }

    public Cell saveCell(Cell cell) {
        return cellRepository.save(cell);
    }
}
