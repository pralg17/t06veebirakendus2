package greg;

import org.junit.*;
import static org.junit.Assert.*;

public class EsimeneTest{
	@Test
	public void test1(){
		Rakendus r = new Rakendus();
		assertNull(r.eesnimi, null);
	}
	@Test
	public void test2(){
		Rakendus r = new Rakendus();
		r.looUusInimene("Greg");
		assertNotNull(r.eesnimi, new Object());
	}
	@Test
	public void test3(){
		Rakendus r = new Rakendus();
		Rakendus r2 = new Rakendus();
		r.looUusInimene("Greg");
		r2.looUusInimene("Greg");
		assertEquals(r.eesnimi, r2.eesnimi);
	}
	
}
