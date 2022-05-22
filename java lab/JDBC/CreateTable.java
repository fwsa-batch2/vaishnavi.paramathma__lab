package JDBC;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
public class CreateTable {
        public static void main(String[] args)  throws SQLException{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/animal_rescue","vaishu","Freshworks@2021");
            Statement stmt =conn.createStatement();
            stmt.executeUpdate("create table animal_list(id int,name varchar(30))");
            conn.close();
        }
    }

