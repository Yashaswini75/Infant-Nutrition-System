package InfantNutritionSystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {
        try {
            // Load the MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/infant_nutrition",
                "root",       // your MySQL username
                "root"        // your MySQL password
            );
            return con;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}