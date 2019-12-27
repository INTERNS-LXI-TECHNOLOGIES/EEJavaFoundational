package com.lxisoft.Rwayz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lxisoft.Rwayz.model.BookDetails;
import com.lxisoft.Rwayz.service.BookService;


@RestController
public class BookController {
	
	@Autowired
	private BookService bService;
	
	@PostMapping("/booking")
	public BookDetails save(@RequestBody BookDetails bookDetails) {
		return bService.save(bookDetails);
	}
	
	/*@GetMapping("/booking/{vehicleId}")
	public BookDetails findById(@PathVariable Long vehicleId) {
		return bService.findById(vehicleId);
	}*/
}
