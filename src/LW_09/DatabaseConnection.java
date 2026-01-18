package LW_09;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/yourDB"; // Replace with your DB
    private static final String USER = "root"; // Replace with your DB username
    private static final String PASSWORD = "password"; // Replace with your DB password

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to the database successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
