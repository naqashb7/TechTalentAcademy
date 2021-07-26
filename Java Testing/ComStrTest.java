
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ComStrTest {
    
    public ComStrTest() {
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
     * Test of combine method, of class ComStr.
     */
    @Test
    public void testCombine() {
        String a = "1";
        String b = "0";
        ComStr obj = new ComStr();
        String expResult = "10";
        String result = obj.combine(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCombine2() {
        String a = "hi";
        String b = "bye";
        ComStr obj = new ComStr();
        String expResult = "hibye";
        String result = obj.combine(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCombine3() {
        String a = "10";
        String b = "number";
        ComStr obj = new ComStr();
        String expResult = "10number";
        String result = obj.combine(a, b);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testCombine4() {
        String a = "age";
        String b = "29";
        ComStr obj = new ComStr();
        String expResult = "age29";
        String result = obj.combine(a, b);
        assertEquals(expResult, result);
    }
}
