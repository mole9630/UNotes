<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>信息显示</title>
</head>
<body>
    <%
        request.setCharacterEncoding("utf-8");
        String userName = request.getParameter("u_name");
        String userSex = request.getParameter("u_sex");
        String userPhone = request.getParameter("u_phone");
        String userEmail = request.getParameter("u_email");
        String userInfo = request.getParameter("u_info");
    %>
    姓名:${param.u_name}<br>
    性别:${param.u_sex}<br>
    电话:${param.u_phone}<br>
    邮件:${param.u_email}<br>
    简介:${param.u_info}<br>
    爱好:${paramValues.u_hobby[0]} ${paramValues.u_hobby[1]} ${paramValues.u_hobby[2]}
</body>
</html>
