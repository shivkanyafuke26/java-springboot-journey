import java.sql.*;

public class JdbcConnectionExample {
    public static void main(String[] args) {
        try {
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/shiv", "root", "root");

            System.out.println("Connected Successfully!");

            // 3. Close Connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}