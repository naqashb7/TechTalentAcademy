/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author naqash
 */
public class CircleTest {
    
    public CircleTest() {
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
     * Test of draw method, of class Circle.
     */
    @Test
    public void testDraw() {
     
      Circle obj = new Circle(2);
      double result= obj.draw();
      double expectedResult= 12.56;
      assertEquals (expectedResult, result, 2);
    }
    
    @Test
   public void testDraw2(){
       Circle obj = new Circle(4);
      double result= obj.draw();
      double expectedResult= 50.26;
      assertEquals (expectedResult, result, 4);
   }
    
   @Test
   public void testDraw3(){
       Circle obj = new Circle (-2);
       double result= obj.draw();
       String expectedResult= "wrong radius";
       assertEquals (expectedResult,result);
   }
}
