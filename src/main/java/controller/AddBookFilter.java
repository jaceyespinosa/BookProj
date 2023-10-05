package controller;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName = "AddBookFilter", urlPatterns = {"/addBook.jsp"})
public class AddBookFilter implements Filter {

    public AddBookFilter() {}

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
        throws IOException, ServletException {
        
        request.getRequestDispatcher("/addBookServlet").forward(request, response);
    }

    @Override
    public void destroy() {
       
    }
}