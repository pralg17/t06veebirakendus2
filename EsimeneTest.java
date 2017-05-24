package karolin;

import org.junit.*;

import static org.junit.Assert.*;

public class EsimeneTest {

    Rakendus r = new Rakendus();

    @Test
    public void DayTest1() {

        assertEquals("Day is empty", r.dayCode(""));
        assertEquals("Day is missing", r.dayCode(null));

    }

    @Test
    public void DayCodeInserted() {

        assertEquals("Enter a day", r.DayCodeInserted("Monday"));
    }
}
