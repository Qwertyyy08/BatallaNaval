/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
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
public class SetupCardTest {
    
    public SetupCardTest() {
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
     * Test of getNickname method, of class SetupCard.
     */
    @Test
    public void testGetNickname() {
        System.out.println("getNickname");
        SetupCard instance = new SetupCard();
        String expResult = "";
        String result = instance.getNickname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isHorizontal method, of class SetupCard.
     */
    @Test
    public void testIsHorizontal() {
        System.out.println("isHorizontal");
        SetupCard instance = new SetupCard();
        boolean expResult = false;
        boolean result = instance.isHorizontal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShipsComboBox method, of class SetupCard.
     */
    @Test
    public void testGetShipsComboBox() {
        System.out.println("getShipsComboBox");
        SetupCard instance = new SetupCard();
        JComboBox<String> expResult = null;
        JComboBox<String> result = instance.getShipsComboBox();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStartButton method, of class SetupCard.
     */
    @Test
    public void testGetStartButton() {
        System.out.println("getStartButton");
        SetupCard instance = new SetupCard();
        JButton expResult = null;
        JButton result = instance.getStartButton();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRotarButton method, of class SetupCard.
     */
    @Test
    public void testGetRotarButton() {
        System.out.println("getRotarButton");
        SetupCard instance = new SetupCard();
        JButton expResult = null;
        JButton result = instance.getRotarButton();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarPreview method, of class SetupCard.
     */
    @Test
    public void testActualizarPreview() {
        System.out.println("actualizarPreview");
        String rutaImagen = "";
        SetupCard instance = new SetupCard();
        instance.actualizarPreview(rutaImagen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rotar method, of class SetupCard.
     */
    @Test
    public void testRotar() {
        System.out.println("rotar");
        String rutaImagen = "";
        SetupCard instance = new SetupCard();
        instance.rotar(rutaImagen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
