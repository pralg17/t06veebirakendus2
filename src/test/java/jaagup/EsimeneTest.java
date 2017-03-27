package jaagup;

import org.junit.*;
import static org.junit.Assert.*;

public class EsimeneTest{
	
	/*@Test
	public void katse1(){
		assertEquals(3, 2+1);
	}*/

    @Test
    public void tervituseTest(){
		Rakendus r=new Rakendus();
		assertEquals("x1 = -0.5 ja x2 = -2.0", r.sqrequ("2","5","2"));
	}
	
}
