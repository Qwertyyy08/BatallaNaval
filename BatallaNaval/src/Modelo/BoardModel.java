package Modelo;

public class BoardModel {

//Atributos
    private CellState[][] estados; // Matriz de estados indica que hay en cada celda

    // Matriz de barcos referencia al barco que ocupa cada celda
    private ShipModel[][] barcos; // null si la celda está vacía

    // Lista de barcos colocados en este tablero
    private java.util.List<ShipModel> listaBarcos;

    private static final int TAMANO = 10; // Tamaño del tablero

//Constructor
    public BoardModel() {
        estados     = new CellState[TAMANO][TAMANO];
        barcos      = new ShipModel[TAMANO][TAMANO];
        listaBarcos = new java.util.ArrayList<>();

        // Inicializa todas las celdas como vacias
        for (int r = 0; r < TAMANO; r++)
            for (int c = 0; c < TAMANO; c++)
                estados[r][c] = CellState.EMPTY;
    }

//Logica

    // Coloca un barco en el tablero
    // Retorna false si el barco no cabe o se superpone con otro
    public boolean colocarBarco(ShipModel barco) {
        int[][] celdas = barco.getCeldas();

        // Verifica que todas las celdas estén libres y dentro del tablero
        for (int[] celda : celdas) {
            int r = celda[0];
            int c = celda[1];
            if (r < 0 || r >= TAMANO || c < 0 || c >= TAMANO)
                return false; // fuera del tablero
            if (estados[r][c] != CellState.EMPTY)
                return false; // celda ocupada
        }

        // Coloca el barco en todas sus celdas
        for (int[] celda : celdas) {
            int r = celda[0];
            int c = celda[1];
            estados[r][c] = CellState.SHIP;
            barcos[r][c]  = barco; // guarda referencia al barco
        }

        listaBarcos.add(barco);
        return true;
    }

    // Procesa un disparo en la celda [fila][col]
    // Retorna el CellState resultante: HIT, MISS o SUNK
    public CellState recibirDisparo(int fila, int col) {

        // Si ya fue disparada antes no hace nada
        if (estados[fila][col] == CellState.HIT  ||
            estados[fila][col] == CellState.MISS  ||
            estados[fila][col] == CellState.SUNK)
            return estados[fila][col];

        if (estados[fila][col] == CellState.SHIP) {
            // Impacto registra el hit en el barco
            ShipModel barco = barcos[fila][col];
            barco.recibirImpacto();
            estados[fila][col] = CellState.HIT;

            // Si el barco quedo hundido marca todas sus celdas como SUNK
            if (barco.estaHundido()) {
                for (int[] celda : barco.getCeldas())
                    estados[celda[0]][celda[1]] = CellState.SUNK;
                return CellState.SUNK;
            }
            return CellState.HIT;
        }

        // Fallo solo agua
        estados[fila][col] = CellState.MISS;
        return CellState.MISS;
    }

    // Verifica si todos los barcos estan hundidos
    public boolean todosHundidos() {
        for (ShipModel barco : listaBarcos)
            if (!barco.estaHundido())
                return false;
        return true;
    }

//Getters

    // El controller consulta el estado de una celda
    public CellState getEstado(int fila, int col) {
        return estados[fila][col];
    }

    // El controller consulta que barco hay en una celda
    public ShipModel getBarco(int fila, int col) {
        return barcos[fila][col];
    }

    // El controller obtiene la lista completa de barcos
    public java.util.List<ShipModel> getListaBarcos() {
        return listaBarcos;
    }
    
    // Retorna el tamaño del tablero
    public int getTamano() {
        return TAMANO;
    }

    // Resetea el tablero
    public void reset() {
        listaBarcos.clear();
        for (int r = 0; r < TAMANO; r++)
            for (int c = 0; c < TAMANO; c++) {
                estados[r][c] = CellState.EMPTY;
                barcos[r][c]  = null;
            }
    }
}
