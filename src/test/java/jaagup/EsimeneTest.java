package jaagup;

import org.junit.*;

import static org.junit.Assert.*;

public class EsimeneTest {

    Rakendus r = new Rakendus();

    @Test
    public void idTest1() {

        assertEquals("Id is empty", r.idCode(""));
        assertEquals("Id is missing", r.idCode(null));

        assertEquals("Id must be 11 characters", r.idCode("38905220293"));

    }

    @Test
    public void idTestFirstNumber() {

        assertEquals("First character must be 3 - 6", r.IdCodeFirstNumber("18905220293"));
    }
}
