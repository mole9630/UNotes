package com;

import java.sql.*;

public class DataOperator {
    public static void main(String[] args) {
        //数据库信息
        Connection con = null; //连接对象
        Statement st = null; //语句对象
        ResultSet rs = null; //结果集
        String strUrl = "jdbc:mysql://localhost:3306/user"; //url 数据库地址
        String strSQLName = "root"; //数据库用户
        String strSQLPassword = "root"; //数据库密码
        String strSQL;

        try {
            //加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            //建立连接数据库
            con = DriverManager.getConnection(strUrl,strSQLName,strSQLPassword);

            //创建statement对象
            st = con.createStatement();

            //SQL语句
            strSQL = "select * from user";
            //执行SQL语句,并返回值 -执行查询并返回记录集(结果集),即多条记录
            rs = st.executeQuery(strSQL);
            while (rs.next()) //移动游标指向下一条记录,如果存在返回真,否则返回假
            {
                //获指定的一条记录(多个字段值)
                int userId = rs.getInt(1); //获取第一个字段值 -列序号(起始从1开始)
                String userName = rs.getString("userName"); //也可以使用字段名不使用列号
                String userPassword = rs.getString("password");
                System.out.println("用户号:" + userId + " | 用户名:" + userName + " | 用户密码:" + userPassword);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally { //释放资源(注意顺序)
            try {
                if (rs != null)
                {
                    rs.close();
                }
                if (st != null)
                {
                    st.close();
                }
                if (con != null)
                {
                    con.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}