package JDBC;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
public class DeleteRecord {
    public static void main(String[] args) throws SQLException {
        Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/animal_rescue","vaishu","Freshworks@2021");
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("delete from animal_list where id=1");
        conn.close();
    }
}
