package jaagup;

import org.junit.*;

import static org.junit.Assert.*;

public class EsimeneTest {

    Rakendus rakendus = new Rakendus();

    @Test
    public void idTest1() {

        assertEquals("Id is empty", rakendus.codeTests(""));
        assertEquals("Id is missing", rakendus.codeTests(null));

        assertEquals("Id must be 11 characters", rakendus.codeTests("38905220293"));

    }

   
	
	@Test 
	public void idTestSex(){
		assertEquals("This is a man's id code", rakendus.maleOrFemale("38905220293"));
		assertEquals("This is a woman's id code", rakendus.maleOrFemale("49409262769"));
	}
}
//Results :

//Tests run: 2, Failures: 0, Errors: 0, Skipped: 0


//algarv
//id kood mees või naine