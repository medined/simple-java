package simple.entity;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class CarReaderTest {

    private CarReader instance;

    @Before
    public void setup() {
        instance = new CarReader();
    }
    
    @Test
    public void testA() {
        String expResult = "a";
        String result = instance.a();
        assertEquals(expResult, result);
    }

    @Test
    public void testB() {
        String expResult = "b";
        String result = instance.b();
        assertEquals(expResult, result);
    }

    @Test
    public void testC() {
        String expResult = "c";
        String result = instance.c();
        assertEquals(expResult, result);
    }

    @Test
    public void testD() {
        String expResult = "d";
        String result = instance.d();
        assertEquals(expResult, result);
    }

    @Test
    public void testE() {
        String expResult = "e";
        String result = instance.e();
        assertEquals(expResult, result);
    }

    @Test
    public void testF() {
        String expResult = "f";
        String result = instance.f();
        assertEquals(expResult, result);
    }

    @Test
    public void testG() {
        String expResult = "g";
        String result = instance.g();
        assertEquals(expResult, result);
    }

    @Test
    public void testH() {
        String expResult = "h";
        String result = instance.h();
        assertEquals(expResult, result);
    }

    @Test
    public void testI() {
        String expResult = "i";
        String result = instance.i();
        assertEquals(expResult, result);
    }

    @Test
    public void testJ() {
        String expResult = "j";
        String result = instance.j();
        assertEquals(expResult, result);
    }

    @Test
    public void testK() {
        String expResult = "k";
        String result = instance.k();
        assertEquals(expResult, result);
    }
    
}
