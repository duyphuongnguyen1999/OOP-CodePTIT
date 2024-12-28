package test241226.Exercise5;

public class Team {
    private String teamId;
    private String teamName;
    private String universityName;

    public Team(String teamName, String universityName) {
        this.teamName = teamName;
        this.universityName = universityName;
    }
    
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getUniversityName() { return universityName; }
    public String getTeamName() { return teamName; }

    @Override
    public String toString() {
        return String.format("%s %s %s", teamId, teamName, universityName);
    }

}
