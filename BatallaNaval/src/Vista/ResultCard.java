package Vista;

public class ResultCard extends javax.swing.JPanel {

    public ResultCard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        result = new javax.swing.JLabel();
        PlayAgainButton = new javax.swing.JButton();
        LeaveButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(7, 35, 60));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(950, 100));
        setMinimumSize(new java.awt.Dimension(950, 100));
        setPreferredSize(new java.awt.Dimension(950, 100));

        result.setFont(new java.awt.Font("Lucida Handwriting", 0, 24)); // NOI18N
        result.setForeground(new java.awt.Color(29, 158, 117));
        result.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        result.setText("Resultado");

        PlayAgainButton.setBackground(new java.awt.Color(29, 158, 117));
        PlayAgainButton.setFont(new java.awt.Font("Lucida Fax", 2, 14)); // NOI18N
        PlayAgainButton.setForeground(new java.awt.Color(255, 255, 255));
        PlayAgainButton.setText("Jugar de nuevo");
        PlayAgainButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PlayAgainButton.setFocusPainted(false);
        PlayAgainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayAgainButtonActionPerformed(evt);
            }
        });

        LeaveButton.setBackground(new java.awt.Color(26, 46, 66));
        LeaveButton.setFont(new java.awt.Font("Lucida Fax", 2, 14)); // NOI18N
        LeaveButton.setForeground(new java.awt.Color(255, 255, 255));
        LeaveButton.setText("Salir");
        LeaveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LeaveButton.setFocusPainted(false);
        LeaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeaveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PlayAgainButton)
                        .addGap(36, 36, 36)
                        .addComponent(LeaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(344, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addComponent(result)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LeaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PlayAgainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PlayAgainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayAgainButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlayAgainButtonActionPerformed

    private void LeaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeaveButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LeaveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LeaveButton;
    private javax.swing.JButton PlayAgainButton;
    private javax.swing.JLabel result;
    // End of variables declaration//GEN-END:variables
}
