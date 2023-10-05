package controller;

import model.Author;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class AuthorHelper {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("BookProj");

    public void insertAuthor(Author a) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();
        em.close();
    }

    public List<Author> showAllAuthors() {
        EntityManager em = emf.createEntityManager();
        List<Author> allAuthors = em.createQuery("SELECT a FROM Author a", Author.class).getResultList();
        return allAuthors;
    }

    public Author searchForAuthorById(int id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Author found = em.find(Author.class, id);
        em.close();
        return found;
    }
    

}