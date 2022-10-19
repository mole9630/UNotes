package com.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/servlet/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String userPassword = request.getParameter("userPassword");
        String info = "";
        if (userName.equals("admin") && userPassword.equals("admin")){
            info = "欢迎您:" + userName;
        }
        else {
            info = "用户名或密码错误";
        }
        request.setAttribute("message",info);
        request.getRequestDispatcher("/221019/info.jsp").forward(request,response);
    }
}
