package johan;
import org.junit.*;
import static org.junit.Assert.*;

public class EsimeneTest{
	@Test
	public void n2itlejaTest(){
		Rakendus r = new Rakendus();
		assertEquals("Näitleja Paul Walker IMDB kood on: nm0908094", r.n2itleja("Paul", "Walker", "nm0908094"));
		
	}
	
	@Test 
	public void koodiTest(){
		Rakendus r = new Rakendus();
		assertEquals(9, r.kood("nm0908094").length());
	}
}