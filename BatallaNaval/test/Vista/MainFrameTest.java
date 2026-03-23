/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Vista;

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
public class MainFrameTest {
    
    public MainFrameTest() {
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
     * Test of mostrarCarta method, of class MainFrame.
     */
    @Test
    public void testMostrarCarta() {
        System.out.println("mostrarCarta");
        String carta = "";
        MainFrame instance = new MainFrame();
        instance.mostrarCarta(carta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSetupCard method, of class MainFrame.
     */
    @Test
    public void testGetSetupCard() {
        System.out.println("getSetupCard");
        MainFrame instance = new MainFrame();
        SetupCard expResult = null;
        SetupCard result = instance.getSetupCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGameCard method, of class MainFrame.
     */
    @Test
    public void testGetGameCard() {
        System.out.println("getGameCard");
        MainFrame instance = new MainFrame();
        GameCard expResult = null;
        GameCard result = instance.getGameCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResultCard method, of class MainFrame.
     */
    @Test
    public void testGetResultCard() {
        System.out.println("getResultCard");
        MainFrame instance = new MainFrame();
        ResultCard expResult = null;
        ResultCard result = instance.getResultCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayerPanel method, of class MainFrame.
     */
    @Test
    public void testGetPlayerPanel() {
        System.out.println("getPlayerPanel");
        MainFrame instance = new MainFrame();
        PlayerPanel expResult = null;
        PlayerPanel result = instance.getPlayerPanel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnemyPanel method, of class MainFrame.
     */
    @Test
    public void testGetEnemyPanel() {
        System.out.println("getEnemyPanel");
        MainFrame instance = new MainFrame();
        EnemyPanel expResult = null;
        EnemyPanel result = instance.getEnemyPanel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class MainFrame.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MainFrame.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
