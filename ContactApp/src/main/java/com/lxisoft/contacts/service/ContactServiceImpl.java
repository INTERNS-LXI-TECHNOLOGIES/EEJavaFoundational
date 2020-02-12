package com.lxisoft.contacts.service;

import javax.transaction.Transactional;
import org.springframework.transaction.annotation.Propagation;

import org.springframework.stereotype.Service;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ContactServiceImpl 
{
	

}
