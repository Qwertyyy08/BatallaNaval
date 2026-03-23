/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

import java.util.List;
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
public class BoardModelTest {
    
    public BoardModelTest() {
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
     * Test of colocarBarco method, of class BoardModel.
     */
    @Test
    public void testColocarBarco() {
        System.out.println("colocarBarco");
        ShipModel barco = null;
        BoardModel instance = new BoardModel();
        boolean expResult = false;
        boolean result = instance.colocarBarco(barco);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recibirDisparo method, of class BoardModel.
     */
    @Test
    public void testRecibirDisparo() {
        System.out.println("recibirDisparo");
        int fila = 0;
        int col = 0;
        BoardModel instance = new BoardModel();
        CellState expResult = null;
        CellState result = instance.recibirDisparo(fila, col);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of todosHundidos method, of class BoardModel.
     */
    @Test
    public void testTodosHundidos() {
        System.out.println("todosHundidos");
        BoardModel instance = new BoardModel();
        boolean expResult = false;
        boolean result = instance.todosHundidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class BoardModel.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        int fila = 0;
        int col = 0;
        BoardModel instance = new BoardModel();
        CellState expResult = null;
        CellState result = instance.getEstado(fila, col);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBarco method, of class BoardModel.
     */
    @Test
    public void testGetBarco() {
        System.out.println("getBarco");
        int fila = 0;
        int col = 0;
        BoardModel instance = new BoardModel();
        ShipModel expResult = null;
        ShipModel result = instance.getBarco(fila, col);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaBarcos method, of class BoardModel.
     */
    @Test
    public void testGetListaBarcos() {
        System.out.println("getListaBarcos");
        BoardModel instance = new BoardModel();
        List<ShipModel> expResult = null;
        List<ShipModel> result = instance.getListaBarcos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTamano method, of class BoardModel.
     */
    @Test
    public void testGetTamano() {
        System.out.println("getTamano");
        BoardModel instance = new BoardModel();
        int expResult = 0;
        int result = instance.getTamano();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reset method, of class BoardModel.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        BoardModel instance = new BoardModel();
        instance.reset();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
