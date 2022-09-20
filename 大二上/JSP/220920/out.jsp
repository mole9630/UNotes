<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/9/20
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <%
    out.print("print打印不换行");
    out.print("------------");
    out.println("println打印换行");
    out.print("------------");
    out.newLine(); //观察是否换行 -实际输出的为空格
    out.print("------------");
    out.print("<br>");
    out.print("------------<br>");
    out.print("缓冲区大小:"+ out.getBufferSize() + "<br>");
    out.print("剩余空间大小:"+ out.getRemaining());
  %>
</body>
</html>
