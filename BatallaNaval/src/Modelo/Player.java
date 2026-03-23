package Modelo;

public abstract class Player {

//Atributos
    private String nombre;// Nombre del jugador
    private BoardModel tablero; // Tablero propio

//Constructor
    public Player(String nombre) {
        this.nombre  = nombre;
        this.tablero = new BoardModel();
    }

//Logica comun
    // Verifica si el jugador perdio todos sus barcos hundidos
    public boolean perdio() {
        return tablero.todosHundidos();
    }
    
    // Coloca un barco en el tablero del jugador
    public boolean colocarBarco(ShipModel barco) { //Funciona mas como verificador
        return tablero.colocarBarco(barco);// Retorna false si la posición no es válida
    }

//Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BoardModel getTablero() {
        return tablero;
    }
}