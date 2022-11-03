package com.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "IndexServlet", value = "/IndexServlet")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        Cookie cookie = null;
        if (user == null) {
            response.getWriter().println("您还未登录,请先去<a href='login.jsp'>登录</a>");
        }
        else {
            response.getWriter().println("欢迎您" + user.getUserName() + ",<a href='/LoginOutServlet'>退出</a>");
            cookie = new Cookie("JSESSIONID", session.getId());
            cookie.setMaxAge(3 * 60 * 60 * 60);
        }
        cookie.setPath("/");
        response.addCookie(cookie);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
