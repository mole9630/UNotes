package com.mole9630;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "ForwardFilter", urlPatterns = "/first.jsp", dispatcherTypes = {DispatcherType.FORWARD})
public class ForwardFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        pw.println("Hello ForwardFilter, Forbid first.jsp.");

//        chain.doFilter(request, response);
    }
}
