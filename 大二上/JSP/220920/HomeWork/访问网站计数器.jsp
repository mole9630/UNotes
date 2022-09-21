<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>访问网站计数器</title>
</head>
<body>
    <%! Integer totalVisitors = new Integer(1);%>
    <%
        if(session.isNew()){
            Integer amount = (Integer)application.getAttribute("count");
            if(amount == null){
                amount = new Integer(1);
            }
            else{
                amount = new Integer(amount.intValue() +1);
            }
            application.setAttribute("count", amount);
            totalVisitors = (Integer) application.getAttribute("count");
        }
    %>
    您是第<%=totalVisitors%>位访客.
</body>
</html>
