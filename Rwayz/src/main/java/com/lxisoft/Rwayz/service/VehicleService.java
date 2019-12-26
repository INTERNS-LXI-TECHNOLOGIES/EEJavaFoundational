package com.lxisoft.Rwayz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxisoft.Rwayz.model.Vehicle;
import com.lxisoft.Rwayz.repository.VehicleRepository;

@Service 
public class VehicleService {
	
	@Autowired 
	private VehicleRepository vRepository;
	
	public Vehicle save(Vehicle vehicle) {
		return vRepository.save(vehicle);
	}

	public Vehicle findById(Long id) {
		// TODO Auto-generated method stub
		return vRepository.findById(id).get();
	}

}
