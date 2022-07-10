package com.javatpoint.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



//mark class as an Entity 
@Entity

//defining class name as Table name
@Table(name = "Books")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Books {

//Defining book id as primary key
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String bookname;
private String author;
private int price;


// mappings - - >
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "bookDetails_id")
    private BookDetails bookDetails;

@OneToMany(targetEntity = BookHeadings.class, cascade = CascadeType.ALL)
@JoinColumn(name = "book_id", referencedColumnName = "id")
    private List<BookHeadings> bookHeadings;

@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
            name="books_and_authors",
            joinColumns = @JoinColumn( name="book_id"),
            inverseJoinColumns = @JoinColumn( name="author_id"))
	private List<Author> authors;
	

}