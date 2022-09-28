<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <style>
        .d1{
            width: 300px;
            /*border: 3px solid #c7edcc;*/
            margin: 10px auto;
        }
    </style>
</head>
<body>
    <div class="d1">
        <form action="loginData.jsp" method="post">
            用户名:<input type="text" name="username" value="" placeholder="请输入用户名" /><br><br>
            密 &nbsp; 码:<input type="password" name="pwd" value="" placeholder="请输入密码" /><br><br>
            <input type="submit" value="登录" />
            <input type="reset" value="重置" />
        </form>
    </div>
</body>
</html>
