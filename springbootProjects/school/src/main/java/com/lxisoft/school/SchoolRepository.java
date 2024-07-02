package com.lxisoft.school;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository  extends JpaRepository<School,Long>
{
public School findByName(String name);

}