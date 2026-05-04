import java.sql.*;

public class EmployeeCRUD {

    static final String URL = "jdbc:mysql://localhost:3306/testdb";
    static final String USER = "root";
    static final String PASS = "root"; // change this

    public static void main(String[] args) {

        try {
            // Load driver (optional for MySQL 8+)
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(URL, USER, PASS);

            // CREATE (Insert)
            String insertQuery = "INSERT INTO employee VALUES (1, 'Shiv', 25000)";
            Statement st = con.createStatement();
            st.executeUpdate(insertQuery);
            System.out.println("Record Inserted");

            // READ (Select)
            String selectQuery = "SELECT * FROM employee";
            ResultSet rs = st.executeQuery(selectQuery);

            System.out.println("\nEmployee Records:");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getDouble("salary")
                );
            }

            // UPDATE
            String updateQuery = "UPDATE employee SET salary = 30000 WHERE id = 1";
            st.executeUpdate(updateQuery);
            System.out.println("\nRecord Updated");

            // DELETE
            String deleteQuery = "DELETE FROM employee WHERE id = 1";
            st.executeUpdate(deleteQuery);
            System.out.println("Record Deleted");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}