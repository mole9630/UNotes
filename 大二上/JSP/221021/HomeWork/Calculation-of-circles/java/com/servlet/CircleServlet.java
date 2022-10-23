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
        double r = 0;
        r = Double.parseDouble(request.getParameter("r"));
        Circle circle = new Circle(r);

        String oper = request.getParameter("oper");
        String result = "";
        if (r <= 0) {
            result = "半径为非法参数,请重试";
        }
        else if (oper.equals("all")) {
            result = "半径为:" + r + "<br>圆的周长为:" + String.format("%.2f", circle.circumference(r)) + "<br>圆的面积为:" + String.format("%.2f", circle.area(r));
        }
        else if (oper.equals("circumference")) {
            result = "半径为:" + r + "<br>圆的周长为:" + String.format("%.2f", circle.circumference(r));
        }
        else if (oper.equals("area")) {
            result = "半径为:" + r + "<br>圆的面积为:" + String.format("%.2f", circle.area(r));
        }
        else {
            result = "非法参数,请重试";
        }

        request.setAttribute("message", result);

        request.getRequestDispatcher("showCircle.jsp").forward(request, response);
    }
}
