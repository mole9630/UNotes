package com.mole9630;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "OneFilter", urlPatterns = "/OneServlet")
public class OneFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        pw.println("Hello FilterOne");
        chain.doFilter(request, response);
    }
}
