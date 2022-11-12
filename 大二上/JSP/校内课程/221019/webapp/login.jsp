<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
  <div style="width: 300px; margin: 10px auto;">
    <form action="/servlet/LoginServlet" method="post">
      用户名:<input type="text" name="userName" placeholder="请输入用户名"><br><br>
      密 &nbsp;&nbsp; 码:<input type="password" name="userPassword" placeholder="请输入密码"><br><br>
      <input type="submit" value="登录">&nbsp;&nbsp;&nbsp;
      <input type="reset" value="取消">
    </form>
  </div>
</body>
</html>
