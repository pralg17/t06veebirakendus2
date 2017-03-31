package rauntege;

import org.junit.*;
import static org.junit.Assert.*;

public class EsimeneTest{
	@Test
	public void test1(){
		assertEquals(3, 3);
	}
	@Test
	public void test2(){
		Rakendus r= new Rakendus();
		assertEquals("Ahoi!", r.tervitusfunktsioon());
	}
	@Test
	public void test3(){
		Rakendus r= new Rakendus();
		assertEquals("Tere, Juku", r.tervitusfunktsioon3("Juku"));
		assertEquals("Nime pikkus on 0", r.tervitusfunktsioon3(""));
		assertEquals("Nimi puudub", r.tervitusfunktsioon3(null));
	}
	@Test
	public void test4(){
		rakendus r=new Rakendus();
		assertEquals("Kahjuks selliste linnade kohta info puudub!", r.kasSobivLinn(false));
	}
	
}