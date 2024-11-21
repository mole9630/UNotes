import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        DBUtil db = new DBUtil();
        InsertData insertData = new InsertData();
        DeleteData deleteData = new DeleteData();
        UpdateData updateData = new UpdateData();
        QueryData queryData = new QueryData();

        insertData.insert();
        UpdateData.update();
        DeleteData.delete();
        QueryData.query();
    }
}
