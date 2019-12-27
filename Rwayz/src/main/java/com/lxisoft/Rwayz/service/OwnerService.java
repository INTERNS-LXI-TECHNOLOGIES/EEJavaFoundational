package com.lxisoft.Rwayz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxisoft.Rwayz.model.Owner;
import com.lxisoft.Rwayz.repository.OwnerRepository;


@Service
public class OwnerService {
	
	@Autowired
	private OwnerRepository oRepository;

	public Owner save(Owner owner) {
		return oRepository.save(owner);
	}

	public Owner findById(Long id) {
		return oRepository.findById(id).get();
	}
	

}
