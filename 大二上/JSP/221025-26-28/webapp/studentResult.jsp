<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>操作结果</title>
</head>
<body>
    <div style="width: 300px; margin: 10px auto">
        <%=
            request.getAttribute("message")
        %>
        <br>
        <a href="index.jsp">返回主页</a>
    </div>
</body>
</html>
