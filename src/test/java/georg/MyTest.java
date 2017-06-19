package georg;

import org.junit.*;
import static org.junit.Assert.*;

public class MyTest {
	
	@Test
	public void voladTest1() {
		Rakendus r = new Rakendus();
		assertEquals("Inimesele Madis oli volg: 657.65 EUR, maksti: 100.00 EUR, pysiv volg: 557.65 EUR", r.volad("Madis", "657.65", "100.00"));
		assertEquals("Inimesele Jaan oli volg: 99.99 EUR, maksti: 50.00 EUR, pysiv volg: 49.99 EUR", r.volad("Jaan", "99.99", "50.00"));
		assertEquals("Andmeid ei ole sisestatud", r.volad(null, "657.65", "100.00"));
		assertEquals("Andmed on tyhjad", r.volad("", "657.65", "100.00"));
		assertEquals("Makse ei saa olla negatiivne", r.volad("Madis", "657.65", "-100.00"));
		assertEquals("Inimesele Jaan oli volg: 0.00 EUR, maksti: 0.00 EUR, pysiv volg: 0.00 EUR", r.volad("Jaan", "0.00", "0.00"));	
	
	}
	
	
	/*Running georg.MyTest
	Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.018 sec - in georg.MyTest

	Results :

	Tests run: 1, Failures: 0, Errors: 0, Skipped: 0 */


	
	
	
}