package rauntege;

import org.junit.*;
import static org.junit.Assert.*;

public class EsimeneTest{

	@Test
	public void test1(){
		Rakendus r= new Rakendus();
		assertEquals("Ahoi!", r.tervitusfunktsioon());
	}

	@Test
	public void test2(){
		Rakendus r = new Rakendus();
		assertEquals("0.96", r.eurocalc("15"));
	}

}
