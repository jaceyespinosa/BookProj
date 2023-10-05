package controller;

import model.Book;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class BookHelper {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("BookProj");

    public void insertBook(Book b) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(b);
        em.getTransaction().commit();
        em.close();
    }

    public List<Book> showAllBooks() {
        EntityManager em = emf.createEntityManager();
        List<Book> allBooks = em.createQuery("SELECT b FROM Book b", Book.class).getResultList();
        return allBooks;
    }
    
    public Book searchForBookById(int id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Book found = em.find(Book.class, id);
        em.close();
        return found;
    }
    
    public void deleteBook(Book bookToDelete) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.merge(bookToDelete)); 
        em.getTransaction().commit();
        em.close();
    }
    
}