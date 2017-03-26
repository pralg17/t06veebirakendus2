package marko;


import org.junit.*;
import static org.junit.Assert.*;

public class PrimeTest {

    Rakendus r = new Rakendus();

    /* answer = "Sisendatud arv ei ole algarv";
       answer = "Sisendatud arv on algarv";*/

    @Test
    public void firstTest(){

        assertEquals("Sisendatud arv on algarv", r.getPrime("5"));
        assertEquals("Sisendatud arv on algarv", r.getPrime("10"));
        assertEquals("Sisendatud arv on algarv", r.getPrime("hussa"));
    }


}
