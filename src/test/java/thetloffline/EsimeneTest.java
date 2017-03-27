package thetloffline;


import org.junit.*;
import static org.junit.Assert.*;

public class EsimeneTest{
	@Test

	public void katsel() {
		assertEquals(3, 2 + 1);
	}

	@Test
	public void tervituseTest() {
		Rakendus r = new Rakendus();
		assertEquals("Tere, Juku", r.tervitusfunktsioon3("Juku"));
	}

	@Test
	public void viisakatervituseTest() {
		Rakendus r = new Rakendus();
		assertEquals("Tere, kodanik Toomas T", r.tervitusfunktsioon4("Toomas", "Thetloff"));
	}

	@Test
	public void ebaviisakatervituseTest() {
		Rakendus r = new Rakendus();
		assertEquals("Johhaidii! Tere, Toomas Thetloff", r.ebaviisakasTervitus("Toomas", "Thetloff"));
		assertEquals("Johhaidii! Nimi puudub!", r.ebaviisakasTervitus(null, null));
		assertEquals("Johhaidii! Nimi puudub!", r.ebaviisakasTervitus("", ""));
	}
}