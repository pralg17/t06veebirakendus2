package rasmus;

import org.junit.*;
import static org.junit.Assert.*;

public class EsimeneTest{
	@Test
	public void isikuTest(){
		Rakendus r=new Rakendus();
		assertEquals("Tere, Rasmus Aaviste, Teie isikukood on 39603304212!", r.isik("Rasmus", "Aaviste", "39603304212"));
	}
	
	@Test
	public void koodiTest(){
		Rakendus r=new Rakendus();
		
		assertEquals(11, r.kood("39603304233").length());
	}
	
}