package com.mole9630;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "studentDeleteServlet", value = "/studentDeleteServlet")
public class studentDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String userContentStr = request.getParameter("userContent");

        String selectStr = request.getParameter("select");
        int select = Integer.parseInt(selectStr);


        DBUtil dbu = new DBUtil();
        int n = -1;

        if (select == 0) {
            int userContent = Integer.parseInt(userContentStr);
            String sqlDelIdStr = "DELETE FROM student_info WHERE id=" + userContent;
            n = dbu.updataSql(sqlDelIdStr);
        }
        else if (select == 1) {
            String sqlDelNameStr = "DELETE FROM student_info WHERE name='" + userContentStr + "'";
            n = dbu.updataSql(sqlDelNameStr);
        }
        else {
            System.out.println("非法请求");
        }


        String info;

        if (n > 0) {
            info = "删除信息成功!";
            request.setAttribute("message", info);
            request.getRequestDispatcher("/studentResult.jsp").forward(request, response);
        }
        else {
            info = "删除信息失败!";
            request.setAttribute("message", info);
            request.getRequestDispatcher("/studentResult.jsp").forward(request, response);
        }
    }
}
