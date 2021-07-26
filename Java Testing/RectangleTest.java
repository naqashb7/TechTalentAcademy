

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RectangleTest {
    
    public RectangleTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of draw method, of class Rectangle.
     */
    @Test
    public void testDraw() {
        Rectangle obj = new Rectangle(2,4);
        double result = obj.draw();
        double expectedResult = 8;
        assertEquals(expectedResult, result, 0.0);
        
    }
    @Test
   public void testDraw2() {
        Rectangle obj = new Rectangle(1.0,4.0);
        double result = obj.draw();
        double expectedResult = 4;
        assertEquals(expectedResult, result, 0.0);
        
    }
   
   @Test
   public void testDraw3() {
        Rectangle obj = new Rectangle(1.0,4.0);
        double result = obj.draw();
        String expectedResult = "wrong width";
        assertEquals(expectedResult, result);
        
    }
}
