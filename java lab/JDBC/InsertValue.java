package JDBC;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
public class InsertValue {
    public static void main(String[] args) throws SQLException {
        Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/animal_rescue","vaishu","Freshworks@2021");
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("insert into animal_list values(1,'cyrus'),(2,'brownie')");
        conn.close();
    }
}

