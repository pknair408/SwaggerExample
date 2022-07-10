package com.javatpoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.model.Author;

import com.javatpoint.repository.AuthorRepo;

@RestController
@RequestMapping("/app")

public class AuthorController {
	
	@Autowired
	private AuthorRepo authorRepo ;
	
	
	@PostMapping("/saveAuthor")
	private Author saveBook(@RequestBody Author author) {
	    return authorRepo.save(author);
	    }

	@GetMapping("/authorlist")
    public List<Author> findAllinfo(){
        return authorRepo.findAll();
	}

}
