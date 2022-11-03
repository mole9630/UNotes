<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
    <div style="width: 300px;margin: 10px auto">
        <form action="/LoginServlet" method="post">
            用户名:<input type="text" name="user_name" placeholder="请输入用户名"><br>
            密&nbsp;&nbsp;&nbsp;码:<input type="password" name="user_password" placeholder="请输入密码"><br>
            <input type="submit" value="登录"> <input type="reset" value="取消">
        </form>
    </div>
</body>
</html>
