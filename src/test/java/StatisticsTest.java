import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsTest {

    private Statistics statistics;

    @BeforeEach
    void setUp() {
        try {
            statistics = new Statistics("C:\\Users\\Josse\\Downloads\\tdffinishers2023.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void getTeams(){
        int expectedResult = 22;
        int actualResult =statistics.getTeams().size();
        assertEquals(expectedResult,actualResult);
    }
    @Test
    void getTeamsWithMember(){
int expectedValue = 22;
int actualValue =statistics.getTeamsWithMembers().size();

assertEquals(actualValue,expectedValue);
    }
    @Test
    void getTeamMembers() {
        String team = "Jumbo-Visma";
        int expectedResult = 1;
        Set<String> actualResult = statistics.getTeamMembers(team);
        assertEquals(expectedResult,actualResult.size());
    }

}