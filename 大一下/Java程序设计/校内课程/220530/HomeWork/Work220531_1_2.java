package HomeWork;
/**
 * 在mysql数据库中创建student表，包含字段id、name和age
 * 编写数据库应用程序实现以下要求
 * 1.向表中添加两行记录id：101，name：tom，age：20；id：102，name：jerry，age：21
 * 2.更改id=101的记录，使其name更改为alice，age更改为18.
 * 3.查询表中所有记录
 * 4.删除表中id为102的记录

 @ THIS FILE IS PART OF mole9630 PROJECT
 @ Work220530_1_2.java - This is the java homework for May 31st
 @ THIS PROGRAM IS FREE Code, IS LICENSED UNDER GPL3 License
 @ Copyright (c) 2022 mole9630(Github)
 @ www.mole9630.top | me@mole9630.top
 */
import java.sql.*;

public class Work220531_1_2 {
    public static void main(String[] args) {
        //数据库信息
        Connection con = null; //连接对象
        Statement st = null; //执行语句
        PreparedStatement ps = null; //语句对象
        ResultSet rs = null; //结果集
        String strUrl = "jdbc:mysql://localhost:3306/javawork"; //url 数据库地址
        String strSQLName = "root"; //数据库用户
        String strSQLPassword = "123456"; //数据库密码
        String strSQL = "insert into student values(101,'tom',20,'')"; //insert语句
        String strSQL1 = "insert into student values(102,'jerry',21,'')"; //insert语句
        String strSQL2 = "update student set name='alice',age=18 where id=101"; //update语句
        int i = 0; //计数器
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(strUrl, strSQLName, strSQLPassword);
//            st = con.createStatement();
            ps = con.prepareStatement(strSQL); //添加id为101的数据
            i = ps.executeUpdate(); //执行语句(返回值为受影响的行数)
            System.out.println("受影响的行:" + i);
            ps = con.prepareStatement(strSQL1); //添加id为102的数据
            i = ps.executeUpdate(); //执行语句(返回值为受影响的行数)
            System.out.println("受影响的行:" + i);
            ps = con.prepareStatement(strSQL2); //修改id为101的数据
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
