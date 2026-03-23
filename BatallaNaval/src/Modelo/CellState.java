package Modelo;

public enum CellState {
    EMPTY,  // agua sin disparar
    SHIP,   // ocupada por barco
    HIT,    // impacto
    MISS,   // fallo
    SUNK    // barco hundido completo
}
