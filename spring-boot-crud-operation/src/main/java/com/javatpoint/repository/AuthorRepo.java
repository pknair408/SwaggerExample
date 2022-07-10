package com.javatpoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javatpoint.model.Author;

@Repository

public interface AuthorRepo  extends JpaRepository<Author, Long>{
    
}
