package com.servlet;

import com.mole9630.Circle;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CircleServlet", value = "/CircleServlet")
public class CircleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double r = Double.parseDouble(request.getParameter("r"));
        Circle circle = new Circle(r);

        String oper = request.getParameter("oper");
        String result = "";
        if (oper.equals("all")) {
            Circle circleCircumference = circle.circumference(r);
            Circle circleArea = circle.area(r);
            result = "半径为:" + r + "\n圆的周长为:" + circleCircumference + "\n圆的面积为:" + circleArea;
        }
        else if (oper.equals("circumference")) {
            Circle circleCircumference = circle.circumference(r);
            result = "半径为:" + r + "\n圆的周长为:" + circleCircumference;
        }
        else if (oper.equals("area")) {
            Circle circleArea = circle.area(r);
            result = "半径为:" + r + "\n圆的面积为:" + circleArea;
        }
        else {
            result = "非法参数,请重试";
        }

        request.setAttribute("message", result);

        request.getRequestDispatcher("showCircle.jsp").forward(request, response);
    }
}
