package db;
import java.sql.*;

public class Connect {

    public Connect() {
    }

    public void linkMysql(){
        String url="jdbc:mysql://localhost:3306/library";
        String usr="root";
        String password="root";
        String sql;
        Connection con=null;
        Statement stm=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection(url,usr,password);
            stm=con.createStatement();
            sql="select * from user";
            rs=stm.executeQuery(sql);
            System.out.print("<table border='1px solid blue'>");
            System.out.print("<tr><td>用户ID</td><td>用户名</td><td>用户密码</td><td>备注</td><td>操作</td></tr>");
            while (rs.next()){
                int id=rs.getInt(1);
                String username=rs.getString(2);
                String userpwd=rs.getString(3);
                String memo=rs.getString(4);
                System.out.print("<tr><td>"+id+"</td><td>"+username+"</td><td>"+ userpwd + "</td><td>" +memo + "</td><td>"+"<a href='#'>操作</a>"+"</td></tr>");
            }
            System.out.print("</table>");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
