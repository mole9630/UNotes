import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteData {
    public static void delete() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            String sql = "DELETE FROM info WHERE id = ?";
            conn = DBUtil.getConnection();
            pstmt = conn.prepareStatement(sql);
            Scanner sc = new Scanner(System.in);
            System.out.println("输入要删除的学号");
            pstmt.setInt(1, sc.nextInt());
            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("删除成功");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn, pstmt, null);
        }
    }
}