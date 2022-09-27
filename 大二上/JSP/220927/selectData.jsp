<%@ page import="java.sql.*" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询数据</title>
</head>
<body>
    <%
        String sqlUrl = "jdbc:mysql://localhost:3306/book";
        String sqlUser = "root";
        String sqlPassword = "root";
        Connection con = null;
        Statement stm = null;

        String sql;
        ResultSet result = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //5.5版本以下需去掉路径cj
            con = DriverManager.getConnection(sqlUrl, sqlUser, sqlPassword);
            stm = con.createStatement();
            sql = "select * from user"; //查询语句
            result = stm.executeQuery(sql); //执行查询(结果集)

            //创建一个table表格
            out.print("<table border='1px solid #c7edcc'>");
            out.print("<caption>用户表</caption>");
            out.print("<tr>");
            out.print("<th>用户ID</th>");
            out.print("<th>用户名</th>");
            out.print("<th>密码</th>");
            out.print("<th>备注</th>");
            out.print("</tr>");

            while (result.next()){
                // out.print("有记录");
                int userId = result.getInt("userid");  // 也可以写1
                String userName = result.getString(2);  //也可以写"username"
                String userPassword = result.getString("userpassword");  //也可以写3
                String memo = result.getString(4); //也可以写"memo"

                // out.print("ID:" + userId + " | name:" + userName + " | password:" + userPassword + " | memo:" + memo + "<br>");
                out.print("<tr>");
                out.print("<td>" + userId + "</td>");
                out.print("<td>" + userName + "</td>");
                out.print("<td>" + userPassword + "</td>");
                out.print("<td>" + memo + "</td>");
                out.print("</tr>");
            }
            out.print("</table>");
        } catch (Exception e) {
            e.printStackTrace();
        } finally { //释放资源
            try {
                if (result != null) {
                    result.close();
                }
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
