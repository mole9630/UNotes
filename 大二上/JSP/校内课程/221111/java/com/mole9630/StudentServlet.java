package com.mole9630;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "StudentServlet", value = "/StudentServlet")
public class StudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("101", "张三", "男"));
        students.add(new Student("102", "李四", "男"));
        students.add(new Student("103", "王五", "男"));

        // 存储到request范围内的属性中
        request.setAttribute("msg", students);

        // 跳转到show.jsp页面 确保在同一个请求范围内
        request.getRequestDispatcher("/show.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doGet(request, response);
    }
}
