package test241226.Exercise5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        String institutionFilePath = "src/test241226/Exercise5/INSTITUTION.in";
        String registerFilePath = "src/test241226/Exercise5/REGISTER.in";
        Map<String, University> universities = new HashMap<>();
        List<Team> teams = new ArrayList<>();
        
        try(Scanner in = new Scanner(new File(institutionFilePath))) {
            int numUniversities = Integer.parseInt(in.nextLine());
            while(numUniversities-- > 0) {
                String universityShortName = in.next();
                String universitName = in.nextLine();
                University university = new University(
                    universityShortName, universitName
                );
                universities.put(universityShortName, university);
            }
        }

        try(Scanner in = new Scanner(new File(registerFilePath))) {
            int numUniversities = Integer.parseInt(in.nextLine());
            while(numUniversities-- > 0) {
                String universityShortName = in.next();
                int numTeams = in.nextInt(); 
                in.nextLine();
                while(numTeams-- > 0) {
                    String teamName = in.nextLine();
                    Team team = new Team(
                        teamName, 
                        universities.get(universityShortName).getUniversityName()
                    );
                    teams.add(team);
                }
            }
        }

        Collections.sort(teams, (a, b) -> {
            int universitiyNameCompare = a.getUniversityName().compareTo(b.getUniversityName());
            if(universitiyNameCompare == 0) {
                return a.getTeamName().compareTo(b.getTeamName());
            }
            return universitiyNameCompare;
        });

        int numberOfTeams = teams.size();
        for(int i = 0; i < numberOfTeams; i++) {
            String teamId = String.format("team%02d", i+1);
            teams.get(i).setTeamId(teamId);
            System.out.println(teams.get(i));
        }
    }
}
