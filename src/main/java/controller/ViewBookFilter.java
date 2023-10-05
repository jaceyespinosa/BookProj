package controller;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter(filterName = "ViewBookFilter", urlPatterns = {"/viewAllBooks.jsp"})
public class ViewBookFilter implements Filter {

    public void init(FilterConfig fConfig) throws ServletException {}

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
            throws IOException, ServletException {

        BookHelper d = new BookHelper();
        request.setAttribute("allBooks", d.showAllBooks());
        chain.doFilter(request, response);
    }

    public void destroy() {}
}