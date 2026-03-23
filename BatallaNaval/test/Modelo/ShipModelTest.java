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
public class ShipModelTest {
    
    public ShipModelTest() {
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
     * Test of recibirImpacto method, of class ShipModel.
     */
    @Test
    public void testRecibirImpacto() {
        System.out.println("recibirImpacto");
        ShipModel instance = null;
        instance.recibirImpacto();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estaHundido method, of class ShipModel.
     */
    @Test
    public void testEstaHundido() {
        System.out.println("estaHundido");
        ShipModel instance = null;
        boolean expResult = false;
        boolean result = instance.estaHundido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCeldas method, of class ShipModel.
     */
    @Test
    public void testGetCeldas() {
        System.out.println("getCeldas");
        ShipModel instance = null;
        int[][] expResult = null;
        int[][] result = instance.getCeldas();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class ShipModel.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        ShipModel instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTamano method, of class ShipModel.
     */
    @Test
    public void testGetTamano() {
        System.out.println("getTamano");
        ShipModel instance = null;
        int expResult = 0;
        int result = instance.getTamano();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilaInicio method, of class ShipModel.
     */
    @Test
    public void testGetFilaInicio() {
        System.out.println("getFilaInicio");
        ShipModel instance = null;
        int expResult = 0;
        int result = instance.getFilaInicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColInicio method, of class ShipModel.
     */
    @Test
    public void testGetColInicio() {
        System.out.println("getColInicio");
        ShipModel instance = null;
        int expResult = 0;
        int result = instance.getColInicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isHorizontal method, of class ShipModel.
     */
    @Test
    public void testIsHorizontal() {
        System.out.println("isHorizontal");
        ShipModel instance = null;
        boolean expResult = false;
        boolean result = instance.isHorizontal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHits method, of class ShipModel.
     */
    @Test
    public void testGetHits() {
        System.out.println("getHits");
        ShipModel instance = null;
        int expResult = 0;
        int result = instance.getHits();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
