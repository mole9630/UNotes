<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>计算求和</title>
</head>
<body>
    结果:
    <%
        String data1 = request.getParameter("data1");
        String data2 = request.getParameter("data2");

        double num1 = Double.parseDouble(data1);
        double num2 = Double.valueOf(data2);
        double sum = num1 + num2;

        out.print(sum);

        if (sum >= 0){
    %>
    <jsp:forward page="positive.jsp"></jsp:forward>
    <%
    }
        else {
    %>
    <jsp:forward page="negative.jsp"></jsp:forward>
    <%
    }
    %>
</body>
</html>
