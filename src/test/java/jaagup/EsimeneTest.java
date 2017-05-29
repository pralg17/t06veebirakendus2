package jaagup;

import org.junit.*;
import static org.junit.Assert.*;

public class EsimeneTest{
	@Test
	public void katse1(){
		assertEquals(3, 2+1);
	}

    @Test
   public void tervituseTest(){
		Rakendus r=new Rakendus();
		assertEquals("Ahoi!", r.tervitusfunktsioon());
	}
	
	@Test
	public void keskmiseTest(){
		Rakendus r=new Rakendus();
		assertEquals("5", r.keskmine("5"));
		assertEquals("6", r.keskmine("6"));
	}
	
	@Test
	public void kesmiseTest2(){
		Rakendus r =new Rakendus();
		assertEquals("tyhi sisend", r.keskmine(""));
		assertEquals("Sisend puudub", r.keskmine(null));
	}
	@Test
	public void tervituseTest1(){
		Rakendus r=new Rakendus();
		assertEquals("Tere,Priit", r.tervist("Priit"));
	}
	@Test
	public void tervitusTest2(){
		Rakendus r = new Rakendus();
		assertEquals("Tere, kodanik Peeter P",r.tervist2("Peeter", "Paan"));
	}
	
	@Test
	public void synnipaevatest(){
		Rakendus r = new Rakendus();
		assertEquals("Teie synnipaev on 06.09.1997", r.tervist3("06", "09", "1997"));
	}
	
	
	

}
