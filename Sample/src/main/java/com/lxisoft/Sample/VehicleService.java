package com.lxisoft.Sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {
@Autowired
VehicleRepository repo;
}
