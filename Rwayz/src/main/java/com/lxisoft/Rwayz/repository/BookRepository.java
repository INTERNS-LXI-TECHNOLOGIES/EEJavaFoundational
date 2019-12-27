package com.lxisoft.Rwayz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lxisoft.Rwayz.model.BookDetails;


@Repository
public interface BookRepository extends JpaRepository<BookDetails, Long>{
	
/*	@Query (value="select * from book_details where vehicleId=:vehicleId",nativeQuery = true)
	public Optional<BookDetails> findById(@Param("vehicleId") Long vehicleId);*/

}