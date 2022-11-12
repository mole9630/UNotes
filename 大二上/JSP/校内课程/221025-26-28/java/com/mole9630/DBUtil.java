package com.mole9630;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
    static Connection con = null;
    static PreparedStatement pstm = null;
    static ResultSet rs = null;


    public int updataSql(String sqlStr) {
        DBConnection dbc = new DBConnection();
        con = dbc.getDBConnection();
        int n = -1;
        try {
            pstm = con.prepareStatement(sqlStr);
            n = pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbc.closeDB(con, pstm, rs);
            return n;
        }
    }


    public ResultSet querySql(String sqlStr) {
        DBConnection dbc = new DBConnection();
        con = dbc.getDBConnection();
        try {
            pstm = con.prepareStatement(sqlStr);
            rs = pstm.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            return rs;
        }
    }



//    public static void main(String[] args) {
//        String sql = "select * from student_info";
//        DBUtil dbu = new DBUtil();
//        rs = dbu.querySql(sql);
//        if (rs != null){
//            System.out.println("查询成功!");
//        }
//    }
}
