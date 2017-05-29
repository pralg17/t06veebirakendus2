package ingomagi;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RakendusTest{
	
    @Test
	public void katse0(){
		assertEquals(3, 2+1);
	}
	
	@Test
	public void katse1(){
		Rakendus r=new Rakendus();
		assertEquals(String.valueOf(16.0), r.ruut("4"));
	}
	
	
}