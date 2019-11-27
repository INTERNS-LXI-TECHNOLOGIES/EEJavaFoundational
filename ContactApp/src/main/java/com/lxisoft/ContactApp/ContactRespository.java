package com.lxisoft.ContactApp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public  interface ContactRespository extends JpaRepository<Contact,String> {

    // custom query to search to contact post by name or contactNumber
    List<Contact> findByNameContainingOrContactNumberContaining(String text,String text1);
    
    
    
}