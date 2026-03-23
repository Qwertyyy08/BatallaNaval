package Modelo;

public class ShipModel {

//Atributos
    private String nombre;// Nombre del barco
    private int tamano;// Tamaño en celdas

    // Posición inicial en el tablero
    private int filaInicio;
    private int colInicio;

    // Orientación  true=horizontal, false=vertical
    private boolean horizontal;

    // Cuando hits == tamaño el barco está hundido
    private int hits;// Contador de impactos recibidos

//Constructor 
    public ShipModel(String nombre, int tamano,int filaInicio, int colInicio, boolean horizontal) {
        this.nombre     = nombre;
        this.tamano    = tamano;
        this.filaInicio = filaInicio;
        this.colInicio  = colInicio;
        this.horizontal = horizontal;
        this.hits       = 0; // inicia sin impactos
    }

// Logica

    // Registra un impacto en el barco
    public void recibirImpacto() {
        hits++;
    }

    // Verifica si el barco esta completamente hundido
    public boolean estaHundido() {
        return hits >= tamano;
    }

    // Devuelve todas las celdas que ocupa el barco
    // El BoardModel usa esto para marcar SUNK en todas las celdas
    public int[][] getCeldas() {
        int[][] celdas = new int[tamano][2];
        for (int i = 0; i < tamano; i++) {
            celdas[i][0] = horizontal ? filaInicio     : filaInicio + i;
            celdas[i][1] = horizontal ? colInicio + i  : colInicio;
        }
        return celdas;
    }

//Getters

    public String getNombre() {
        return nombre;
    }

    public int getTamano() {
        return tamano;
    }

    public int getFilaInicio() {
        return filaInicio;
    }

    public int getColInicio() {
        return colInicio;
    }

    public boolean isHorizontal() {
        return horizontal;
    }

    public int getHits() {
        return hits;
    }
}
