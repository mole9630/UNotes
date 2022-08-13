package com;

import java.sql.*;
import java.util.Scanner;

public class DatUpdate {
    public void updaterecord(String strSQL) {
        //数据库信息
        Connection con = null; //连接对象
        Statement st = null; //执行语句
        PreparedStatement ps = null; //语句对象
        ResultSet rs = null; //结果集
        String strUrl = "jdbc:mysql://localhost:3306/user"; //url 数据库地址
        String strSQLName = "root"; //数据库用户
        String strSQLPassword = "root"; //数据库密码
        int i = 0; //计数器
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(strUrl, strSQLName, strSQLPassword);
//            st = con.createStatement();
            ps = con.prepareStatement(strSQL); //预编译语句
            Scanner in = new Scanner(System.in);
            System.out.println("请输入要修改学生信息的ID：");
            ps.setInt(4, in.nextInt());
            System.out.println("请输入新的ID：");
            ps.setInt(1, in.nextInt());
            System.out.println("请输入新的姓名：");
            ps.setString(2, in.next());
            System.out.println("请输入新的密码：");
            ps.setString(3,in.next());
            i = ps.executeUpdate(); //执行语句(返回值为受影响的行数)
            System.out.println("受影响的行:" + i);
        } catch (Exception e) {
            e.printStackTrace();
        } finally { //释放资源(注意顺序)
            try {
                if (rs != null)
                {
                    rs.close();
                }
                if (ps != null)
                {
                    ps.close();
                }
                if (con != null)
                {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        DatDelete datDelete = new DatDelete();
        String strSQL = "update user set id=?,userName=?,password=? where id=?"; //?是占位符
        datDelete.deleterecord(strSQL);
    }
}
