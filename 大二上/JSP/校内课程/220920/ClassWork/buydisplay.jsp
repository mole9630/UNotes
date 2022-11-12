<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<body>
  当前购物车:<br>
  <%
    request.setCharacterEncoding("UTF-8");
    String str = "";
    if (session.getAttribute("s1") != null) {
      str = (String) session.getAttribute("s1");
      out.print(str + "<br>");
    }
    if (session.getAttribute("s2") != null) {
      str = (String) session.getAttribute("s2");
      out.print(str + "<br>");
    }
    if (session.getAttribute("s3") != null) {
      str = (String) session.getAttribute("s3");
      out.print(str + "<br>");
    }
    if (session.getAttribute("s4") != null) {
      str = (String) session.getAttribute("s4");
      out.print(str + "<br>");
    }
    if (session.getAttribute("s5") != null) {
      str = (String) session.getAttribute("s5");
      out.print(str + "<br>");
    }
    if (session.getAttribute("s6") != null) {
      str = (String) session.getAttribute("s6");
      out.print(str + "<br>");
    }
    if (session.getAttribute("s7") != null) {
      str = (String) session.getAttribute("s7");
      out.print(str + "<br>");
    }
    if (session.getAttribute("s8") != null) {
      str = (String) session.getAttribute("s8");
      out.print(str + "<br>");
    }
    if (session.getAttribute("s9") != null) {
      str = (String) session.getAttribute("s9");
      out.print(str + "<br>");
    }
    if (session.getAttribute("s10") != null) {
      str = (String) session.getAttribute("s10");
      out.print(str + "<br>");
    }
  %>
</body>
</html>
