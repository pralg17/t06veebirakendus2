package johan;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void ostutest() {
		DemoApplication d = new DemoApplication();
		assertEquals("Ostsite: 100 TKM1T aktsiat hinnaga 8.90 eurot tukk", d.aktsia("TKM1T", "100", "8.90"));
	}

	@Test
	public void otsimisetest(){
		DemoApplication d = new DemoApplication();
		assertEquals(5, d.otsi("TKM1T").length());
	}

}
