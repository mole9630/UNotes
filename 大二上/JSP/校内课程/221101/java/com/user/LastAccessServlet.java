package com.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "LastAccessServlet", value = "/LastAccessServlet")
public class LastAccessServlet extends HttpServlet {
//    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 指定服务器输出内容的编码方式UTF-8 防止乱码
        response.setContentType("text/html;charset=UTF-8");
        // 获取多个cookies
        Cookie[] cookies = request.getCookies();
        boolean flag = false;
        if (cookies.length > 0 && cookies != null) {
            for (Cookie cookie:cookies) {
                String name = cookie.getName();
                if (name.equals("lastTime")) {
                    flag = true;
                    String value = cookie.getValue(); // 上次访问的时间
                    System.out.println("解码前的value值:" + value);
                    value = URLDecoder.decode(value, "utf-8");
                    System.out.println("解码后的value值:" + value);
                    response.getWriter().println("欢迎回来,您上次访问的时间为:" + value);

                    // 设置cookie中的value
                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String strdate = sdf.format(date);
                    System.out.println("编码前的value值:" + strdate);
                    strdate = URLEncoder.encode(strdate, "utf-8");
                    System.out.println("编码后的value值:" + strdate);
                    cookie.setValue(strdate);
                    cookie.setMaxAge(60 * 60 * 24 * 30); // 存活时间30天
                    response.addCookie(cookie);
                    break;
                }
            }
        }
        if (cookies.length ==0 || cookies == null || flag == false) { // 如果没有cookies
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String strdate = sdf.format(date);
            System.out.println("编码前的value值:" + strdate);
            strdate = URLEncoder.encode(strdate, "utf-8");
            System.out.println("编码后的value值:" + strdate);
            Cookie cookie = new Cookie("lastTime", strdate);
            cookie.setMaxAge(60 * 60 * 24 * 30); // 存活时间30天
            response.addCookie(cookie);
            response.getWriter().println("欢迎您!");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
