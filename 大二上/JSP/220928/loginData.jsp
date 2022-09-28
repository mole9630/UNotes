<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录处理</title>
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
        PreparedStatement pstm = null;
        String sql;
        ResultSet result = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //5.5版本以下需去掉路径cj
            con = DriverManager.getConnection(sqlUrl, sqlUser, sqlPassword);
            sql = "select * from user where username=? and userpassword=?"; //查询语句

            pstm = con.prepareStatement(sql);
            pstm.setString(1, userName);
            pstm.setString(2, userPassword);
            result = pstm.executeQuery();

            // 验证判断
            if (result.next()){
                out.print("用户合法 --> 欢迎您:" + userName);
            }
            else {
                out.print("用户非法, 请重新登陆 --> <a href='login.jsp'>登录页</a>");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally { //释放资源
            try {
                if (result != null) {
                    result.close();
                }
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
