package henry;


import org.junit.*;
import static org.junit.Assert.*;

public class EsimeneTest{
	@Test

	public void katsel() {
		assertEquals(3, 2 + 1);
	}

	@Test
	public void tervitusfunktsioon1Test() {
		Rakendus r = new Rakendus();
		assertEquals("Tere, Henry", r.tervitusfunktsioon1("Henry"));
	}


	@Test
	public void tervitusfunktsioon2Test() {
		Rakendus r = new Rakendus();
		assertEquals("Tere tulemast Henry", r.tervitusfunktsioon2("Henry"));
		assertEquals("Peeter sina ei või seda lehte külastada!", r.tervitusfunktsioon2("peeter"));
	}

	@Test
	public void tervitusfunktsioon3Test() {
		Rakendus r = new Rakendus();
		assertEquals("You peeter paan ,kuidas käpp käib?", r.tervitusfunktsioon3("peeter", "paan"));
		assertEquals("Youyou mees, lükka nimi sisse vennas!", r.tervitusfunktsioon3(null,null));
		assertEquals("Youyou mees, lükka nimi sisse vennas!", r.tervitusfunktsioon3("",""));


	}
}
