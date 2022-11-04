<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String[] str = {"张三", "李四", "王五"};

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("班级1");
        arrayList.add("班级2");
        arrayList.add("班级3");

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("student", "学生");
        hashMap.put("worker", "工人");

        request.setAttribute("str", str);
        session.setAttribute("list", arrayList);
        application.setAttribute("hashMap", hashMap);
    %>
    使用EL来获取信息并显示:<br>
    ${str[1]}<br>

    ${list[1]}<br>
    ${sessionScope.list[1]}<br>

    ${hashMap["student"]}<br>
    ${applicationScope.hashMap["student"]}<br>
</body>
</html>
