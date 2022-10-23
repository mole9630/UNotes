package com.servlet;

import com.mole9630.Complex;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CalulateServlet", value = "/CalulateServlet")
public class CalulateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double real1 = Double.parseDouble(request.getParameter("real1"));
        double imag1 = Double.parseDouble(request.getParameter("imag1"));
        Complex c1 = new Complex(real1,imag1);

        double real2 = Double.parseDouble(request.getParameter("real2"));
        double imag2 = Double.parseDouble(request.getParameter("imag2"));
        Complex c2 = new Complex(real2,imag2);

        String oper = request.getParameter("oper");
        String result = "";
        if (oper.equals("+")){
            Complex com = c1.add(c2);
            result = com.toString(); //等同于下方内容
        }
        else if (oper.equals("-")){
            result = c1.sub(c2).toString();
        }
        else if (oper.equals("*")){
            result = c1.mul(c2).toString();
        }
        else if (oper.equals("/")){
            result = c1.div(c2).toString();
        }
        else {
            result = "错误,请重试!";
        }

        request.setAttribute("message",result);

        RequestDispatcher ds = request.getRequestDispatcher("showResult.jsp");// 1
        ds.forward(request,response); // 2 该两行等同于下方一行

        // request.getRequestDispatcher("showResult.jsp").forward(request,response);
    }
}
