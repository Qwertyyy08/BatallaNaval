/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

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
public class AIPlayerTest {
    
    public AIPlayerTest() {
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
     * Test of disparar method, of class AIPlayer.
     */
    @Test
    public void testDisparar() {
        System.out.println("disparar");
        BoardModel tableroEnemigo = null;
        AIPlayer instance = new AIPlayer();
        CellState expResult = null;
        CellState result = instance.disparar(tableroEnemigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUltimoDisparo method, of class AIPlayer.
     */
    @Test
    public void testGetUltimoDisparo() {
        System.out.println("getUltimoDisparo");
        AIPlayer instance = new AIPlayer();
        int[] expResult = null;
        int[] result = instance.getUltimoDisparo();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reset method, of class AIPlayer.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        AIPlayer instance = new AIPlayer();
        instance.reset();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
