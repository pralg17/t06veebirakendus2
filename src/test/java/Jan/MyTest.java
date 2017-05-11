package Jan;

import org.junit.*;
import static org.junit.Assert.*;

public class MyTest {

    @Test
    public void juurTest(){
        Rakendus r=new Rakendus();
        assertEquals("500.0", r.ruutjuur(250000));
    }
}
