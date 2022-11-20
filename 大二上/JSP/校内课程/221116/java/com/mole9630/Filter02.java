package com.mole9630;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "Filter02", urlPatterns = "/TwoServlet")
public class Filter02 implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        pw.println("Filter02 Before<br>");
        // 卸载过滤器链调用doFilter()方法的前面对请求进行过滤处理
        chain.doFilter(request, response);
        pw.println("Filter02 After<br>");
    }
}
