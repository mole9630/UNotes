<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>批处理数据</title>
</head>
<style>
    table{
        border: 1px solid #c7edcc;
        margin: 5px auto;
    }
    th{
        border: 1px solid #c7edcc;
        width: 150px;
    }
</style>
<body>
<%
    // 预处理数据
    String studentNumber[] = {"220930101","220930102","220930103","220930104"};
    String studentName[] = {"Lihua","Xiaoming","Huangxi","Liuyang"};
    String studentBirthday[] = {"2001-04-10","2002-07-14","2000-04-30","2002-08-28"};
    String studentClass[] = {"计科223","计科223","计科224","计科225"};

    // 连接数据库
    String sqlUrl = "jdbc:mysql://localhost:3306/book"; //"jdbc:mysql://localhost:3306/book?user=root&password=root"
    String sqlUser = "root";
    String sqlPassword = "root";

    //JDBC API
    Connection con = null;
    PreparedStatement pstm = null;
    String sql;
    Statement stm = null;
    ResultSet result = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver"); //5.5版本以下需去掉路径cj
        con = DriverManager.getConnection(sqlUrl, sqlUser, sqlPassword);
        sql = "insert into student values(?,?,?,?)"; //查询语句
        pstm = con.prepareStatement(sql);
        for (int i=0;i<studentNumber.length;i++)
        {
            pstm.setString(1,studentNumber[i]);
            pstm.setString(2,studentName[i]);
            pstm.setString(3,studentBirthday[i]);
            pstm.setString(4,studentClass[i]);
            pstm.addBatch();
        }
        int returnSql[] = pstm.executeBatch();

        // 查询数据并表格化显示
        sql = "select  * from student";
        stm = con.createStatement();
        result = stm.executeQuery(sql);
        out.print("<table>");
        out.print("<caption>学生表</caption>");
        out.print("<tr>");
        out.print("<th>用户ID</th>");
        out.print("<th>用户名</th>");
        out.print("<th>密码</th>");
        out.print("<th>备注</th>");
        out.print("</tr>");
        while (result.next()){
            // out.print("有记录");
            String number = result.getString(1);
            String name = result.getString(2);
            String birthday = result.getString(3);
            String sclass = result.getString(4);
            out.print("<tr>");
            out.print("<th>" + number + "</th>");
            out.print("<th>" + name + "</th>");
            out.print("<th>" + birthday + "</th>");
            out.print("<th>" + sclass + "</th>");
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