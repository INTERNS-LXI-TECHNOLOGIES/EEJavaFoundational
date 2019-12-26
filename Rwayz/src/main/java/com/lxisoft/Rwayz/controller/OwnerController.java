package com.lxisoft.Rwayz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lxisoft.Rwayz.model.Owner;
import com.lxisoft.Rwayz.service.OwnerService;

@RestController
public class OwnerController {
	
	@Autowired 
	private OwnerService oService;
	
	@PostMapping("/owner")
	public Owner saveVehicle(@RequestBody Owner owner) {
		return oService.save(owner);
	}
	
	@GetMapping("/owner/{id}")
	public Owner findById(@PathVariable Long id) {
		return oService.findById(id);
	}

}
