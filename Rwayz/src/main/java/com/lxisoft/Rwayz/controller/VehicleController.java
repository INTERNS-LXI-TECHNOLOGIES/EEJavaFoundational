package com.lxisoft.Rwayz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lxisoft.Rwayz.model.Vehicle;
import com.lxisoft.Rwayz.service.VehicleService;

@RestController
public class VehicleController {
	
	@Autowired
	private VehicleService vService;
	
	@PostMapping("/vehicle")
	public Vehicle saveVehicle(@RequestBody Vehicle vehicle) {
		return vService.save(vehicle);
	}
	
	@GetMapping("/vehicle/{id}")
	public Vehicle findById(@PathVariable Long id) {
		return vService.findById(id);
	}
	

}
