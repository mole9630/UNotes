<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册处理</title>
</head>
<body>
    <%
        // 获取表单信息
        int userID = Integer.parseInt(request.getParameter("userID"));
        String userName = request.getParameter("userName");
        String userPassword = request.getParameter("userPassword");
        String memo = request.getParameter("memo");

        // 连接数据库
        String sqlUrl = "jdbc:mysql://localhost:3308/book";
        String sqlUser = "root";
        String sqlPassword = "root";
        Connection con = null;
        PreparedStatement pstm = null;
        String sql;
        int returnSql;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //5.5版本以下需去掉路径cj
            con = DriverManager.getConnection(sqlUrl, sqlUser, sqlPassword);
            sql = "INSERT INTO user VALUES(?, ?, ?, ?)"; //查询语句

            pstm = con.prepareStatement(sql);
            pstm.setInt(1, userID);
            pstm.setString(2, userName);
            pstm.setString(3, userPassword);
            pstm.setString(4, memo);
            returnSql = pstm.executeUpdate();

            // 验证判断
            if (returnSql == 1){
                out.print("注册成功 --> 欢迎您:" + userName);
            }
            else {
                out.print("注册非法, 请重新注册 --> <a href='register.jsp'>登录页</a>");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally { //释放资源
            try {
                if (pstm != null) {
                    pstm.close();
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
