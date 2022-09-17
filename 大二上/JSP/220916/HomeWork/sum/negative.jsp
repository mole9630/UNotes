<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    结果为 负 :
    <%
        String data1 = request.getParameter("data1");
        String data2 = request.getParameter("data2");

        double num1 = Double.parseDouble(data1);//方法1
        double num2 = Double.valueOf(data2); //方法2
        double sum = num1 + num2;

        out.print(sum);
    %>
</body>
</html>
