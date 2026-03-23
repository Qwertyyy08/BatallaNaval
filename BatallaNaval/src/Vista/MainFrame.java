package Vista;

public class MainFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainFrame.class.getName());

    public MainFrame() { // Constructor
        initComponents();
    }
// -------METODOS PARA EL CONTROLLER -----------------------------------
    // El controller cambia entre las 3 cartas del topPanel
    public void mostrarCarta(String carta) {
        java.awt.CardLayout cl = (java.awt.CardLayout) topPanel.getLayout();
        cl.show(topPanel, carta);
    }

    // Getters de las cartas el controller accede a sus componentes
    public Vista.SetupCard getSetupCard() {
        return setupCard1;
    }

    public Vista.GameCard getGameCard() {
        return gameCard1;
    }

    public Vista.ResultCard getResultCard() {
        return resultCard1;
    }

    // Getters de los tableros el controller accede a los grids
    public Vista.PlayerPanel getPlayerPanel() {
        return playerPanel1;
    }

    public Vista.EnemyPanel getEnemyPanel() {
        return enemyPanel1;
    }
    @SuppressWarnings("unchecked") //Codigo generado por netbeans
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        setupCard1 = new Vista.SetupCard();
        gameCard1 = new Vista.GameCard();
        resultCard1 = new Vista.ResultCard();
        centerPanel = new javax.swing.JPanel();
        playerPanel1 = new Vista.PlayerPanel();
        enemyPanel1 = new Vista.EnemyPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Batalla Naval");
        setBackground(new java.awt.Color(7, 35, 60));
        setMaximumSize(new java.awt.Dimension(1000, 700));
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setName("MainFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setResizable(false);

        background.setBackground(new java.awt.Color(7, 35, 60));
        background.setMaximumSize(new java.awt.Dimension(1000, 700));
        background.setMinimumSize(new java.awt.Dimension(1000, 700));
        background.setPreferredSize(new java.awt.Dimension(1000, 700));

        topPanel.setBackground(new java.awt.Color(7, 35, 60));
        topPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        topPanel.setMaximumSize(new java.awt.Dimension(950, 100));
        topPanel.setMinimumSize(new java.awt.Dimension(950, 100));
        topPanel.setPreferredSize(new java.awt.Dimension(950, 100));
        topPanel.setLayout(new java.awt.CardLayout());
        topPanel.add(setupCard1, "card2");
        topPanel.add(gameCard1, "card3");
        topPanel.add(resultCard1, "card4");

        centerPanel.setBackground(new java.awt.Color(7, 35, 60));
        centerPanel.setMaximumSize(new java.awt.Dimension(950, 500));
        centerPanel.setMinimumSize(new java.awt.Dimension(950, 500));
        centerPanel.setPreferredSize(new java.awt.Dimension(950, 500));
        centerPanel.setLayout(new java.awt.GridLayout(1, 2, 50, 0));
        centerPanel.add(playerPanel1);
        centerPanel.add(enemyPanel1);

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(centerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(centerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            new Controlador.GameController(frame);
            frame.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel centerPanel;
    private Vista.EnemyPanel enemyPanel1;
    private Vista.GameCard gameCard1;
    private Vista.PlayerPanel playerPanel1;
    private Vista.ResultCard resultCard1;
    private Vista.SetupCard setupCard1;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
