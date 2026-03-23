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
public class GameModelTest {
    
    public GameModelTest() {
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
     * Test of iniciarPartida method, of class GameModel.
     */
    @Test
    public void testIniciarPartida() {
        System.out.println("iniciarPartida");
        String nombreJugador = "";
        GameModel instance = new GameModel();
        instance.iniciarPartida(nombreJugador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of disparoJugador method, of class GameModel.
     */
    @Test
    public void testDisparoJugador() {
        System.out.println("disparoJugador");
        int fila = 0;
        int col = 0;
        GameModel instance = new GameModel();
        CellState expResult = null;
        CellState result = instance.disparoJugador(fila, col);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of disparoMaquina method, of class GameModel.
     */
    @Test
    public void testDisparoMaquina() {
        System.out.println("disparoMaquina");
        GameModel instance = new GameModel();
        CellState expResult = null;
        CellState result = instance.disparoMaquina();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of juegoTerminado method, of class GameModel.
     */
    @Test
    public void testJuegoTerminado() {
        System.out.println("juegoTerminado");
        GameModel instance = new GameModel();
        boolean expResult = false;
        boolean result = instance.juegoTerminado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of jugadorGano method, of class GameModel.
     */
    @Test
    public void testJugadorGano() {
        System.out.println("jugadorGano");
        GameModel instance = new GameModel();
        boolean expResult = false;
        boolean result = instance.jugadorGano();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reset method, of class GameModel.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        GameModel instance = new GameModel();
        instance.reset();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJugador method, of class GameModel.
     */
    @Test
    public void testGetJugador() {
        System.out.println("getJugador");
        GameModel instance = new GameModel();
        HumanPlayer expResult = null;
        HumanPlayer result = instance.getJugador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaquina method, of class GameModel.
     */
    @Test
    public void testGetMaquina() {
        System.out.println("getMaquina");
        GameModel instance = new GameModel();
        AIPlayer expResult = null;
        AIPlayer result = instance.getMaquina();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class GameModel.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        GameModel instance = new GameModel();
        GameState expResult = null;
        GameState result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isTurnoJugador method, of class GameModel.
     */
    @Test
    public void testIsTurnoJugador() {
        System.out.println("isTurnoJugador");
        GameModel instance = new GameModel();
        boolean expResult = false;
        boolean result = instance.isTurnoJugador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
