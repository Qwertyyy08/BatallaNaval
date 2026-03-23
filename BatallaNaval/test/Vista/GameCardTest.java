/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Vista;

import java.awt.Color;
import javax.swing.JLabel;
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
public class GameCardTest {
    
    public GameCardTest() {
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
     * Test of setTurno method, of class GameCard.
     */
    @Test
    public void testSetTurno() {
        System.out.println("setTurno");
        String texto = "";
        Color color = null;
        GameCard instance = new GameCard();
        instance.setTurno(texto, color);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColorTurno method, of class GameCard.
     */
    @Test
    public void testSetColorTurno() {
        System.out.println("setColorTurno");
        Color color = null;
        GameCard instance = new GameCard();
        instance.setColorTurno(color);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMensaje method, of class GameCard.
     */
    @Test
    public void testSetMensaje() {
        System.out.println("setMensaje");
        String texto = "";
        GameCard instance = new GameCard();
        instance.setMensaje(texto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTurnoLabel method, of class GameCard.
     */
    @Test
    public void testGetTurnoLabel() {
        System.out.println("getTurnoLabel");
        GameCard instance = new GameCard();
        JLabel expResult = null;
        JLabel result = instance.getTurnoLabel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMensajeLabel method, of class GameCard.
     */
    @Test
    public void testGetMensajeLabel() {
        System.out.println("getMensajeLabel");
        GameCard instance = new GameCard();
        JLabel expResult = null;
        JLabel result = instance.getMensajeLabel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
