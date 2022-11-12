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

        int num1 = Integer.parseInt(data1);//方法1
        int num2 = Integer.valueOf(data2); //方法2
        int sum = num1 + num2;

        out.print(sum);
    %>
</body>
</html>
