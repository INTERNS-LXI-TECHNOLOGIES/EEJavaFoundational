package com.lxisoft.Sample;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManyToOneRepository extends JpaRepository<User,Integer>{

	
}