package com.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "ThreeServlet", value = "/ThreeServlet")
//@WebServlet(name = "ThreeServlet", urlPatterns = "/ThreeServlet") // 等价于上方
@WebServlet(name = "ThreeServlet", urlPatterns = {"/ThreeServlet", "/3Servlet"}) // 一个Servlet可以映射多个url

public class ThreeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        pw.print("Hello ThreeServlet-doGet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        pw.print("Hello ThreeServlet-doPostss");
    }
}
