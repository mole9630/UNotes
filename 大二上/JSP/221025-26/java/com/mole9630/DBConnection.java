package com.mole9630;

import java.sql.*;

public class DBConnection {
    public static String strcom = "com.mysql.cj.jdbc.Driver";
    public static String sqlUserName = "root";
    public static String sqlUserPassword = "root";
    public static String dbName = "student";
    public static String sqlUrl = "jdbc:mysql://127.0.0.1:3308/" + dbName + "?user=" + sqlUserName + "&password=" + sqlUserPassword + "&useUnicode=true&characterEncoding=utf8";
    public static String sqlUrlExp = "jdbc:mysql://127.0.0.1:3308/" + dbName; // 方法2


    public Connection getDBConnection() {
            Connection con = null;
        try {
            Class.forName(strcom);
            // con = DriverManager.getConnection(sqlUrlExp, sqlUserName, sqlUserPassword); // 方法2
            con = DriverManager.getConnection(sqlUrl);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return con;
        }
    }

    public void closeDB(Connection con, PreparedStatement pstm, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
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

    // 测试连接
//    public static void main(String[] args) {
//        DBConnection dbc = new DBConnection();
//        Connection con = null;
//        con = dbc.getDBConnection();
//        if (con != null){
//            System.out.println("连接成功!");
//        }
//    }
}
