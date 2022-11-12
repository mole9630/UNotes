<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <jsp:useBean id="userName" class="com.mole9630.UserName" scope="application">
    <jsp:setProperty name="userName" property="*"></jsp:setProperty>
  </jsp:useBean>

  <div>
    用户名:<jsp:getProperty name="userName" property="username"/><br>
    用户名是否合法:<jsp:getProperty name="userName" property="isval"/><br>
    提示信息:<jsp:getProperty name="userName" property="tip"/><br>
  </div>
</body>
</html>
