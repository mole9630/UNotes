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

        int num1 = Integer.parseInt(data1);
        int num2 = Integer.valueOf(data2);
        int sum = num1 + num2;

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
