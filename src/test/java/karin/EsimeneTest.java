package karin;

import org.junit.*;
import static org.junit.Assert.*;

	public class EsimeneTest{
	@Test
	public void test1(){
		assertEquals(3, 3);
	}
	
	//public String keskmine(String hinne, String eap){}
	@Test
	public void test2(){
		Rakendus r = new Rakendus();
		assertEquals("Hinne sisestamata", r.keskmine(null , null));
		assertEquals("Hinne sisestamata", r.keskmine("" , ""));
		assertEquals("Hinne sisestamata", r.keskmine(null , "3"));
		assertEquals("Hinne sisestamata", r.keskmine("" , "4"));
		assertEquals("Ainepunktid sisestamata", r.keskmine("A" , null));
		assertEquals("Ainepunktid sisestamata", r.keskmine("A" , ""));
		assertEquals("Igale hindele peab vastama ainepunkt", r.keskmine("A;4" , "3;4;3"));
	
		assertEquals("4.0", r.keskmine("4.0" , "8.0"));
		assertEquals("5.0", r.keskmine("A;8;4" , "4;4;n")); 
		assertEquals("5.0", r.keskmine("A;8;4" , "4;;böö"));
		assertEquals("4.14", r.keskmine("A;3;x" , "4;3;3"));
		assertEquals("3.92", r.keskmine("A;3;b" , "4;5;3")); //	3.9167..~ 3.92
		//hinne/eap paarid:  3..4   5..3   5..4   3..4
		assertEquals("3.93", r.keskmine(",;;; 3  ; 3.5; 5; 5;4;3;b" , "4;5;4,5;4;3;3;4; ejjee ;4;,3"));  //3.9333 -> 3.93
		
	}
	// public String hindeKontroll(String sisend){}
	@Test
	public void test3(){
		Rakendus r = new Rakendus();
		assertEquals("Hinne sisestamata", r.hindeKontroll(null));
		assertEquals("Hinne sisestamata", r.hindeKontroll(""));
		assertEquals("5.0", r.hindeKontroll("a"));
		assertEquals("5.0", r.hindeKontroll("A"));
		assertEquals("5.0", r.hindeKontroll("5"));
		assertEquals("Hinne peab olema vahemikus 0-5", r.hindeKontroll("5.1"));
		assertEquals("Hinded peavad olema täisarvud", r.hindeKontroll("4.1"));
		assertEquals("Hinne peab olema vahemikus 0-5", r.hindeKontroll("7"));
		assertEquals("Siseta hinne kujul: A või 5", r.hindeKontroll("viis"));
	}
	
	//public String punktiKontroll(String sisend){}
	@Test
	public void test4(){
		Rakendus r = new Rakendus();
		assertEquals("Ainepunktid sisestamata", r.punktiKontroll(null));
		assertEquals("Ainepunktid sisestamata", r.punktiKontroll(""));
		assertEquals("Ainepunktid peavad olema täisarvud", r.punktiKontroll("3.5"));
		assertEquals("Liiga suured ainepunktid", r.punktiKontroll("50"));
		assertEquals("Ainepunkt peab nullist suurem olema", r.punktiKontroll("0"));
		assertEquals("4.0", r.punktiKontroll("4"));
		assertEquals("3.0", r.punktiKontroll("3.0"));
		assertEquals("Siseta ainepunktid kujul: 4", r.punktiKontroll("3,0"));
		assertEquals("Siseta ainepunktid kujul: 4", r.punktiKontroll("5eap"));
	}
	
}	

/*
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running karin.EsimeneTest
Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.009 sec - in karin.EsimeneTest

Results :

Tests run: 4, Failures: 0, Errors: 0, Skipped: 0

*/

