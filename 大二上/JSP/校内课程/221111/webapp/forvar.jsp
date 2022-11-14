<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>forvar</title>
</head>
<body>
    <c:forEach var="color" begin="2" step="2" items="红,橙,黄,绿,蓝,靛,紫">
        ${color}
    </c:forEach>

    <hr>

    <c:forEach var="i" begin="10" end="50" step="5" varStatus="status">
        <c:if test="${status.first}">
            begin:${status.begin}<br>
            end:${status.end}<br>
            step:${status.step}<br>
            <c:out value="输出元素:"></c:out>
        </c:if>

        <%-- ${i}等同于下一行 --%>
        <c:out value="${i}"></c:out>

        <c:if test="${status.last}">
            <br><c:out value="共输出${status.count}个元素"></c:out>
        </c:if>
    </c:forEach>

    <hr>
</body>
</html>
