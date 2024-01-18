import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class DemoTest {
       @Test
    public void testArmstrongNumber() {
        assertTrue(ArmstrongNumber.isArmstrongNumber(153));  
        assertTrue(ArmstrongNumber.isArmstrongNumber(370)); 
        
    }

    @Test
    public void testNonArmstrongNumber() {
        assertFalse(ArmstrongNumber.isArmstrongNumber(123)); 
      
        assertFalse(ArmstrongNumber.isArmstrongNumber(1635));
    }
    @Test
    public void testIsArmstrongNumberWithLargeNumber() {
        assertTrue(ArmstrongNumber.isArmstrongNumber(8208));
        assertTrue(ArmstrongNumber.isArmstrongNumber(9474));
    }

    @Test
    public void testIsArmstrongNumberWithNegativeNumber() {
        assertFalse(ArmstrongNumber.isArmstrongNumber(-153));
        assertFalse(ArmstrongNumber.isArmstrongNumber(-203));
    }
}
