package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Book;

import java.io.IOException;

@WebServlet("/deleteBookServlet")
public class DeleteBookServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("bookId"));
        
        BookHelper bd = new BookHelper();
        Book bookToDelete = bd.searchForBookById(id);
        
        bd.deleteBook(bookToDelete);
        

        response.sendRedirect(request.getContextPath() + "/viewAllBooksServlet");
    }
}