package JDBC;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class SelectDatabase {
    public static void main(String[] args) throws SQLException {
        Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/animal_rescue","vaishu","Freshworks@2021");
        Statement stmt = conn.createStatement();
        System.out.println("hiiiii");
        conn.close();
        System.out.println("hi all");
    }
}
