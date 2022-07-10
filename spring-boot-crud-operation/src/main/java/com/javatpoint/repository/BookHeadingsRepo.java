package com.javatpoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javatpoint.model.BookHeadings;

@Repository

public interface BookHeadingsRepo extends JpaRepository<BookHeadings, Long>{
	

}
