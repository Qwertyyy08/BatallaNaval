/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Vista;

import javax.swing.JButton;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author juand
 */
public class ResultCardTest {
    
    public ResultCardTest() {
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
     * Test of setResultado method, of class ResultCard.
     */
    @Test
    public void testSetResultado() {
        System.out.println("setResultado");
        String texto = "";
        boolean victoria = false;
        ResultCard instance = new ResultCard();
        instance.setResultado(texto, victoria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayAgainButton method, of class ResultCard.
     */
    @Test
    public void testGetPlayAgainButton() {
        System.out.println("getPlayAgainButton");
        ResultCard instance = new ResultCard();
        JButton expResult = null;
        JButton result = instance.getPlayAgainButton();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLeaveButton method, of class ResultCard.
     */
    @Test
    public void testGetLeaveButton() {
        System.out.println("getLeaveButton");
        ResultCard instance = new ResultCard();
        JButton expResult = null;
        JButton result = instance.getLeaveButton();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
