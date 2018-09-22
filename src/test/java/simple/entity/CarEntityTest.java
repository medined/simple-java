package simple.entity;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CarEntityTest {
    
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
