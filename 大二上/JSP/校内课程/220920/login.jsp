<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/9/20
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <style>
        .d1{
            width: 200px;
            margin: 0 auto;
            /*border: 3px solid #c7edcc;*/
            background: #c7edcc;
            padding: 20px;
        }
    </style>
</head>
<body>
    <div class="d1">
        <form action="userinfo.jsp" method="post">
            用户名:<input type="text" name="username" placeholder="请输入用户名"/><br />
            密 &nbsp; 码:<input type="password" name="pwd" placeholder="请输入密码"/><br /><br />
            <input type="submit" value="登录" /> &nbsp;&nbsp;&nbsp;
            <input type="reset" value="重置" />
        </form>
    </div>
</body>
</html>
