package Modelo;

public class GameModel {
//Atributos

    // Los dos jugadores de la partida
    private HumanPlayer jugador;
    private AIPlayer maquina;

    private GameState estado;// Estado actual del juego

    // Turno actual true=jugador, false=máquina
    private boolean turnoJugador;

//Constructor
    public GameModel() {
        maquina = new AIPlayer();
        estado = GameState.SETUP; // inicia en fase de configuración
        turnoJugador = true;// el jugador siempre va primero
    }

//Logica

    // Inicia la partida con el nombre del jugador
    // El controller llama este metodo cuando el jugador presiona "Iniciar"
    public void iniciarPartida(String nombreJugador) {
        jugador = new HumanPlayer(nombreJugador);
        estado  = GameState.PLAYING;
    }
    
    // Procesa el disparo del jugador o la maquina en el tablero enemigo
    // Retorna el resultado: HIT, MISS o SUNK
    public CellState disparoJugador(int fila, int col) {
        CellState resultado = jugador.disparar(fila, col,maquina.getTablero());
        if (maquina.perdio())
            estado = GameState.FINISHED;
        else if (resultado == CellState.MISS)
            turnoJugador = false; // solo cambia turno si fallo

        // Si HIT o SUNK el jugador repite turno
        return resultado;
    }
    public CellState disparoMaquina() {
        CellState resultado = maquina.disparar(jugador.getTablero());

        if (jugador.perdio())
            estado = GameState.FINISHED;
        else if (resultado == CellState.MISS)
            turnoJugador = true; // solo cambia turno si falló

        // Si HIT o SUNK la maquina repite turno
        return resultado;
    }

    // Verifica si el juego termino
    public boolean juegoTerminado() {
        return estado == GameState.FINISHED;
    }

    // Verifica si el jugador gano
    public boolean jugadorGano() {
        return maquina.perdio();
    }

    // Resetea el juego completo
    public void reset() {
        maquina.reset();
        jugador  = null;
        estado   = GameState.SETUP;
        turnoJugador = true;
    }

//Getters

    public HumanPlayer getJugador() {
        return jugador;
    }

    public AIPlayer getMaquina() {
        return maquina;
    }

    public GameState getEstado() {
        return estado;
    }

    public boolean isTurnoJugador() {
        return turnoJugador;
    }
}
