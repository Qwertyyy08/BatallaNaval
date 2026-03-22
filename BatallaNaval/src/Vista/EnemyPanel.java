package Vista;

public class EnemyPanel extends javax.swing.JPanel {

    public EnemyPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enemyGridPanel = new Vista.GridPanel();

        setBackground(new java.awt.Color(7, 35, 60));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FLOTA ENEMIGA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Handwriting", 0, 18), new java.awt.Color(226, 75, 74))); // NOI18N
        setForeground(new java.awt.Color(226, 75, 74));
        setToolTipText("Haz clic para disparar");
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        setPreferredSize(new java.awt.Dimension(450, 500));
        setLayout(new java.awt.BorderLayout());
        add(enemyGridPanel, java.awt.BorderLayout.CENTER);

        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vista.GridPanel enemyGridPanel;
    // End of variables declaration//GEN-END:variables
}
