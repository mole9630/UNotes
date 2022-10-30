package com.mole9630;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "studentUpdateServlet", value = "/studentUpdateServlet")
public class studentUpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String oldUserIDStr = request.getParameter("oldUserID");
        int oldUserID = Integer.parseInt(oldUserIDStr);
        String newUserIDStr = request.getParameter("userID");
        int newUserID = Integer.parseInt(newUserIDStr);
        String userName = request.getParameter("userName");
        String userSex = request.getParameter("userSex");
        String userBirthday = request.getParameter("userBirthday");

        String sqlStr = "UPDATE Person SET id=" + newUserID + ",name='" + userName + "','sex=" + userSex + "','birthday=" + userBirthday + "' WHERE id=" + oldUserID;

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
