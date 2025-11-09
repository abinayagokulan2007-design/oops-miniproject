package network;

import java.sql.*;

public class DBConnector {
    public static void connect() {
        try {
            // Example (will throw error if no DB driver available)
            Class.forName("org.h2.Driver");
            Connection conn = DriverManager.getConnection("jdbc:h2:mem:test", "sa", "");
            System.out.println("Database connected!");
            conn.close();
        } catch (Exception e) {
            System.out.println("Database connection failed: " + e.getMessage());
        }
    }
}
