<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<body>
    <%
        request.setCharacterEncoding("UTF-8");
        if (request.getParameter("b1") != null) {
            session.setAttribute("s6", request.getParameter("b1"));
        }
        if (request.getParameter("b2") != null) {
            session.setAttribute("s7", request.getParameter("b2"));
        }
        if (request.getParameter("b3") != null) {
            session.setAttribute("s8", request.getParameter("b3"));
        }
    %>
    球类:
    <form method="post" action="buyTwo.jsp">
        <p>
            <input type="checkbox" name="b1" value="篮球">篮球&nbsp;&nbsp;
            <input type="checkbox" name="b2" value="足球">足球&nbsp;
            <input type="checkbox" name="b3" value="排球">排球
        </p>
        <p>
            <input type="submit" value="提交" name="x1">
            <a href="buyCamera.jsp">其他专区</a>&nbsp;
            <a href="buydisplay.jsp">查看购物车</a>
        </P>
    </form>
</body>
</html>
