<%@ page import="com.mole9630.Add" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/10/9
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>业务处理</title>
</head>
<body>
    <%
        int data1 = Integer.parseInt(request.getParameter("data1"));
        int data2 = Integer.parseInt(request.getParameter("data2"));

        Add add = new Add();
        add.setData1(data1);
        add.setData2(data2);

        out.print(add.getData1() + "<br>");
        out.print(add.getData2() + "<br>");
        out.print(add.getData1() + add.getData2());
    %>
</body>
</html>
