<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/9/7
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    跳转完成!
    <%--这里是注释部分(动态注释(在源代码内看不到))--%>
    <%
        int s = 1;
        for (int i=1; i<5; i++){
            s *= i;
        }
        out.print("<h2>" + s + "</h2>");
        // 功能:计算5的阶乘并输出(在源代码内看不到)
        /*
        * 这里是多行/文本注释(在源代码内看不到)
        */
    %>
</body>
</html>
