<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/9/14
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示注册信息</title>
</head>
<body>
    <h2>注册信息为以下内容</h2>
    <%
        request.setCharacterEncoding("utf-8"); // 设定字符集,否则中文会乱码
        String username = request.getParameter("username");
        String password = request.getParameter("userpassword");
        String usersex = request.getParameter("sex");
        String from = request.getParameter("from");  //地址栏传递
        if (usersex.equals("1")) {
            usersex = "男";
        }
        else {
            usersex = "女";
        }
    %>

    用户名: <%=username%><br>
    密 &nbsp;&nbsp; 码: <%=password%><br>
    性 &nbsp;&nbsp; 别: <%=usersex%><br>
    来 &nbsp;&nbsp; 源: <%=from%><br>
</body>
</html>
