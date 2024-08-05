import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TeamManager {

    // Add a new team
    public void addTeam(String name, String city) {
        String sql = "INSERT INTO teams (name, city) VALUES (?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, city);
            pstmt.executeUpdate();
            System.out.println("Team added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Edit an existing team
    public void editTeam(int id, String name, String city) {
        String sql = "UPDATE teams SET name = ?, city = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, city);
            pstmt.setInt(3, id);
            pstmt.executeUpdate();
            System.out.println("Team updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete a team
    public void deleteTeam(int id) {
        String sql = "DELETE FROM teams WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Team deleted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // View all teams
    public void viewTeams() {
        String sql = "SELECT * FROM teams";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String city = rs.getString("city");
                System.out.println("ID: " + id + ", Name: " + name + ", City: " + city);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
