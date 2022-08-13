package com;

import java.sql.*;
import java.util.Scanner;

public class DataOperator {
    public  void querySelect(String strSQL)
    {
        //数据库信息
        Connection con = null; //连接对象
        Statement st = null; //语句对象
        ResultSet rs = null; //结果集
        String strUrl = "jdbc:mysql://localhost:3306/user"; //url 数据库地址
        String strSQLName = "root"; //数据库用户
        String strSQLPassword = "root"; //数据库密码

        try {
            //加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            //建立连接数据库
            con = DriverManager.getConnection(strUrl,strSQLName,strSQLPassword);

            //创建statement对象
            st = con.createStatement();

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


    public static void main(String[] args) {
        System.out.println("********** 用户信息管理系统 **********");
        System.out.println("1.查询用户信息");
        System.out.println("2.添加用户信息");
        System.out.println("3.修改用户信息");
        System.out.println("4.删除用户信息");
        System.out.println("5.退出用户信息管理系统");
        System.out.println("***********************************");
        DataOperator dt = new DataOperator();

        //选择功能
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        while (i!= 5)
        {
            if (i == 1) //查询用户信息
            {
                String strSQL = "select * from user";
                dt.querySelect(strSQL);
            }
            if (i == 2) //添加用户信息
            {
                String strSQL = "select * from user";
                dt.querySelect(strSQL);
            }
            if (i == 3) //修改用户信息
            {
                String strSQL = "select * from user";
                dt.querySelect(strSQL);
            }
            if (i == 4) //删除用户信息
            {
                String strSQL = "select * from user";
                dt.querySelect(strSQL);
            }

            System.out.println("\n**** 请继续操作:用户信息管理系统 ****");
            System.out.println("1.查询用户信息");
            System.out.println("2.添加用户信息");
            System.out.println("3.修改用户信息");
            System.out.println("4.删除用户信息");
            System.out.println("5.退出用户信息管理系统");
            System.out.println("***********************************");
            i = in.nextInt();
        }
        System.out.println("退出系统");
    }
}