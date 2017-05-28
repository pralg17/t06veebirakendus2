package baas;

 import org.junit.*;
 import static org.junit.Assert.*;

 import static org.hamcrest.MatcherAssert.assertThat;
 import static org.hamcrest.Matchers.*;

 public class EsmaneTest{
 	@Test
 	public void varjupaigaTest(){
 		Rakendus r=new Rakendus();
 		assertEquals("Koer/Kass nimega Muki asub Rehe varjupaigas. Tema kiibikood on 23568", r.varjupaik("Muki", "Rehe", "23568"));
 	}

 	@Test
 	public void kiibiTest(){
 		Rakendus r=new Rakendus();

 		assertEquals(5, r.kood("23568").length());
 	}

 }
