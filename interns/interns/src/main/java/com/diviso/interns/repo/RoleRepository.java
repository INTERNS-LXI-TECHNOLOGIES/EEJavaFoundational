package com.diviso.interns.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diviso.interns.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
