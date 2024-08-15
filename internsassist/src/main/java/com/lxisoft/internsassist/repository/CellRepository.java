package com.lxisoft.internsassist.repository;

import com.lxisoft.internsassist.model.Cell;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CellRepository extends JpaRepository<Cell, Long> {
    Cell findByCellNumber(int cellNumber);
}
