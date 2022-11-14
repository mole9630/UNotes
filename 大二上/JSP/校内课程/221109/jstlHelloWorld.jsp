<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.Vector" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>JSTL输出Hello World</title>
</head>
<body>
    <c:out value="Hello World1"></c:out><br>
    <c:out value="${'Hello World2'}"></c:out><br>
    <%-- value 随便写一个不存在或为空的变量即可--%>
    <c:out default="Hello World3" value="${a}"></c:out>
    <hr>

    <%-- 获取当前的"时" --%>
    <%
        Calendar rightNow = Calendar.getInstance();
        Integer Hour = new Integer(rightNow.get(Calendar.HOUR_OF_DAY));
        request.setAttribute("hour", Hour);
    %>

    <%-- 使用if单分支 --%>
    <c:if test="${hour>=0 && hour<=11}">
        现在是上午<c:out value="${hour}"></c:out>点,上午好!<br>
    </c:if>
    <c:if test="${hour>11 && hour<=13}">
        现在是中午<c:out value="${hour}"></c:out>点,中午好<br>
    </c:if>
    <c:if test="${hour>13 && hour<=18}">
        现在是下午<c:out value="${hour}"></c:out>点,下午好<br>
    </c:if>
    <c:if test="${hour>18 && hour<=24}">
        现在是晚上<c:out value="${hour}"></c:out>点,晚上好
    </c:if>
    <hr>

    <%-- 使用choose多分支 --%>
    <c:choose>
        <c:when test="${hour>=0 && hour<11}">
            现在是上午<c:out value="${hour}"></c:out>点,上午好!<br>
        </c:when>
        <c:when test="${hour>=11 && hour<13}">
            现在是中午<c:out value="${hour}"></c:out>点,中午好<br>
        </c:when>
        <c:when test="${hour>=13 && hour<17}">
            现在是下午<c:out value="${hour}"></c:out>点,下午好<br>
        </c:when>
        <c:when test="${hour>=17 && hour<24}">
            现在是晚上<c:out value="${hour}"></c:out>点,晚上好
        </c:when>
    </c:choose>
    <hr>

    <%-- 使用forEach循环 --%>
    <c:forEach var="item" begin="0" end="10" step="3">
        ${item}
    </c:forEach>
    <br>
    <%
        Vector vector = new Vector();
        vector.add("合肥");
        vector.add("芜湖");
        vector.add("淮北");
        pageContext.setAttribute("vector",vector);
    %>
    <c:forEach items="${vector}" var="item">
        ${item}
    </c:forEach>
</body>
</html>
