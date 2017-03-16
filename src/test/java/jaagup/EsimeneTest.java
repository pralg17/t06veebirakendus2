package jaagup;

import org.junit.*;

import static org.junit.Assert.*;

public class EsimeneTest {


    @Test
    public void averageTest1() {

        Rakendus r = new Rakendus();

        String code = "38905220293";

        assertEquals("Id is empty", r.idCode(""));
        assertEquals("Id is missing", r.idCode(null));

        assertEquals("Id must be 11 characters", r.idCode(code));
    }

}
