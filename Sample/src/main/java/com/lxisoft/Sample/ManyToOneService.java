package com.lxisoft.Sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManyToOneService{
	@Autowired
	ManyToOneRepository repo;
	public User createUser(User user) {
		return repo.save(user);
	}
	
}