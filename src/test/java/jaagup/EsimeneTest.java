package jaagup;

import org.junit.*;
import static org.junit.Assert.*;

public class EsimeneTest{
	
	/*@Test
	public void katse1(){
		assertEquals(3, 2+1);
	}*/

    @Test
    public void rvl(){
		Rakendus r=new Rakendus();
		assertEquals("x1 = -0.5 ja x2 = -2.0", r.sqrequ("2","5","2"));
	}
	
	@Test
    public void rvl2(){
		Rakendus r=new Rakendus();
		assertEquals("x1 = x2 = -1.0", r.sqrequ("2","4","2"));
	}
	
	@Test
    public void rvl3(){
		Rakendus r=new Rakendus();
		assertEquals("Reaalarvulised lahendid puuduvad", r.sqrequ("2","2","2"));
	}
	
}
