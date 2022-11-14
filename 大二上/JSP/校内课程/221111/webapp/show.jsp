<%@ page import="java.util.ArrayList" %>
<%@ page import="com.mole9630.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>显示信息</title>
</head>
<body>
    <c:forEach var="student" items="${msg}">
        学号:${student.sno}, 姓名:${student.name}, 性别:${student.sex}
        <br>
    </c:forEach>
    <hr>
    <%
        ArrayList<Student> students = (ArrayList<Student>) request.getAttribute("msg");
        for (Student student :
                students) {
            out.print("学号:" + student.getSno() + ", 姓名:" + student.getName() + ", 性别:" + student.getSex() + "<br>");
        }
    %>
</body>
</html>
