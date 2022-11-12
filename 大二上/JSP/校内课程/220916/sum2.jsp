<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/9/16
  Time: 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>计算求和</title>
</head>
<body>
    获取数据 -> 处理数据 -> 判断跳转不同页面<br>
    结果:
    <%
        String data1 = request.getParameter("data1");
        String data2 = request.getParameter("data2");

        double num1 = Double.parseDouble(data1);//方法1
        double num2 = Double.valueOf(data2); //方法2
        double sum = num1 + num2;

        out.print(sum);

        if (sum >= 0){
    %>
    <jsp:forward page="true.jsp"></jsp:forward>
    <%
    }
        else {
    %>
    <jsp:forward page="false.jsp"></jsp:forward>
    <%
    }
    %>
</body>
</html>
