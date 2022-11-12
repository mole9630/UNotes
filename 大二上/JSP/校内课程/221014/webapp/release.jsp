<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:useBean id="email" class="com.mole9630.Email" scope="application"></jsp:useBean>
    <jsp:setProperty name="email" property="*"></jsp:setProperty>
    <jsp:getProperty name="email" property="title"/>
    <hr>
    <jsp:getProperty name="email" property="content"/>
</body>
</html>
