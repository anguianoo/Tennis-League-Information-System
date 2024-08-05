public class Main {
    public static void main(String[] args) {
        TeamManager teamManager = new TeamManager();

        // Add a new team
        System.out.println("Adding a new team...");
        teamManager.addTeam("Team A", "City A");

        // View all teams
        System.out.println("Viewing all teams...");
        teamManager.viewTeams();

        // Edit the team
        System.out.println("Editing the team...");
        teamManager.editTeam(1, "Updated Team A", "Updated City A");

        // View all teams after edit
        System.out.println("Viewing all teams after edit...");
        teamManager.viewTeams();

        // Delete the team
        System.out.println("Deleting the team...");
        teamManager.deleteTeam(1);

        // View all teams after deletion
        System.out.println("Viewing all teams after deletion...");
        teamManager.viewTeams();
    }
}
