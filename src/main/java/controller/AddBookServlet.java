package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Author;
import model.Book;
import controller.AuthorHelper;

/**
 * Servlet implementation class AddBookServlet
 */
@WebServlet("/addBookServlet")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Entering AddBookServlet doGet method...");
		   AuthorHelper authorDao = new AuthorHelper();
		    List<Author> allAuthors = authorDao.showAllAuthors();
//		    System.out.println("All authors: " + allAuthors);
		    request.setAttribute("allAuthors", allAuthors);
		    getServletContext().getRequestDispatcher("/addBook.jsp").forward(request, response);
		    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
            
            String title = request.getParameter("bookTitle");
            int authorId = Integer.parseInt(request.getParameter("authorId"));
            
            AuthorHelper ad = new AuthorHelper();
            Author author = ad.searchForAuthorById(authorId);

            Book newBook = new Book(title, author);
            
            BookHelper bd = new BookHelper();  
            bd.insertBook(newBook);
            
            getServletContext().getRequestDispatcher("/index.html").forward(request, response);
        }

}
