package Chris;

import org.junit.*;
import static org.junit.Assert.*;

public class EsimeneTest{
	
	@Test
	public void k_test1(){
		
		Rakendus r = new Rakendus();
		
		//Tests to check if any data was entered
		assertEquals("Empty data", r.k_ymbermoot("", "", ""));
		assertEquals("Data input is missing", r.k_ymbermoot(null, null, null));
		
	}
	
	@Test
	public void k_test2(){
		
		Rakendus r = new Rakendus();
		
		//Tests to see if data is suitable
		assertEquals("This kind of triangle cannot exist", r.k_ymbermoot("0", "1", "2"));
		assertEquals("The sum of a triangle's inner angles must always be 180 degrees")
		
	}
	
}