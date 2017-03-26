package karlerik;

import org.junit.*;
import static org.junit.Assert.*;

public class HWTest {
	
	@Test
	public void shoppingCartTest1() {
		Rakendus r = new Rakendus();
		assertEquals("Toode Vintage V100WR, hind: 587.65 EUR, makstud: 2000.00 EUR, tagasi: 1412.35 EUR", r.shoppingCart("Vintage V100WR", "587.65", "2000.00"));
		assertEquals("Toode Ibanez AT100CL-SB, hind: 2673.99 EUR, makstud: 3000.00 EUR, tagasi: 326.01 EUR", r.shoppingCart("Ibanez AT100CL-SB", "2673.99", "3000.00"));
		/* Results :

		Tests run: 2, Failures: 0, Errors: 0, Skipped: 0 */
	}
	
	@Test
	public void shoppingCartTest2() {
		Rakendus r = new Rakendus();
		assertEquals("Andmeid ei ole sisestatud", r.shoppingCart(null, "587.65", "2000.00"));
		
		/* assertEquals("Andmed on tyhjad", r.shoppingCart(" ", "587.65", "2000.00")); */
		/* Results :

		Failed tests:
		  HWTest.shoppingCartTest2:22 expected:<[Andmed on tyhjad]> but was:<[Toode  , hind: 587.65 EUR, makstud: 2000.00 EUR, tagasi: 1412.35 EUR]>

		Tests run: 2, Failures: 1, Errors: 0, Skipped: 0 */
		
		assertEquals("Andmed on tyhjad", r.shoppingCart("", "587.65", "2000.00"));
		
		/* Results :

		Tests run: 2, Failures: 0, Errors: 0, Skipped: 0 */
	}
	
	@Test
	public void shoppingCartTest3() {
		Rakendus r = new Rakendus();
		assertEquals("Ostu jaoks ei ole piisavalt raha", r.shoppingCart("Vintage V100WR", "587.65", "500"));
		assertEquals("Toode Ibanez AT100CL-SB, hind: 2673.99 EUR, makstud: 2673.99 EUR, tagasi: 0.00 EUR", r.shoppingCart("Ibanez AT100CL-SB", "2673.99", "2673.99"));
		/* Results :

		Tests run: 3, Failures: 0, Errors: 0, Skipped: 0 */
	}
	
	
	
	
	

	
	
	
}