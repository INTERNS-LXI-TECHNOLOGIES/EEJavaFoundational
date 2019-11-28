package com.lxisoft.college;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
    List<Student> findByNameContainingOrIdContaining(String text,int text1);
    
}
