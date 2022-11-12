package com.servlet;

import com.mole9630.Register;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

@WebServlet(name = "RegisterServlet", value = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("userName");
        String sex = request.getParameter("userSex");;
        String birthday = request.getParameter("userBirthday");;
        String ethnicity = request.getParameter("userEthnicity");;
        String introduction = request.getParameter("userIntroduction");

        Register reg = new Register(name, sex, birthday, ethnicity, introduction);

        String result = "姓名:" + reg.getName() + "<br>性别:" + reg.getSex() + "<br>生日:" + reg.getBirthday() + "<br>民族:" + reg.getEthnicity() + "<br>个人介绍:" + reg.getIntroduction();

        request.setAttribute("message", result);
        request.getRequestDispatcher("showRegister.jsp").forward(request, response);
    }
}
