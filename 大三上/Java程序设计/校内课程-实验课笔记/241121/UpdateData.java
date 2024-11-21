import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateData {
    public static void update() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            String sql = "UPDATE info SET id = ?, name= ?,age = ? WHERE id = ?";
            conn = DBUtil.getConnection();
            pstmt = conn.prepareStatement(sql);
            Scanner sc = new Scanner(System.in);
            System.out.print("依次输入要修改的学号：");
            int temp = sc.nextInt();
            System.out.print("输入修改后的学号、姓名、年龄：");
            pstmt.setInt(1, sc.nextInt());
            pstmt.setString(2, sc.next());
            pstmt.setInt(3, sc.nextInt());
            pstmt.setInt(4, temp);
            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("修改成功");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn, pstmt, null);
        }
    }
}