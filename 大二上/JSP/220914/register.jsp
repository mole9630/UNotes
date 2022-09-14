<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/9/14
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册(request内置对象)</title>
    <style>
        .d1{border: 3px solid #c7edcc; width: 300px; margin: 0 auto;}
        .d2{width: 100px; margin: 0 auto;}
    </style>
</head>
<body>
    <div class="d1">
        <form name="form1" action="showinfo.jsp?from=register页" method="post">
            用户名:<input type="text" name="username" placeholder="请输入用户名"><br>
            密 &nbsp;&nbsp; 码:<input type="password" name="userpassword" placeholder="请输入密码"><br>
            性 &nbsp;&nbsp; 别:<input type="radio" name="sex" value="1" checked="checked"> 男 <input type="radio" name="sex" value="0"> 女 <br><br>
            <div class="d2">
                <input type="submit" value="提交">
                <input type="reset" value="重置">
            </div>
        </form>
    </div>
</body>
</html>
