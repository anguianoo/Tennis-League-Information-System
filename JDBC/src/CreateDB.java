
/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDB {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/";
    private static final String USER = "root";
    private static final String PASS = "8335"; // This is where you replace with your actual password

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement()) {

            String sql = "CREATE DATABASE VRD";
            stmt.executeUpdate(sql);
            System.out.println("Database created successfully...");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDB {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/";
    private static final String USER = "root";
    private static final String PASS = "8335"; // This is where you replace with your actual password

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement()) {

            // Check if the database exists
            String checkDbExists = "SELECT SCHEMA_NAME FROM INFORMATION_SCHEMA.SCHEMATA WHERE SCHEMA_NAME = 'vrd'";
            ResultSet resultSet = stmt.executeQuery(checkDbExists);
            if (!resultSet.next()) {
                String sql = "CREATE DATABASE VRD";
                stmt.executeUpdate(sql);
                System.out.println("Database created successfully...");
            } else {
                System.out.println("Database 'vrd' already exists.");
            }

            // Use the VRD database
            stmt.executeUpdate("USE VRD");

            // Create teams table
            String createTeamsTable = "CREATE TABLE IF NOT EXISTS teams (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "name VARCHAR(100) NOT NULL, " +
                    "city VARCHAR(100) NOT NULL)";
            stmt.executeUpdate(createTeamsTable);
            System.out.println("Teams table created successfully...");

            // Create players table
            String createPlayersTable = "CREATE TABLE IF NOT EXISTS players (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "name VARCHAR(100) NOT NULL, " +
                    "team_id INT, " +
                    "position VARCHAR(50), " +
                    "FOREIGN KEY (team_id) REFERENCES teams(id))";
            stmt.executeUpdate(createPlayersTable);
            System.out.println("Players table created successfully...");

            // Create coaches table
            String createCoachesTable = "CREATE TABLE IF NOT EXISTS coaches (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "name VARCHAR(100) NOT NULL, " +
                    "team_id INT, " +
                    "position VARCHAR(50), " +
                    "FOREIGN KEY (team_id) REFERENCES teams(id))";
            stmt.executeUpdate(createCoachesTable);
            System.out.println("Coaches table created successfully...");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
