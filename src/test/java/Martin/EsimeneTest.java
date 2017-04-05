package Martin;

import org.junit.*;
import static org.junit.Assert.*;

public class EsimeneTest{
		
	@Test
	//Raaamtu test 
	public void raamatuTest(){
		Rakendus r=new Rakendus();
		assertEquals("Raamat, The Lord of the Rings J. R. R. Tolkien, ISBN on 9789985552445", r.raamat("The Lord of the Rings", "J. R. R. Tolkien", "9789985552445"));
	}
	//isbn koodi test
	@Test
	public void koodiTest(){
		Rakendus r=new Rakendus();
		
		assertEquals(13, r.isbn("9789985552455").length());
	}
	
	
}	