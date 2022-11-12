<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<body>
    <%
      request.setCharacterEncoding("UTF-8");
      if (request.getParameter("canon") != null) {
        session.setAttribute("s1", request.getParameter("canon"));
      }
      if (request.getParameter("sony") != null) {
        session.setAttribute("s2", request.getParameter("sony"));
      }if (request.getParameter("fujifilm") != null) {
        session.setAttribute("s3", request.getParameter("fujifilm"));
      }if (request.getParameter("leica") != null) {
        session.setAttribute("s4", request.getParameter("leica"));
      }
      if (request.getParameter("panasonic") != null) {
        session.setAttribute("s5", request.getParameter("panasonic"));
      }
    %>
    相机类:<br>
    <form method="post" action="buyCamera.jsp">
      <p>
        <input type="checkbox" name="canon" value="佳能">佳能&nbsp;&nbsp;
        <input type="checkbox" name="sony" value="索尼">索尼&nbsp;&nbsp;
        <input type="checkbox" name="fujifilm" value="富士">富士&nbsp;&nbsp;
        <input type="checkbox" name="leica" value="徕卡">徕卡&nbsp;&nbsp;
        <input type="checkbox" name="panasonic" value="松下">松下
      </p>
      <p>
        <input type="submit" value="提交" name="B1">
        <a href="buyTwo.jsp">其他专区</a> &nbsp;
        <a href="buydisplay.jsp">查看购物车</a>
      </p>
    </form>
</body>
</html>
