package jaagup;

import org.junit.*;
import static org.junit.Assert.*;

public class EsimeneTest{
	
	/*@Test
	public void katse1(){
		assertEquals(3, 2+1);
	}*/

    @Test
    public void rvl(){
		Rakendus r=new Rakendus();
		assertEquals("x1 = -0.5 ja x2 = -2.0", r.sqrequ("2","5","2"));
	}
	
	@Test
    public void rvl2(){
		Rakendus r=new Rakendus();
		assertEquals("x1 = x2 = -1.0", r.sqrequ("2","4","2"));
	}
	
	@Test
    public void rvl3(){
		Rakendus r=new Rakendus();
		assertEquals("Reaalarvulised lahendid puuduvad", r.sqrequ("2","2","2"));
	}
	
	@Test
    public void rvl4(){
		Rakendus r=new Rakendus();
		assertEquals("x1 = 2.0 ja x2 = -2.0", r.sqrequ("1","","-4"));
	}
	
	@Test
    public void rvl8(){
		Rakendus r=new Rakendus();
		assertEquals("x1 = 2.0 ja x2 = -2.0", r.sqrequ("1","0","-4"));
	}
	
	@Test
    public void rvl9(){
		Rakendus r=new Rakendus();
		assertEquals("x1 = 2.0 ja x2 = -2.0", r.sqrequ("1",null,"-4"));
	}
	
	@Test
    public void rvl5(){
		Rakendus r=new Rakendus();
		assertEquals("Reaalarvulised lahendid puuduvad", r.sqrequ("1","","4"));
	}
	
	@Test
    public void rvl10(){
		Rakendus r=new Rakendus();
		assertEquals("Reaalarvulised lahendid puuduvad", r.sqrequ("1","0","4"));
	}
	
	@Test
    public void rvl11(){
		Rakendus r=new Rakendus();
		assertEquals("Reaalarvulised lahendid puuduvad", r.sqrequ("1",null,"4"));
	}
	
	@Test
    public void rvl6(){
		Rakendus r=new Rakendus();
		assertEquals("x1 = 0.0 ja x2 = -4.0", r.sqrequ("1","4",""));
	}
	
	@Test
    public void rvl12(){
		Rakendus r=new Rakendus();
		assertEquals("x1 = 0.0 ja x2 = -4.0", r.sqrequ("1","4","0"));
	}
	
	@Test
    public void rvl13(){
		Rakendus r=new Rakendus();
		assertEquals("x1 = 0.0 ja x2 = -4.0", r.sqrequ("1","4",null));
	}
	
	@Test
    public void rvl7(){
		Rakendus r=new Rakendus();
		assertEquals("x1 = x2 = 0.0", r.sqrequ("1","",""));
	}
	
	@Test
    public void rvl14(){
		Rakendus r=new Rakendus();
		assertEquals("x1 = x2 = 0.0", r.sqrequ("1","0","0"));
	}
	
	@Test
    public void rvl15(){
		Rakendus r=new Rakendus();
		assertEquals("x1 = x2 = 0.0", r.sqrequ("1",null,null));
	}
	
	@Test
    public void rvl16(){
		Rakendus r=new Rakendus();
		assertEquals("x1 = x2 = 0.0", r.sqrequ("1","","0"));
	}
	
	@Test
    public void rvl17(){
		Rakendus r=new Rakendus();
		assertEquals("x1 = x2 = 0.0", r.sqrequ("1","",null));
	}
	
	@Test
    public void rvl18(){
		Rakendus r=new Rakendus();
		assertEquals("x1 = x2 = 0.0", r.sqrequ("1","0",""));
	}
	
	@Test
    public void rvl19(){
		Rakendus r=new Rakendus();
		assertEquals("x1 = x2 = 0.0", r.sqrequ("1","0",null));
	}
	
	@Test
    public void rvl20(){
		Rakendus r=new Rakendus();
		assertEquals("x1 = x2 = 0.0", r.sqrequ("1",null,""));
	}
	
	@Test
    public void rvl21(){
		Rakendus r=new Rakendus();
		assertEquals("x1 = x2 = 0.0", r.sqrequ("1",null,"0"));
	}
	
}
