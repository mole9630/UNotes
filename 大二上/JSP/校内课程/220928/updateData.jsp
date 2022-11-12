<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新数据</title>
</head>
<body>
<%
    // 获取表单信息
    String userName = request.getParameter("username");
    String userPassword = request.getParameter("pwd");

    // 连接数据库
    String sqlUrl = "jdbc:mysql://localhost:3308/book";
    String sqlUser = "root";
    String sqlPassword = "root";
    Connection con = null;
    Statement stm = null;
    String sql;
    int returnSql;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver"); //5.5版本以下需去掉路径cj
        con = DriverManager.getConnection(sqlUrl, sqlUser, sqlPassword);

        //插入操作
        sql = "INSERT INTO user VALUES(1501,\"Zhaoyi\",\"123125\",\"JDBC插入的记录\"),(1502,\"Wangerma\",\"246492\",\"JDBC插入的记录\"),(1503,\"Xiaoming\",\"532254\",\"JDBC插入的记录\")";

        stm = con.createStatement();
        returnSql = stm.executeUpdate(sql);
        out.print("√ 成功插入" + returnSql + "条数据<br>");

        sql = "UPDATE user set memo=\"JDBC修改的数据\" WHERE userid in (1501,1502,1503);";
        stm.executeUpdate(sql);
        out.print("√ 成功修改" + returnSql + "条数据<br>");


        sql = "DELETE FROM user WHERE userid in (1501,1502,1503)";
        returnSql = stm.executeUpdate(sql);
        out.print("√ 成功删除" + returnSql + "条数据<br>");

    } catch (Exception e) {
        e.printStackTrace();
    } finally { //释放资源
        try {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
%>
</body>
</html>
