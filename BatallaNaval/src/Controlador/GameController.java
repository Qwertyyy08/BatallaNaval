package Controlador;

import Modelo.*;
import Vista.*;
import javax.swing.*;
import java.awt.*;

public class GameController {
//Atributos
    private java.util.LinkedHashMap<String, Integer> barcosDisponibles;
    private java.util.HashMap<String, String> imagenesBarcos;
    private boolean enSetup = true;
    private GameModel modelo;
    private MainFrame vista;
    
//Constructor
    public GameController(MainFrame vista) {
        this.modelo = new GameModel();
        this.vista  = vista;
        inicializarBarcos();
        inicializarImagenes();
        configurarInicio();
        configurarColocacionBarcos();
    }

// Configura el estado inicial de la vista
    private void configurarInicio() {
        modelo.iniciarPartida("temp");//Nombre temporal
        vista.getSetupCard().getStartButton().setEnabled(false);// startButton desactivado
                String primerBarco = (String) vista.getSetupCard()
            .getShipsComboBox().getItemAt(0);
        vista.getSetupCard().actualizarPreview(imagenesBarcos.get(primerBarco));// Muestra el preview del primer barco
        vista.getSetupCard().getShipsComboBox().addActionListener(e -> {
            String nombre = (String) vista.getSetupCard()
                .getShipsComboBox().getSelectedItem();
            if (nombre != null) {
                String ruta = imagenesBarcos.get(nombre);
                vista.getSetupCard().actualizarPreview(ruta);
            }
        });// Listener del ComboBox
        vista.getSetupCard().getRotarButton().addActionListener(e -> {
            String nombre = (String) vista.getSetupCard()
                .getShipsComboBox().getSelectedItem();
            if (nombre != null) {
                vista.getSetupCard().rotar(imagenesBarcos.get(nombre));
            }
        });// Listener del boton rotar
        vista.getSetupCard().getStartButton().addActionListener(e ->iniciarJuego());// Listener del startButton
        vista.getResultCard().getPlayAgainButton().addActionListener(e ->reiniciarJuego());// Listener del PlayAgainButton
        vista.getResultCard().getLeaveButton().addActionListener(e ->System.exit(0));// Listener del LeaveButton
    }
    private void inicializarBarcos() {
        barcosDisponibles = new java.util.LinkedHashMap<>();
        barcosDisponibles.put("Portaaviones", 5);
        barcosDisponibles.put("Acorazado",    4);
        barcosDisponibles.put("Crucero",      3);
        barcosDisponibles.put("Submarino",    3);
        barcosDisponibles.put("Destructor",   2);
    }
    private void inicializarImagenes() {
        imagenesBarcos = new java.util.HashMap<>();
        imagenesBarcos.put("Portaaviones", "/Vista/assets/ship5.png");
        imagenesBarcos.put("Acorazado",    "/Vista/assets/ship4.png");
        imagenesBarcos.put("Crucero",      "/Vista/assets/Ship3a.png");
        imagenesBarcos.put("Submarino",    "/Vista/assets/ship3b.png");
        imagenesBarcos.put("Destructor",   "/Vista/assets/ship2.png");
    }
    
    private void configurarColocacionBarcos() {
        GridPanel grid = vista.getPlayerPanel().getGridPanel();

        for (int r = 0; r < 10; r++) {
            for (int c = 0; c < 10; c++) {
                final int fila = r;
                final int col  = c;

                grid.getButton(r, c).addMouseListener(
                    new java.awt.event.MouseAdapter() {
                        @Override
                        public void mouseEntered(java.awt.event.MouseEvent e) {
                            mostrarPreviewBarco(fila, col);
                        }
                        @Override
                        public void mouseExited(java.awt.event.MouseEvent e) {
                            limpiarPreviewBarco();
                        }
                    });

                grid.getButton(r, c).addActionListener(e ->
                    colocarBarcoJugador(fila, col)
                );
            }
        }
    }

    private void mostrarPreviewBarco(int fila, int col) {
        if (!enSetup) return; //no mostrar preview durante la partida
        SetupCard setup = vista.getSetupCard();
        if (setup.getShipsComboBox().getItemCount() == 0) return;

        String nombre  = (String) setup.getShipsComboBox().getSelectedItem();
        if (nombre == null) return;
        int tamano     = barcosDisponibles.get(nombre);
        boolean horiz  = setup.isHorizontal();
        GridPanel grid = vista.getPlayerPanel().getGridPanel();

        limpiarPreviewBarco();

        boolean valido = esColocacionValida(fila, col, tamano, horiz);
        Color color = valido
            ? new Color(93, 202, 165)
            : new Color(226, 75, 74);

        for (int i = 0; i < tamano; i++) {
            int r = horiz ? fila    : fila + i;
            int c = horiz ? col + i : col;
            if (r >= 0 && r < 10 && c >= 0 && c < 10)
                // Solo pinta celdas sin barco — las ocupadas no se tocan
                if (grid.getButton(r, c).getIcon() == null)
                    grid.setCelda(r, c, color);
        }
    }

    private void limpiarPreviewBarco() {
        if (!enSetup) return; // ← no limpiar durante la partida
        GridPanel grid = vista.getPlayerPanel().getGridPanel();
        for (int r = 0; r < 10; r++)
            for (int c = 0; c < 10; c++)
                if (grid.getButton(r, c).getIcon() == null)
                    grid.setCelda(r, c, new Color(28, 96, 158));
    }

    private boolean esColocacionValida(int fila, int col,
                                        int tamano, boolean horiz) {
        GridPanel grid = vista.getPlayerPanel().getGridPanel();
        for (int i = 0; i < tamano; i++) {
            int r = horiz ? fila    : fila + i;
            int c = horiz ? col + i : col;
            if (r < 0 || r >= 10 || c < 0 || c >= 10) return false;
            if (grid.getButton(r, c).getIcon() != null) return false;
        }
        return true;
    }

    private void colocarBarcoJugador(int fila, int col) {
        SetupCard setup = vista.getSetupCard();
        if (setup.getShipsComboBox().getItemCount() == 0) return;

        int index      = setup.getShipsComboBox().getSelectedIndex();
        // Obtiene el nombre seleccionado del ComboBox
        String nombreSeleccionado = (String) vista.getSetupCard()
            .getShipsComboBox().getSelectedItem();

        // Obtiene el tamaño directamente del mapa
        int tamano = barcosDisponibles.get(nombreSeleccionado);
        String nombre = nombreSeleccionado;
        boolean horiz  = setup.isHorizontal();

        if (!esColocacionValida(fila, col, tamano, horiz)) return;

        // Coloca en el modelo
        ShipModel barco = new ShipModel(nombre, tamano, fila, col, horiz);
        if (modelo.getJugador() != null) {
            modelo.getJugador().getTablero().colocarBarco(barco);
        }

        // Muestra imagen en el tablero
        mostrarBarcoEnTablero(fila, col, tamano, horiz, nombreSeleccionado);

        // Elimina del ComboBox
        setup.getShipsComboBox().removeItemAt(index);

        // Si todos colocados activa startButton
        if (setup.getShipsComboBox().getItemCount() == 0) {
            setup.getStartButton().setEnabled(true);
            vista.getPlayerPanel().getGridPanel().setEnabled(false);
        }
    }

    private void mostrarBarcoEnTablero(int fila, int col,int tamano, boolean horiz, String nombre) {
        GridPanel grid = vista.getPlayerPanel().getGridPanel();
        java.awt.image.BufferedImage imgCompleta = cargarImagen(nombre, horiz);
        if (imgCompleta == null) return;

        int anchoParte = imgCompleta.getWidth()  / (horiz ? tamano : 1);
        int altoParte  = imgCompleta.getHeight() / (horiz ? 1 : tamano);

        for (int i = 0; i < tamano; i++) {
            final int r = horiz ? fila    : fila + i;
            final int c = horiz ? col + i : col;
            final int x = horiz ? i * anchoParte : 0;
            final int y = horiz ? 0 : i * altoParte;
            final java.awt.image.BufferedImage parte =
                imgCompleta.getSubimage(x, y, anchoParte, altoParte);

            SwingUtilities.invokeLater(() -> {
                java.awt.Image escalada = parte.getScaledInstance(
                    grid.getButton(r, c).getWidth(),
                    grid.getButton(r, c).getHeight(),
                    java.awt.Image.SCALE_SMOOTH);
                grid.setImagenCelda(r, c, new ImageIcon(escalada));
            });
        }
    }

    private java.awt.image.BufferedImage cargarImagen(String nombre, boolean horiz) {
        try {
            ImageIcon icon = new ImageIcon(
            getClass().getResource(imagenesBarcos.get(nombre)));

            java.awt.image.BufferedImage original =
                new java.awt.image.BufferedImage(
                    icon.getIconWidth(), icon.getIconHeight(),
                    java.awt.image.BufferedImage.TYPE_INT_ARGB);
            java.awt.Graphics2D g2 = original.createGraphics();
            icon.paintIcon(null, g2, 0, 0);
            g2.dispose();

            if (!horiz) {
                java.awt.image.BufferedImage rotada =
                    new java.awt.image.BufferedImage(
                        original.getHeight(), original.getWidth(),
                        java.awt.image.BufferedImage.TYPE_INT_ARGB);
                g2 = rotada.createGraphics();
                g2.translate(original.getHeight(), 0);
                g2.rotate(Math.PI / 2);
                g2.drawImage(original, 0, 0, null);
                g2.dispose();
                return rotada;
            }
            return original;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    private void iniciarJuego() {
        String nombre = vista.getSetupCard().getNickname();

        // Valida que el jugador haya ingresado un nombre
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(vista,
                "Por favor ingresa tu apodo",
                "Nombre requerido",
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        enSetup = false; // inicio el juego
        // Actualiza el nombre del jugador en el modelo
        modelo.getJugador().setNombre(nombre);
        // Bloquea el tablero del jugador permanentemente durante la partida
        vista.getPlayerPanel().getGridPanel().setEnabled(false);
        // Coloca los barcos de la IA
        colocarBarcosIA();

        // Configura listeners del tablero enemigo
        configurarTableroEnemigo();

        // Actualiza turnoLabel y cambia a gameCard
        actualizarTurnoLabel();
        vista.mostrarCarta("card3");
    }

    private void colocarBarcosIA() {
        java.util.Random random = new java.util.Random();
        BoardModel tableroIA    = modelo.getMaquina().getTablero();

        for (java.util.Map.Entry<String, Integer> entry :
                barcosDisponibles.entrySet()) {
            boolean colocado = false;
            while (!colocado) {
                int fila      = random.nextInt(10);
                int col       = random.nextInt(10);
                boolean horiz = random.nextBoolean();
                ShipModel barco = new ShipModel(
                    entry.getKey(), entry.getValue(), fila, col, horiz);
                colocado = tableroIA.colocarBarco(barco);
                if (colocado) { //Logs en consola posicion de barcos enemigos
                    System.out.println("IA coloco " + entry.getKey() 
                        + " en [" + (char)('A' + fila) + "][" + (col + 1) + "]"
                        + " - " + (horiz ? "horizontal" : "vertical"));
                }
            }
        }
    }
    private void configurarTableroEnemigo() {
        GridPanel grid = vista.getEnemyPanel().getGridPanel();
        for (int r = 0; r < 10; r++) {
            for (int c = 0; c < 10; c++) {
                final int fila = r;
                final int col  = c;
                grid.getButton(r, c).addActionListener(e ->
                    procesarDisparoJugador(fila, col)
                );
            }
        }
    }

    private void actualizarTurnoLabel() {
        if (modelo.isTurnoJugador()) {
            vista.getGameCard().setTurno(
                "Tu turno, " + modelo.getJugador().getNombre(),
                new Color(93, 202, 165)  // verde
            );
        } else {
            vista.getGameCard().setTurno(
                "Turno de la máquina...",
                new Color(226, 75, 74)   // rojo
            );
        }
    }

    private void procesarDisparoJugador(int fila, int col) {
        // Ignora si ya fue disparada
        CellState estadoActual = modelo.getMaquina()
            .getTablero().getEstado(fila, col);
        if (estadoActual == CellState.HIT  ||
            estadoActual == CellState.MISS ||
            estadoActual == CellState.SUNK) return;

        CellState resultado = modelo.disparoJugador(fila, col);
        actualizarCeldaEnemigo(fila, col, resultado);
        mostrarMensajeDisparo(resultado, fila, col, true);

        if (modelo.juegoTerminado()) {
            mostrarResultado();
            return;
        }

        if (resultado == CellState.MISS) {
            // Bloquea tablero enemigo mientras la maquina juega
            vista.getEnemyPanel().getGridPanel().setEnabled(false);
            actualizarTurnoLabel();
            turnoMaquina();
        } else {
            vista.getEnemyPanel().setEnabled(true);
        }
    }

    private void turnoMaquina() {
        SwingWorker<CellState, Void> worker = new SwingWorker<>() {
            @Override
            protected CellState doInBackground() throws Exception {
                Thread.sleep(1000);
                return modelo.disparoMaquina();
            }

            @Override
            protected void done() {
                try {
                    CellState resultado = get();
                    int[] coords = modelo.getMaquina().getUltimoDisparo();

                    actualizarCeldaJugador(coords[0], coords[1], resultado);
                    mostrarMensajeDisparo(resultado, coords[0], coords[1], false);

                    if (modelo.juegoTerminado()) {
                        mostrarResultado();
                        return;
                    }

                    if (resultado == CellState.MISS) {
                        actualizarTurnoLabel();
                        vista.getEnemyPanel().getGridPanel().setEnabled(true);
                    } else {
                        turnoMaquina(); // repite turno
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        };
        worker.execute();
    }

    private void actualizarCeldaEnemigo(int fila, int col, CellState resultado) {
        GridPanel grid = vista.getEnemyPanel().getGridPanel();
        switch (resultado) {
            case HIT  -> grid.setCelda(fila, col, new Color(226, 75, 74));
            case MISS -> grid.setCelda(fila, col, new Color(180, 210, 240));
            case SUNK -> marcarBarcoHundido(fila, col, true);
        }
    }

    private void actualizarCeldaJugador(int fila, int col, CellState resultado) {
        GridPanel grid = vista.getPlayerPanel().getGridPanel();
        switch (resultado) {
            case HIT  -> grid.setCelda(fila, col, new Color(226, 75, 74));
            case MISS -> grid.setCelda(fila, col, new Color(180, 210, 240));
            case SUNK -> marcarBarcoHundido(fila, col, false);
        }
    }

    private void marcarBarcoHundido(int fila, int col, boolean esEnemigo) {
        BoardModel tablero = esEnemigo
            ? modelo.getMaquina().getTablero()
            : modelo.getJugador().getTablero();
        GridPanel grid = esEnemigo
            ? vista.getEnemyPanel().getGridPanel()
            : vista.getPlayerPanel().getGridPanel();

        ShipModel barco = tablero.getBarco(fila, col);
        if (barco == null) return;
        // Si es enemigo muestra la imagen del barco hundido
        if (esEnemigo) {
            mostrarBarcoHundidoEnemigo(barco, grid);
        } else {
            // En el tablero del jugador solo pinta gris
            for (int[] celda : barco.getCeldas())
                grid.setCelda(celda[0], celda[1], new Color(68, 68, 65));
        }
    }

    private void mostrarBarcoHundidoEnemigo(ShipModel barco, GridPanel grid) {
        String nombre  = barco.getNombre();
        boolean horiz  = barco.isHorizontal();
        int tamano     = barco.getTamano();
        int filaInicio = barco.getFilaInicio();
        int colInicio  = barco.getColInicio();

        // Carga la imagen del barco
        java.awt.image.BufferedImage imgCompleta = cargarImagen(nombre, horiz);
        if (imgCompleta == null) {
            // Si no carga la imagen pinta gris
            for (int[] celda : barco.getCeldas())
                grid.setCelda(celda[0], celda[1], new Color(68, 68, 65));
            return;
        }

        int anchoParte = imgCompleta.getWidth()  / (horiz ? tamano : 1);
        int altoParte  = imgCompleta.getHeight() / (horiz ? 1 : tamano);

        for (int i = 0; i < tamano; i++) {
            final int r = horiz ? filaInicio    : filaInicio + i;
            final int c = horiz ? colInicio + i : colInicio;
            final int x = horiz ? i * anchoParte : 0;
            final int y = horiz ? 0 : i * altoParte;
            final java.awt.image.BufferedImage parte =
                imgCompleta.getSubimage(x, y, anchoParte, altoParte);

            SwingUtilities.invokeLater(() -> {
                java.awt.Image escalada = parte.getScaledInstance(
                    grid.getButton(r, c).getWidth(),
                    grid.getButton(r, c).getHeight(),
                    java.awt.Image.SCALE_SMOOTH);
                grid.setCeldaHundida(r, c, new ImageIcon(escalada));
            });
        }
    }

    private void mostrarMensajeDisparo(CellState resultado,
                                        int fila, int col,
                                        boolean esJugador) {
        BoardModel tablero = esJugador
            ? modelo.getMaquina().getTablero()
            : modelo.getJugador().getTablero();

        String quien = esJugador ? "Disparaste" : "La máquina disparó";
        String celda = (char)('A' + fila) + String.valueOf(col + 1);

        String mensaje = switch (resultado) {
            case HIT  -> quien + " - Impacto en " + celda + "! ("
                         + tablero.getBarco(fila, col).getNombre() + ")";
            case MISS -> quien + " - Agua en " + celda;
            case SUNK -> quien + " - ¡Hundiste el "
                         + tablero.getBarco(fila, col).getNombre() + "!";
            default   -> "";
        };

        vista.getGameCard().setMensaje(mensaje);
    }

    private void mostrarResultado() {
        boolean jugadorGano = modelo.jugadorGano();
        String nombre       = modelo.getJugador().getNombre();
        String texto        = jugadorGano
            ? "¡Victoria, " + nombre + "!"
            : "¡Derrota, "  + nombre + "!";
        vista.getResultCard().setResultado(texto, jugadorGano);
        vista.mostrarCarta("card4");
    }
    
        private void reiniciarJuego() {
        // Resetea el modelo
        modelo.reset();
        modelo.iniciarPartida("temp");

        // Resetea tableros visualmente
        vista.getPlayerPanel().getGridPanel().reset();
        vista.getEnemyPanel().getGridPanel().reset();

        // Reactiva tablero del jugador para colocar barcos
        vista.getPlayerPanel().getGridPanel().setEnabled(true);

        // Limpia labels
        vista.getGameCard().setMensaje("");
        vista.getGameCard().setTurno("Tu turno", new Color(93, 202, 165));

        // Restaura el ComboBox con todos los barcos
        SetupCard setup = vista.getSetupCard();
        setup.getShipsComboBox().removeAllItems();
        for (String nombre : barcosDisponibles.keySet())
            setup.getShipsComboBox().addItem(nombre);

        // Desactiva startButton
        setup.getStartButton().setEnabled(false);

        // Reactiva el setup
        enSetup = true;

        // Preview del primer barco
        String primerBarco = (String) setup.getShipsComboBox().getItemAt(0);
        setup.actualizarPreview(imagenesBarcos.get(primerBarco));

        vista.mostrarCarta("card2");
    }
}

