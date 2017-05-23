package elle;

import org.junit.*;
import static org.junit.Assert.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class EsimeneTest{
	@Test
	public void isikuTest(){
		Rakendus r=new Rakendus();
		assertEquals("Tere, Kerli Kallas. Teie kassakood on 5556", r.isik("Kerli", "Kallas", "5556"));
	}

	@Test
	public void koodiTest(){
		Rakendus r=new Rakendus();

		assertEquals(4, r.kood("5556").length());
	}

}
