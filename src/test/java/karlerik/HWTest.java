package karlerik;

import org.junit.*;
import static org.junit.Assert.*;

public class HWTest {
	
	@Test
	public void shoppingCartTest1() {
		Rakendus r = new Rakendus();
		assertEquals("Toode Vintage V100WR, hind: 587.65 EUR, makstud: 2000.00 EUR, tagasi: 1412.35 EUR", r.shoppingCart("Vintage V100WR", "587.65", "2000.00"));
		assertEquals("Toode Ibanez AT100CL-SB, hind: 2673.99 EUR, makstud: 3000.00 EUR, tagasi: 326.01 EUR", r.shoppingCart("Ibanez AT100CL-SB", "2673.99", "3000.00"));
	}
	/* Results :

	Tests run: 2, Failures: 0, Errors: 0, Skipped: 0 */
	
	
	
}