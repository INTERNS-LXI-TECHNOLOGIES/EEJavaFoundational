package com.lxisoft.internsassist;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CellRepository extends JpaRepository<Cell, Long> {
    Cell findByCellNumber(int cellNumber);
}
