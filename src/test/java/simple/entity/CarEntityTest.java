package simple.entity;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CarEntityTest {
    
    @Test
    public void testGetters() {
        CarEntity instance = new CarEntity();
        instance.setName("chrysler");
        instance.setYear(1999);
        assertEquals("chrysler", instance.getName());
        assertEquals(1999, instance.getYear());
    }

    @Test
    public void testDuplicate() {
        CarEntity instance = new CarEntity();
        instance.setName("chrysler");
        instance.setYear(1999);
        CarEntity result = instance.duplicate(instance);
        assertEquals(result.getName(), instance.getName());
        assertEquals(result.getYear(), instance.getYear());
    }
    
}
