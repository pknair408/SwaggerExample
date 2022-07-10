package com.javatpoint.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.javatpoint.model.Books;
import com.javatpoint.service.BooksService;

//mark class as Controller
@RestController
@RequestMapping("/app")

public class BooksController {

//autowire the BooksService class
@Autowired
private BooksService booksService;

//creating a get mapping that retrieves all the books detail from the database 

@GetMapping("/book")
private List<Books> getAllBooks() {
    return booksService.getAllBooks();
    }


//creating a get mapping that retrieves the detail of a specific book

//@GetMapping("/book/{id}")
//private Optional<Books> getBooks(@PathVariable("id") Long id) {
//    return booksService.getBooksById(id);
//    }

@GetMapping("/book/{id}")
private Optional<Books> getBookById(@PathVariable Long id) {
    return booksService.getBooksById(id);
    }


//creating a delete mapping that deletes a specified book

@DeleteMapping("/book/{id}")
private void deleteBook(@PathVariable("id") Long id) {
    booksService.delete(id);
    }


//creating post mapping that post the book detail in the database

@PostMapping("/saveBook")
private Books saveBook(@RequestBody Books book) {
    booksService.saveBook(book);
   
    return book;
    }


//creating put mapping that updates the book detail 

@PutMapping("/updateBook")
private Books updateBook(@RequestBody Books books) {
    booksService.bookUpdate(books);
    return books;
    }
    
}
