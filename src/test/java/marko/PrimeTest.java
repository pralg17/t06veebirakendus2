package marko;


import org.junit.*;
import static org.junit.Assert.*;

public class PrimeTest {

    Rakendus r = new Rakendus();

    @Test
    public void firstTest(){

        //assertEquals("Sisendatud arv on algarv", r.getPrime("5"));	// Ei lähe läbi kuna tagastus peab olema "".
        //assertEquals("Sisendatud arv on algarv", r.getPrime("10"));	// Ei lähe läbi, tagastys peaks olema "Sisendatud arv ei ole algarv".
        //assertEquals("Sisendatud arv on algarv", r.getPrime("hussa"));// Ei lähe läbi, kuna tagastus peaks olema "Sisend ei ole arv".
		//assertEquals("Sisendatud arv on algarv", r.getPrime("5.0"));	// Ei lähe läbi, kuna tagastus peaks olema "Sisend ei ole arv".
		//assertEquals("Sisendatud arv on algarv", r.getPrime("123165656465468"));
		
		
		assertEquals("", r.getPrime("5"));
		assertEquals("Ei ole algarv", r.getPrime("16"));
		assertEquals("Sisend ei ole arv", r.getPrime("hussa"));
		assertEquals("Sisend ei ole arv", r.getPrime("123165656465468"));
		
    }


}
