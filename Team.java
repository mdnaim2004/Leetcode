public class Team {
    int teamSize;
    String teamName;
    String teamLeader;
    String[] teamMembers;
    String teamDescription;
    String teamGoal;
    String teamAchievements;

    public Team(int teamSize, String teamName, String teamLeader, String[] teamMembers, String teamDescription, String teamGoal, String teamAchievements) {
        this.teamSize = teamSize;
        this.teamName = teamName;
        this.teamLeader = teamLeader;
        this.teamMembers = teamMembers;
        this.teamDescription = teamDescription;
        this.teamGoal = teamGoal;
        this.teamAchievements = teamAchievements;
    }
    public Team() {
        // Default constructor
    }

    public int getTeamSize() {
        return teamSize;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getTeamLeader() {
        return teamLeader;
    }

    public String[] getTeamMembers() {
        return teamMembers;
    }

    public String getTeamDescription() {
        return teamDescription;
    }

    public String getTeamGoal() { 
        return teamGoal;
    }

    public String getTeamAchievements() {
        return teamAchievements;
    }
    public static void main(String[] args) {
        String[] members = {"Alice", "Bob", "Charlie"};
        Team team = new Team(3, "Developers", "Dave", members, "Develops software", "Build a web app", "Launched MVP"); 
    }
}