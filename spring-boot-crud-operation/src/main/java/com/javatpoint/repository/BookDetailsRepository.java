package com.javatpoint.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javatpoint.model.BookDetails;

@Repository
public interface BookDetailsRepository extends JpaRepository<BookDetails, Long> {
    
}
