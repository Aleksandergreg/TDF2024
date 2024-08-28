import java.io.FileNotFoundException;
import java.util.*;

public class Statistics {
    private final List<Rider> riderResultList;

    public Statistics(String fileName) throws FileNotFoundException {
        TDFFileReader tdfFileReader = new TDFFileReader(fileName);
        riderResultList = tdfFileReader.readFile();
    }

    public Set<String> getTeams() {
        Set<String> teams = new HashSet<>();
        for (Rider rider : riderResultList) {
            teams.add(rider.getHoldNavn());
        }
        return teams;
    }

    public Map<String, String> getTeamsWithMembers() {
        Map<String, String> teamsWithMembers = new HashMap<>();

        for (Rider rider : riderResultList) {
            teamsWithMembers.put(rider.getHoldNavn(), rider.getRytterNavn());
        }

        return teamsWithMembers;
    }

    public Set<String> getTeamMembers(String team) {
        Set<String> teamMembers = new HashSet<>();

        for (Rider rider : riderResultList) {
            if (rider.getHoldNavn().equals(team)) {
                teamMembers.add(rider.getRytterNavn());
            }return teamMembers;
        }return teamMembers;

    }
}
