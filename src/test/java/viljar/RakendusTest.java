package viljar;
import org.junit.*;
import java.io.IOException;
import static org.junit.Assert.*;

public class RakendusTest{
	@Test
	public void kasTöökulud() throws IOException{
		assertEquals(80,(new Arvuta().ArvutaKulu(5,12)),0.5);
	}

		@Test
		public void kasKatte() throws IOException{
			assertEquals(51,(new Arvuta().Arvutakatte(5,12)),0.5);
		}

}
