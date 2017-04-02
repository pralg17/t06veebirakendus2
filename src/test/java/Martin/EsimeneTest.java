package Martin;

import org.junit.*;
import static org.junit.Assert.*;

public class EsimeneTest{
	//tyhja v2lja kontrollimine, peab olema null
	@Test
	public void CityTest1(){
		Rakendus r = new Rakendus();
		assertNull(r.linn, null);
	}
	@Test
	//linna sisestamine ei tohi olla null
	public void CityTest2(){
		Rakendus r = new Rakendus();
		r.looUusLinn("Helsinki");
		
		assertNotNull(r.linn, new Object());
	}
	@Test
	//esimese ja teise linna kontrllimine meelega valesti pandud
	public void CityTest3(){
		Rakendus r = new Rakendus();
		Rakendus r2 = new Rakendus();
		
		r.looUusLinn("Helsinki");
		r2.looUusLinn("Tallinn");
		
		assertEquals(r.linn, r2.linn);
	}
}	