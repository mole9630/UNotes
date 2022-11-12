<%@ page import="java.sql.ResultSet" %>
<%@ page import="com.mole9630.DBUtil" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示学生信息</title>
    <style>
        th,td{
            border: 1px solid beige;
            width: 130px;
            text-align: center;
        }
        table{
            margin: 5px auto;
        }
    </style>
</head>
<body>
    <%
        String sql = "select * from student_info";
        DBUtil db = new DBUtil();
        ResultSet rs = db.querySql(sql);
        out.print("<table>" +
                "<caption>学生信息</caption>");
        out.print("<tr>" +
                "<th>学号</th>" +
                "<th>姓名</th>" +
                "<th>性别</th>" +
                "<th>生日</th>" +
                "</tr>");
        while (rs.next()){
            out.print("<tr>" +
                    "<td>"+rs.getInt(1)+"</td>" +
                    "<td>"+rs.getString(2)+"</td>" +
                    "<td>"+rs.getString(3)+"</td>" +
                    "<td>"+rs.getString(4)+"</td>");
        }
        out.print("</table>");
        try{
            if (rs!=null) rs.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    %>
</body>
</html>
