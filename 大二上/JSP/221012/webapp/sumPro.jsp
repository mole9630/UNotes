<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>计算</title>
</head>
<body>
    <jsp:useBean id="add" class="com.mole9630.AddPro" scope="application"></jsp:useBean>
    <%--  设置参数  --%>
    <jsp:setProperty name="add" property="*"></jsp:setProperty>
    <%--  获取并输出显示参数 name属性应和第7行的id属性一致  --%>

    计算结果为:
    <%
        int oper = Integer.valueOf(request.getParameter("operator"));
        if (oper == 3 && add.getData2() == 0){
            out.print("错误:除数不能为0");
        }
        else {
    %>

    <jsp:getProperty name="add" property="data1"/>

    <%
            out.print(add.getOper());
    %>

    <jsp:getProperty name="add" property="data2"/> =
    <%=add.getRusult()%>

    <%
        }
    %>
</body>
</html>
