import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsTest {

    private Statistics statistics;

    @BeforeEach
    void setUp() {
        try {
            statistics = new Statistics("tdffinishers2023.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void getTeams() {
        int expectedResult = 22;
        int actualResult = statistics.getTeams().size();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void getTeamsWithMember() {
        int expectedValue = 22;
        int actualValue = statistics.getTeamsWithMembers().size();

        assertEquals(actualValue, expectedValue);
    }

    @Test
    void getTeamMembers() {
        String team = "Jumbo-Visma";
        int expectedResult = 7;
        Set<String> actualResult = statistics.getTeamMembers(team);
        assertEquals(expectedResult, actualResult.size());

    }
    @Test
    void testGetTeamMembers() {
        Set<String> teamMembers = statistics.getTeamMembers("Jumbo-Visma");

        assertTrue(teamMembers.contains("Jonas Vingegaard"), "Wout Van Aert");
    }

    @Test
    void testGetTeamsWithMembersSpecificEntries() {

        Map<String, String> actualTeamsWithMembers = statistics.getTeamsWithMembers();


        assertEquals("Nathan Van Hooydonck", actualTeamsWithMembers.get("Jumbo-Visma"));
        assertEquals("Frederik Frison", actualTeamsWithMembers.get("Lotto Dstny"));


    }

    @Test
    void testGetTeamsWithMembersSpecificEntries1() {
        // Invoke the method under test
        Map<String, List<String>> actualTeamsWithMembers = statistics.getTeamsWithMembers1();

        // Check that specific teams have the correct members
        assertTrue(actualTeamsWithMembers.containsKey("Jumbo-Visma"));
        assertEquals(List.of("Jonas Vingegaard", "Sepp Kuss","Wilco Kelderman","Tiesj Benoot", "Dylan Van Baarle", "Christophe Laporte","Nathan Van Hooydonck"), actualTeamsWithMembers.get("Jumbo-Visma"));


    }
}