package jsj;

import org.junit.*;
import static org.junit.Assert.*;

public class test{
	
	@Test 
	public void ruutjuurTest(){
		rakendus r=new rakendus();
		assertEquals(3.0, r.rj(9));
	}
	
	@Test
	public void geomTest(){
		rakendus r=new rakendus();
		assertEquals(5.196152422706632, r.geomkesk(3, 9));
	}
}



/*
mvn -Dtest=test test

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running jsj.test
Tests run: 2, Failures: 2, Errors: 0, Skipped: 0, Time elapsed: 0.004 sec <<< FAILURE! - in jsj.test
ruutjuurTest(jsj.test)  Time elapsed: 0.001 sec  <<< FAILURE!
java.lang.AssertionError: expected: java.lang.Double<3.0> but was: java.lang.String<3.0>
        at org.junit.Assert.fail(Assert.java:88)
        at org.junit.Assert.failNotEquals(Assert.java:834)
        at org.junit.Assert.assertEquals(Assert.java:118)
        at org.junit.Assert.assertEquals(Assert.java:144)
        at jsj.test.ruutjuurTest(test.java:11)

geomTest(jsj.test)  Time elapsed: 0.002 sec  <<< FAILURE!
java.lang.AssertionError: expected: java.lang.Double<5.196152422706632> but was: java.lang.String<5.196152422706632>
        at org.junit.Assert.fail(Assert.java:88)
        at org.junit.Assert.failNotEquals(Assert.java:834)
        at org.junit.Assert.assertEquals(Assert.java:118)
        at org.junit.Assert.assertEquals(Assert.java:144)
        at jsj.test.geomTest(test.java:17)


Results :

Failed tests:
  test.geomTest:17 expected: java.lang.Double<5.196152422706632> but was: java.lang.String<5.196152422706632>
  test.ruutjuurTest:11 expected: java.lang.Double<3.0> but was: java.lang.String<3.0>

Tests run: 2, Failures: 2, Errors: 0, Skipped: 0


*/