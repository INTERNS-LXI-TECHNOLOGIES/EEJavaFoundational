package com.lxisoft.Rwayz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxisoft.Rwayz.model.BookDetails;
import com.lxisoft.Rwayz.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bRepository;

	public BookDetails save(BookDetails bookDetails) {
		return bRepository.save(bookDetails);
	}

	/*public BookDetails findById(Long vehicleId) {
		return bRepository.findById(vehicleId).get();
	}*/

}
