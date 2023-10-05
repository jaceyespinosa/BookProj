package model;

import javax.persistence.*;

@Entity
@Table(name="book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;

    @ManyToOne
    private Author author;
    
    
    public Book() {
    	super();
    }
    
    public Book(int id, String title, Author author) {
    	this.id=id;
    	this.title=title;
    	this.author=author;
    }
    
    public Book(String title, Author author) {
    	this.title=title;
    	this.author=author;
    }
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

    // Constructors, Getters, Setters, toString
}