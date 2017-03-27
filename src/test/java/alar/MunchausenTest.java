package alar;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by AASA on 27.03.2017.
 */
public class MunchausenTest {
    Rakendus r = new Rakendus();

    @Test
    public void is3435(){
        assertEquals(true, r.isMunchausenNumber("3435"));
    }

    @Test
    public void isEmpty(){
        assertEquals(false, r.isMunchausenNumber(""));
    }

    @Test
    public void is0(){
        assertEquals(true, r.isMunchausenNumber("0"));
    }

    @Test
    public void is1 (){
        assertEquals(true, r.isMunchausenNumber("1"));
    }

    @Test
    public void is438579088(){
        assertEquals(true, r.isMunchausenNumber("438579088"));
    }

    @Test
    public void is3 (){
        assertEquals(false, r.isMunchausenNumber("3"));
    }
}
