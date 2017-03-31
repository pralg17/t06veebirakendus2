package taankomm;

import org.junit.*;
import static org.junit.Assert.*;

public class HinnakalkTest{

  @Test
  public void hinnakalkTest1(){
    Rakendus r=new Rakendus();
    assertEquals("Ostukorv on tühi!", r.hk("", "", null));
    assertEquals("Kliendikaarti ei ole! Summa: 0.0 eurot.", r.hk("0", "2", null));
    assertEquals("Ostukorv on tühi!", r.hk("10", "0", null));
    assertEquals("Kliendikaarti ei ole! Summa: 20.0 eurot.", r.hk("10","2", null));
    assertEquals("Kliendikaarti ei ole! Summa: 19.8 eurot.", r.hk("9.9", "2", null));
    assertEquals("Kliendina lisandub soodustus -10%. Summa: 18.0 eurot.", r.hk("10", "2", "jah"));
    assertEquals("Kliendina lisandub soodustus -10%. Summa: 17.82 eurot.", r.hk("9.9", "2", "jah"));
    assertEquals("Kliendikaarti ei ole! Ostes rohkem kui 2 eset lisandub soodustus -10%. Summa: 27.0 eurot.", r.hk("10", "3", null));
    assertEquals("Ostes rohkem kui 2 eset lisandub soodustus -10%. Kliendina (lisandub soodustus -10%) on summa: 24.0 eurot.", r.hk("10", "3", "jah"));

  }
}
