/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Vista;

import java.awt.Color;
import javax.swing.ImageIcon;
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
public class GridPanelTest {
    
    public GridPanelTest() {
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
     * Test of setCelda method, of class GridPanel.
     */
    @Test
    public void testSetCelda() {
        System.out.println("setCelda");
        int row = 0;
        int col = 0;
        Color color = null;
        GridPanel instance = new GridPanel();
        instance.setCelda(row, col, color);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton method, of class GridPanel.
     */
    @Test
    public void testGetButton() {
        System.out.println("getButton");
        int row = 0;
        int col = 0;
        GridPanel instance = new GridPanel();
        JButton expResult = null;
        JButton result = instance.getButton(row, col);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButtons method, of class GridPanel.
     */
    @Test
    public void testGetButtons() {
        System.out.println("getButtons");
        GridPanel instance = new GridPanel();
        JButton[][] expResult = null;
        JButton[][] result = instance.getButtons();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reset method, of class GridPanel.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        GridPanel instance = new GridPanel();
        instance.reset();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEnabled method, of class GridPanel.
     */
    @Test
    public void testSetEnabled() {
        System.out.println("setEnabled");
        boolean enabled = false;
        GridPanel instance = new GridPanel();
        instance.setEnabled(enabled);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImagenCelda method, of class GridPanel.
     */
    @Test
    public void testSetImagenCelda() {
        System.out.println("setImagenCelda");
        int row = 0;
        int col = 0;
        ImageIcon icon = null;
        GridPanel instance = new GridPanel();
        instance.setImagenCelda(row, col, icon);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCeldaHundida method, of class GridPanel.
     */
    @Test
    public void testSetCeldaHundida() {
        System.out.println("setCeldaHundida");
        int row = 0;
        int col = 0;
        ImageIcon icon = null;
        GridPanel instance = new GridPanel();
        instance.setCeldaHundida(row, col, icon);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
