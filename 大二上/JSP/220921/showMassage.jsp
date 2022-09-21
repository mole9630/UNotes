<%@ page import="java.util.Vector" %>
<%@ page import="java.util.StringTokenizer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>留言板内容</title>
</head>
<body>
    <%
        Object obj = application.getAttribute("massage");
        if (obj == null){
            out.print("暂无留言内容,换个时间再来看看吧");
        }
        else {
            Vector<String> obt = (Vector<String>) obj;
            for (int i=obt.size()-1; i<=0; i--){
                StringTokenizer st = new StringTokenizer(obt.get(i), ".");
                while (st.hasMoreElements()){
                    out.print(st.nextToken() + "<br>");
                }
            }
        }
    %>
</body>
</html>
