package br.edu.ifpb.monteiro.ads.bibliosoft.session;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author vanderlan
 */

public class SessionValidatorFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        
        HttpSession session = ((HttpServletRequest) request).getSession(false);
        
        if (session != null && !session.isNew()) {
            chain.doFilter(request, response);
        } else {
            
            System.err.println(((HttpServletRequest) request).getContextPath());
            //Redirect to login page
//            ((HttpServletResponse) response).sendRedirect("http://www.google.com");
//            ((HttpServletResponse) response).sendRedirect(((HttpServletRequest) request).getContextPath() + "/login.xhtml");
            
//            System.err.println(((HttpServletRequest) request).getContextPath());
        
        }
    }

    @Override
    public void destroy() {

    }

}
