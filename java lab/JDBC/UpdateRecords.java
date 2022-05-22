package JDBC;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
public class UpdateRecords {
    public static void main(String[] args) throws SQLException {
        Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/animal_rescue","vaishu","Freshworks@2021");
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("set name ='teddy' where id in(1,2)");
        conn.close();

    }
}

//        String sql = "UPDATE Registration " +
//        "SET age = 30 WHERE id in (100, 101)";
//        stmt.executeUpdate(sql);
//        ResultSet rs = stmt.executeQuery(QUERY);
//        while(rs.next()){
//        //Display values
//        System.out.print("ID: " + rs.getInt("id"));
//        System.out.print(", Age: " + rs.getInt("age"));
//        System.out.print(", First: " + rs.getString("first"));
//        System.out.println(", Last: " + rs.getString("last"));
//        }