package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {
    public static void main(String[] args) throws SQLException {
Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306","vaishu","Freshworks@2021");
Statement stmt = conn.createStatement();
stmt.executeUpdate("create database animal_rescue");
conn.close();
        System.out.println("hi this is rescue website");
    }
}
