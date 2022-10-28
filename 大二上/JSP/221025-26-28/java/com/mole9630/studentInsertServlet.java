package com.mole9630;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "studentInsertServlet", value = "/studentInsertServlet")
public class studentInsertServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String userIDStr = request.getParameter("userID");
        int userID = Integer.parseInt(userIDStr);
        String userName = request.getParameter("userName");
        String userSex = request.getParameter("userSex");
        String userBirthday = request.getParameter("userBirthday");

        String sqlStr = "INSERT INTO student_info VALUES(" + userID + ",'" + userName + "','" + userSex + "','" + userBirthday + "')";

        DBUtil dbu = new DBUtil();
        int n = dbu.updataSql(sqlStr);
        String info;

        if (n > 0) {
            info = "添加信息成功!";
            request.setAttribute("message", info);
            request.getRequestDispatcher("/studentResult.jsp").forward(request, response);
        }
        else {
            info = "添加信息失败!";
            request.setAttribute("message", info);
            request.getRequestDispatcher("/studentResult.jsp").forward(request, response);
        }
    }
}
