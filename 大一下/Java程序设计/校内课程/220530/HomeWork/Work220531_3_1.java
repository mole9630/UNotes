package HomeWork;
/**
 * 访问数据库中student表，并删除表中id为1002的记录 .
 * student表中有如下记录 ：
 * id         name       age          addr
 * 1101     王源         20           沈阳
 * 1102     张军         19           大连
 * 1003     王新鹏      18           大连

 @ THIS FILE IS PART OF mole9630 PROJECT
 @ Work220530_1_2.java - This is the java homework for May 31st
 @ THIS PROGRAM IS FREE Code, IS LICENSED UNDER GPL3 License
 @ Copyright (c) 2022 mole9630(Github)
 @ www.mole9630.top | me@mole9630.top
 */
import java.sql.*;

public class Work220531_3_1 {
    public static void main(String[] args) {
        //数据库信息
        Connection con = null; //连接对象
        Statement st = null; //执行语句
        PreparedStatement ps = null; //语句对象
        ResultSet rs = null; //结果集
        String strUrl = "jdbc:mysql://localhost:3306/javawork"; //url 数据库地址
        String strSQLName = "root"; //数据库用户
        String strSQLPassword = "123456"; //数据库密码
        String strSQL = "delete from student where id=1102"; //delete语句
        int i = 0; //计数器
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(strUrl, strSQLName, strSQLPassword);
//            st = con.createStatement();
            ps = con.prepareStatement(strSQL); //删除id为1102的数据
            i = ps.executeUpdate(); //执行语句(返回值为受影响的行数)
            System.out.println("受影响的行:" + i);
        } catch (Exception e) {
            e.printStackTrace();
        } finally { //释放资源(注意顺序)
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
