<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/9/7
  Time: 10:21
  To change this template use File | Settings | File Templates.
  JSP基本语法
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP基本语法</title>
</head>
<body>
    <%
        // 编程实现5的阶乘
        int fact = 1; //public int fact = 1; 不允许在脚本段内声明
        for (int i = 1; i <= 5; i++)
        {
            fact = fact * i;
        }
    %>

    <%
        System.out.println(fact); //输出在控制台
        out.print("<h2>" + fact + "</h2>"); //输出在页面
    %>

    <%! //JSP声明
        public int n=0;
        public void outString(){
            System.out.println("Hello World" + n);
        }
    %>

    <%
        n++;
        out.print("<h2>" + n + "</h2>");
        outString();
    %>
    <h2>
        <%=n%> <%--用表达式输出--%>
    </h2>

    <%!
        public String url="link.jsp";
    %>

    <a href="link.jsp">跳转</a>
    <form action="link.jsp" method="get">
        <input type="submit" value="跳转">
    </form>
    <br>
    <a href="<%=url%>">跳转</a> <%--使用了表达式--%>
    <form action="<%=url%>" method="get"> <%--使用了表达式--%>
        <input type="submit" value="跳转">
    </form>
</body>
</html>
