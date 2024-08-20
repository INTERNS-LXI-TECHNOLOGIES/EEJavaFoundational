package com.diviso.interns.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.diviso.interns.entity.Cell;

public interface CellRepository extends JpaRepository<Cell, Long> {
    // Additional custom query methods can be added here if needed
}
