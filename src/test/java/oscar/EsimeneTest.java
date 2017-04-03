package oscar;

import org.junit.*;
import static org.junit.Assert.*;

public class EsimeneTest{
	@Test
	public void katse1(){
		assertEquals(3, 2+1);
	}
	
	@Test
	public void tervituseTest(){
		Rakendus r = new Rakendus();
		assertEquals("Tere, Juku", r.tervitusfunktsioon3("Juku"));
	}
	
	@Test
	public void tervituseTest2(){
		Rakendus m = new Rakendus();
		assertEquals("Tere, kodanik oscar heinla", m.tervitusfunktsioon4("oscar", "heinla"));
	}
	
	@Test
	public void tervituseTest3(){
		Rakendus m = new Rakendus();
		assertEquals("Tere, kodanik oscar heinla 7", m.tervitusfunktsioon5("oscar", "heinla", 7));
	}
	@Test
	public void arvutusTest(){
		Rakendus m = new Rakendus();
		assertEquals("1,4,4,0", m.arvutus(2, 2));
	}
	@Test
	public void pudrucalTest(){
		Rakendus m = new Rakendus();
		assertEquals("8.25", m.pudrucal("1", "1", "1", "1"));
	}
}