<%@ page import="com.mole9630.Add" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>业务处理</title>
</head>
<body>
    <jsp:useBean id="add" class="com.mole9630.Add" scope="application"></jsp:useBean>
    <%--  设置参数  --%>
<%--    <jsp:setProperty name="add" property="data1" value="10"></jsp:setProperty>--%>
    <jsp:setProperty name="add" property="data1"></jsp:setProperty>
    <jsp:setProperty name="add" property="data2" param="inputData2"></jsp:setProperty>
    <jsp:setProperty name="add" property="data" param="data"></jsp:setProperty>
    <%--  获取并输出显示参数  --%>
    <jsp:getProperty name="add" property="data"/> +
    <jsp:getProperty name="add" property="data1"/> +
    <jsp:getProperty name="add" property="data2"/> =

    <%=add.sum()%>
</body>
</html>