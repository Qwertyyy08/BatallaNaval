package Vista;

public class GameCard extends javax.swing.JPanel {

    public GameCard() { //Constructor
        initComponents();
    }
// -------METODOS PARA EL CONTROLLER -----------------------------------
    // Actualiza el texto del turno
    public void setTurno(String texto,java.awt.Color color) {
        turnoLabel.setText(texto);
        turnoLabel.setForeground(color);
    }

    // Cambia el color del turnoLabel
    public void setColorTurno(java.awt.Color color) {
        turnoLabel.setForeground(color);
    }

    // Actualiza el mensaje del ultimo disparo
    public void setMensaje(String texto) {
        mensajeLabel.setText(texto);
    }

    // El controller obtiene los labels si necesita acceso directo
    public javax.swing.JLabel getTurnoLabel() {
        return turnoLabel;
    }

    public javax.swing.JLabel getMensajeLabel() {
        return mensajeLabel;
    }
    @SuppressWarnings("unchecked") //Codigo generado por netbeans
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        turnoLabel = new javax.swing.JLabel();
        mensajeLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(7, 35, 60));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(950, 100));
        setMinimumSize(new java.awt.Dimension(950, 100));
        setPreferredSize(new java.awt.Dimension(950, 100));

        turnoLabel.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        turnoLabel.setForeground(new java.awt.Color(255, 255, 255));
        turnoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        turnoLabel.setText("Tu turno");
        turnoLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        mensajeLabel.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        mensajeLabel.setForeground(new java.awt.Color(180, 178, 169));
        mensajeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensajeLabel.setText("Texto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(turnoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(mensajeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(314, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(turnoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mensajeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        turnoLabel.getAccessibleContext().setAccessibleParent(turnoLabel);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel mensajeLabel;
    private javax.swing.JLabel turnoLabel;
    // End of variables declaration//GEN-END:variables
}
