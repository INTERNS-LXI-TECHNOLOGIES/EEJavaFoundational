package com.diviso.contactapp.repo;

import com.diviso.contactapp.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    // Define custom queries or methods if needed
}
