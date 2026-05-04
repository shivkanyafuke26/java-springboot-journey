import java.sql.*;
import java.util.Scanner;

public class Geeks {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbc_demo"; // your DB name
        String user = "root";
        String password = "root"; // change this

        String insertSql = "INSERT INTO student1 (name, roll, class) VALUES (?, ?, ?)";

        try {
            // Load MySQL Driver (optional for MySQL 8+)
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);
            Scanner sc = new Scanner(System.in);

            con.setAutoCommit(false); // manual transaction

            System.out.print("Enter name: ");
            String name = sc.nextLine().trim();

            System.out.print("Enter roll no: ");
            int roll = Integer.parseInt(sc.nextLine().trim());

            System.out.print("Enter class: ");
            String cls = sc.nextLine().trim();

            try {
                PreparedStatement ps = con.prepareStatement(insertSql);
                ps.setString(1, name);
                ps.setInt(2, roll);
                ps.setString(3, cls);

                int rows = ps.executeUpdate();

                if (rows == 1) {
                    con.commit();
                    System.out.println("Inserted successfully.");
                } else {
                    con.rollback();
                    System.out.println("Insertion failed, rolled back.");
                }

                ps.close();

            } catch (SQLException e) {
                con.rollback();
                System.out.println("Insert error, rolled back: " + e.getMessage());
                e.printStackTrace();
            }

            con.close();
            sc.close();

        } catch (Exception e) {
            System.out.println("DB connection error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}