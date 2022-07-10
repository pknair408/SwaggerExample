package com.javatpoint.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javatpoint.model.Books;
import com.javatpoint.repository.BooksRepository;

//defining the business logic
@Service

public class BooksService {

@Autowired
private BooksRepository booksRepository;

//getting all books record by using the method findaAll() of CrudRepository
public List<Books> getAllBooks() {
    List<Books> books = new ArrayList<Books>();
    booksRepository.findAll().forEach(books1 -> books.add(books1));
    return books;
    }


//getting a specific record by using the method findById() of CrudRepository
public Optional<Books> getBooksById(Long id) {
    return booksRepository.findById(id);
    }


//saving a specific record by using the method save() of CrudRepository
public void saveBook(Books book) {
	booksRepository.save(book);
	}

//deleting a specific record by using the method deleteById() of CrudRepository
public void delete(Long id) {
    booksRepository.deleteById(id);
    }


//updating a record
public void bookUpdate(Books books) {
    booksRepository.saveAndFlush(books);
    }





}