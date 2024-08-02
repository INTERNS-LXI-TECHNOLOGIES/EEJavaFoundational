package com.lxisoft.taskgame.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lxisoft.taskgame.model.QuestionBank;
import java.util.List;


@Repository
public interface QuestionBankRepository extends JpaRepository <QuestionBank,Long>{
    public QuestionBank findByLevel(int level);
}
