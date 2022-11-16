package com.mole9630;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

//@WebFilter(filterName = "ComFilter", urlPatterns = "/*")
@WebFilter(filterName = "ComFilter", servletNames = {"OneServlet", "TwoServlet"},
        initParams = {@WebInitParam(name = "p1", value = "value1"),@WebInitParam(name = "p2", value = "value2"),@WebInitParam(name = "p3", value = "value3")})
public class ComFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
        String fc1 = config.getInitParameter("p1");
        System.out.println(fc1);
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pw = response.getWriter();
        pw.println("Hello,我是通用的过滤器");

        chain.doFilter(request, response);
    }
}
