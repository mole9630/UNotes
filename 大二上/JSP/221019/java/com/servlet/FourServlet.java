package com.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "FourServlet", value = "/FourServlet")
public class FourServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init method is called");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service method is called");
        String str = servletRequest.getParameter("message"); // 无法获取到
        System.out.println(str); // null
    }

    @Override
    public void destroy() {
        System.out.println("destroy method id called");
    }

}
