package com.lxisoft.internsassist.repository;

import com.lxisoft.internsassist.model.Role;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
