import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertData {
    public void insert() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            Scanner sc = new Scanner(System.in);
            String sql = "INSERT INTO info (id, name, age) VALUES (?, ?, ?)";
            conn = DBUtil.getConnection();
            pstmt = conn.prepareStatement(sql);
            System.out.print("依次输入学号、姓名、年龄：");
            pstmt.setInt(1, sc.nextInt());
            pstmt.setString(2, sc.next());
            pstmt.setInt(3, sc.nextInt());
            pstmt.executeUpdate();
            System.out.println("插入成功");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn, pstmt, null);
        }
    }
}