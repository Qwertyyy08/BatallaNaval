package Modelo;

public class HumanPlayer extends Player {

//Constructor
    public HumanPlayer(String nombre) {
        super(nombre);
    }

//Logica del disparo

    // El controller captura el clic del usuario en el tablero enemigo
    // y llama este metodo con las coordenadas obtenidas
    // Procesa el disparo en el tablero enemigo y retorna el resultado
    // HIT  = impacto un barco
    // MISS = solo agua
    // SUNK = barco hundido
    public CellState disparar(int fila, int col, BoardModel tableroEnemigo) {
        return tableroEnemigo.recibirDisparo(fila, col);
    }
}
