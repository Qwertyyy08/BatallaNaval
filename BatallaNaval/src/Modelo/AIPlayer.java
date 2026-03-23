package Modelo;

public class AIPlayer extends Player {

//Atributos
    // Registro de celdas ya disparadas evita repetir disparos
    private boolean[][] yaDisparado;

    // Último impacto la IA dispara alrededor si hubo impacto previo
    private int ultimaFilaImpacto = -1;
    private int ultimaColImpacto  = -1;

    // Coordenadas del último disparo  el controller actualiza la vista
    private int[] ultimoDisparo = new int[]{-1, -1};

// Constructor
    public AIPlayer() {
        super("Maquina");
        // Tamaño viene del BoardModel 
        yaDisparado = new boolean[getTablero().getTamano()][getTablero().getTamano()];
    }

// Logica del disparo

    // Calcula y ejecuta el disparo en el tablero enemigo
    // Retorna el resultado: HIT, MISS o SUNK
    public CellState disparar(BoardModel tableroEnemigo) {
        int[] coordenadas = calcularCoordenadas(tableroEnemigo);
        int fila = coordenadas[0];
        int col  = coordenadas[1];

        // Guarda el disparo para que el controller actualice la vista
        ultimoDisparo = new int[]{fila, col};

        // Marca como disparada
        yaDisparado[fila][col] = true;

        // Procesa el disparo en el tablero enemigo
        CellState resultado = tableroEnemigo.recibirDisparo(fila, col);

        // Si fue impacto guarda posicion para el siguiente turno
        if (resultado == CellState.HIT) {
            ultimaFilaImpacto = fila;
            ultimaColImpacto  = col;
        }

        // Si hundio el barco resetea el último impacto
        if (resultado == CellState.SUNK) {
            ultimaFilaImpacto = -1;
            ultimaColImpacto  = -1;
        }

        return resultado;
    }

    // El controller llama este metodo despues del disparo
    // para saber que celda actualizar en la vista
    public int[] getUltimoDisparo() {
        return ultimoDisparo;
    }

//Logica interna

    // Calcula coordenadas del proximo disparo
    // Si hay impacto previo dispara alrededor, sino dispara aleatorio
    private int[] calcularCoordenadas(BoardModel tableroEnemigo) {
        int tamano = tableroEnemigo.getTamano();

        // Si hay impacto previo intenta disparar alrededor
        if (ultimaFilaImpacto != -1) {
            int[][] direcciones = {
                {-1, 0}, // arriba
                { 1, 0}, // abajo
                { 0,-1}, // izquierda
                { 0, 1}  // derecha
            };

            for (int[] dir : direcciones) {
                int r = ultimaFilaImpacto + dir[0];
                int c = ultimaColImpacto  + dir[1];

                if (r >= 0 && r < tamano && c >= 0 && c < tamano
                        && !yaDisparado[r][c]) {
                    return new int[]{r, c};
                }
            }
        }

        // Disparo aleatorio busca celda no disparada
        int fila, col;
        java.util.Random random = new java.util.Random();
        do {
            fila = random.nextInt(tamano);
            col  = random.nextInt(tamano);
        } while (yaDisparado[fila][col]);

        return new int[]{fila, col};
    }

    // Resetea la IA
    public void reset() {
        getTablero().reset();
        yaDisparado = new boolean[getTablero().getTamano()][getTablero().getTamano()];
        ultimaFilaImpacto = -1;
        ultimaColImpacto  = -1;
        ultimoDisparo     = new int[]{-1, -1};
    }
}