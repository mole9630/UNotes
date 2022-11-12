<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Title</title>
</head>
<body>


    <%
        request.setCharacterEncoding("utf-8");
        String username=request.getParameter("username");
        String userPwd=request.getParameter("userPwd");
        String sex=request.getParameter("sex");
        String[] hobby = request.getParameterValues("hobby");
        String constellation =request.getParameter("constellation");
        String introduction =request.getParameter("introduction");


    %>
    <h1>用户信息</h1>
    姓名:<%=username%><br>
    密码:<%=userPwd%><br>
    性别:<%=sex%><br>
    爱好:<%
           for(String temp : hobby){
               out.println(temp + " | ");
           }
        %><br>
    星座:<%=constellation%><br>
    个人信息：<%=introduction%><br>
</body>
</html>
