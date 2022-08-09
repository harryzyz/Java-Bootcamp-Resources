package src.test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import src.main.models.Team;

public class TeamTest {

    @Before
    public void setup() {
        // Team team = new Team();
    }
    
    @Test
    public void hasNullTest() {
        String[] chasers = new String[] {null, "Ginny", "Katie"};
        assertTrue(Team.hasNull(chasers));
    }

    @Test
    public void hasBlankTest() {
        String[] chasers = new String[] {"    ", "Ginny", "Katie"}; 
        assertTrue(Team.hasBlank(chasers));
    }
}
