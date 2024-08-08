package com.lxisoft.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lxisoft.project.model.Cell;
import com.lxisoft.project.repository.CellRepository;

@Service
public class CellService {

    @Autowired
    private CellRepository cellRepository;

    public List<Cell> getAllCellsWithQuestions() {
        return cellRepository.findAll();
    }

    public Cell saveCell(Cell cell) {
        return cellRepository.save(cell);
    }
}


