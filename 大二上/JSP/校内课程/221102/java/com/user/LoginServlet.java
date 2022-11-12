package com.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String userName = request.getParameter("user_name");
        String userPassword = request.getParameter("user_password");
        PrintWriter printWriter = response.getWriter();
        if (userName.equals("admin")  && userPassword.equals("admin")) {
            User user = new User(userName, userPassword);
            request.getSession().setAttribute("user", user);
            request.getRequestDispatcher("/IndexServlet").forward(request, response);
            printWriter.println("登录成功.");
        }
        else {
            printWriter.println("用户名或密码错误,请重试.");
        }
    }
}
