package paul;


import org.junit.*;
import static org.junit.Assert.*;

public class EsimeneTest{
	@Test

	public void katsel() {
		assertEquals(3, 2 + 1);
	}

	@Test

	public void tervituseTest() {
		Rakendus r = new Rakendus();
		assertEquals("Tere, Karl", r.tervitusfunktsioon2("Karl"));
	}

	@Test

	public void sobratervituseTest() {
		Rakendus r = new Rakendus();
		assertEquals("Tere sõber  Juhan Vasemägi", r.tervitusfunktsioon3(" Juhan", "Vasemägi"));
		assertEquals("Tere sõber pole nime ", r.tervitusfunktsioon3("null", "null"));
		assertEquals("Tere sõber pole nime", r.tervitusfunktsioon3("", ""));

	}


}

//Running paul.EsimeneTest
//Tests run: 3, Failures: 1, Errors: 0, Skipped: 0, Time elapsed: 0.031 sec <<< FAILURE! - in paul.EsimeneTest
//sobratervituseTest(paul.EsimeneTest)  Time elapsed: 0.015 sec  <<< FAILURE!
//org.junit.ComparisonFailure: expected:<Tere s§ber [ Juhan Vasemõgi]> but was:<Tere s§ber [Juhan V]>
//        at org.junit.Assert.assertEquals(Assert.java:115)
//        at org.junit.Assert.assertEquals(Assert.java:144)
//        at paul.EsimeneTest.sobratervituseTest(EsimeneTest.java:25)


//Results :

//Failed tests:
//  EsimeneTest.sobratervituseTest:25 expected:<Tere s§ber [ Juhan Vasemõgi]> but was:<Tere s§ber [Juhan V]>

//Tests run: 3, Failures: 1, Errors: 0, Skipped: 0