
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeoPoliticalZoneDriverTest {

    @Test
    public void testThatStateCanBeFound() {
        String stateToCheck = "Lagos";
        String expected = GeoPoliticalZoneDriver.checkForStateInZone(stateToCheck);
        String actual = "SOUTHWEST";
        assertEquals(expected, actual);
    }
    
    @Test
    public void testThatUnknownStateCanBeIdentified() {
        String stateToCheck = "Alabama";
        String expected = GeoPoliticalZoneDriver.checkForStateInZone(stateToCheck);
        String actual = "Unknown state";
        assertEquals(expected, actual);
    }
}