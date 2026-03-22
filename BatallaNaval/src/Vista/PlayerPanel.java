package Vista;

public class PlayerPanel extends javax.swing.JPanel {

    public PlayerPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        playerGridPanel = new Vista.GridPanel();

        setBackground(new java.awt.Color(7, 35, 60));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TU FLOTA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Handwriting", 0, 18), new java.awt.Color(93, 202, 165))); // NOI18N
        setForeground(new java.awt.Color(93, 202, 165));
        setPreferredSize(new java.awt.Dimension(450, 500));
        setLayout(new java.awt.BorderLayout());
        add(playerGridPanel, java.awt.BorderLayout.CENTER);

        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vista.GridPanel playerGridPanel;
    // End of variables declaration//GEN-END:variables
}
