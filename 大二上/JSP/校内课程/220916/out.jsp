<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/9/16
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>输出数据</title>
</head>
<body>
  <%
    double num1 = (double) request.getAttribute("num1");
    double num2 = (double) request.getAttribute("num2");
    double sum = (double) request.getAttribute("sum");
  %>
  <%=num1%> + <%=num2%> = <%=sum%>
  <br>
  <%
    String num3 = request.getParameter("num1");
    String num4 = request.getParameter("num2");
    double sum1 = Double.parseDouble(num3) + Double.parseDouble(num4);
  %>
  <%=num3%> + <%=num4%> = <%=sum1%>
</body>
</html>
