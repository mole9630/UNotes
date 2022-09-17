<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String select = request.getParameter("bookName");
        out.print(select);
        if (select.equals("0")){
        %>
            <jsp:forward page="jsp.jsp"></jsp:forward>
        <%
        }
        else if (select.equals("1"))
        {
        %>
            <jsp:forward page="jquery.jsp"></jsp:forward>
        <%
        }
        else if (select.equals("2"))
        {
        %>
            <jsp:forward page="php.jsp"></jsp:forward>
        <%
        }
    %>
</body>
</html>
