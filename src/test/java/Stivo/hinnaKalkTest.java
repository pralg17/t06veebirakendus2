package Stivo;

import org.junit.*;
import static org.junit.Assert.*;

public class hinnaKalkTest{
	@Test
	public void hinnaKalkTest1(){
		Rakendus r = new Rakendus();
		assertEquals("Andmed puuduvad", r.hk(null, null));
		assertEquals("Kaarti pole", r.hk("2", "0"));
		assertEquals("Kaart on", r.hk("2", "1"));
	}
}