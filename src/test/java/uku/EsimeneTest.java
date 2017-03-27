package uku;

import org.junit.*;
import static org.junit.Assert.*;

public class EsimeneTest{
	@Test
	public void vastus1(){
		Rakendus r=new Rakendus();
		

		
		
		assertEquals("saad stippi",r.vastus("30","4"));
		//assertEquals("ei saa stippi",r.vastus("29","4"));
		assertEquals("tyhi sisend", r.vastus("","4"));
		assertEquals("sisend puudub", r.vastus(null,"4"));
		
	}
	
}
