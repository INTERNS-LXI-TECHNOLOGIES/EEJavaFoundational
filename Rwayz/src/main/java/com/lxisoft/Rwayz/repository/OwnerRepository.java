package com.lxisoft.Rwayz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lxisoft.Rwayz.model.Owner;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long>{

}
