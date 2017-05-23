package Stivo;

import org.junit.*;
import static org.junit.Assert.*;

public class hinnaKalkTest{
	@Test
	public void hinnaKalkTest1(){
		Rakendus r = new Rakendus();
		assertEquals("Andmed puuduvad", r.hinnaKalk(null));
		assertEquals("Kaarti pole", r.hinnaKalk("2,0"));
		assertEquals("Kaart on", r.hinnaKalk("2,1"));
	}
}