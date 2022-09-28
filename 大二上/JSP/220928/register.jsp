<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
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
        <form action="registerData.jsp" method="post">
            用 户 I D:<input type="text" name="userID" value="" placeholder="请输入用户ID" /><br><br>
            用 户 名:<input type="text" name="userName" value="" placeholder="请输入用户名" /><br><br>
            密 &nbsp;&nbsp;&nbsp;&nbsp; 码:<input type="password" name="userPassword" value="" placeholder="请输入密码" /><br><br>
            确认密码:<input type="password" name="reUserPassword" value="" placeholder="请重复输入密码" /><br><br>
            备 &nbsp;&nbsp;&nbsp;&nbsp; 注:<input type="text" name="memo" value="" placeholder="请输入备注" /><br><br>
            <input type="submit" value="登录" />
            <input type="reset" value="重置" />
        </form>
    </div>
</body>
</html>
