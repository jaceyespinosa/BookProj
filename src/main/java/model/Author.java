package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    
    
    public Author() {
    	super();
    }
    
    public Author(int id, String name) {
    	this.id = id;
    	this.name = name;
    }
    
    public Author(String name) {
    	this.name = name;
    }
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@OneToMany(mappedBy="author", cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    private List<Book> books;


}