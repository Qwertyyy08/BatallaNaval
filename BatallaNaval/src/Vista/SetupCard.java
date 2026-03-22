package Vista;

public class SetupCard extends javax.swing.JPanel {

    public SetupCard() {
        initComponents();
    }
    
    // El controller lee el apodo del jugador
    public String getNickname() {
        return NicknameField.getText().trim();
    }

    // El controller sabe qué barco está seleccionado
    // Devuelve el número de celdas según la selección
    public int getShipSize() {
        return switch (ShipsComboBox.getSelectedIndex()) {
            case 0 -> 5;// Portaaviones
            case 1 -> 4;// Acorazado
            case 2 -> 3;// Crucero
            case 3 -> 3;// Submarino
            case 4 -> 2;// Destructor
            default -> 0;
        };
    }

    // El controller sabe si el barco está horizontal o vertical
    public boolean isHorizontal() {
        return horizontal;
    }

    // Variable de orientación
    private boolean horizontal = true;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        leftPanel = new javax.swing.JPanel();
        startButton = new javax.swing.JButton();
        NicknameLabel = new javax.swing.JLabel();
        NicknameField = new javax.swing.JTextField();
        ShipsLabel = new javax.swing.JLabel();
        ShipsComboBox = new javax.swing.JComboBox<>();
        rightPanel = new javax.swing.JPanel();
        Subtitle = new javax.swing.JLabel();
        previewLabel = new javax.swing.JLabel();
        rotarButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(7, 35, 60));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(950, 100));
        setMinimumSize(new java.awt.Dimension(950, 100));
        setPreferredSize(new java.awt.Dimension(950, 100));

        Title.setFont(new java.awt.Font("Lucida Handwriting", 0, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("BATALLA NAVAL");

        leftPanel.setBackground(new java.awt.Color(7, 35, 60));
        leftPanel.setMaximumSize(new java.awt.Dimension(659, 47));
        leftPanel.setMinimumSize(new java.awt.Dimension(659, 47));
        leftPanel.setPreferredSize(new java.awt.Dimension(659, 47));

        startButton.setBackground(new java.awt.Color(29, 158, 117));
        startButton.setFont(new java.awt.Font("Lucida Fax", 2, 14)); // NOI18N
        startButton.setForeground(new java.awt.Color(255, 255, 255));
        startButton.setText("Iniciar juego");
        startButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        startButton.setFocusPainted(false);
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        leftPanel.add(startButton);

        NicknameLabel.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        NicknameLabel.setForeground(new java.awt.Color(255, 255, 255));
        NicknameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NicknameLabel.setText("Tu apodo:");
        leftPanel.add(NicknameLabel);

        NicknameField.setBackground(new java.awt.Color(26, 46, 66));
        NicknameField.setColumns(15);
        NicknameField.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        NicknameField.setForeground(new java.awt.Color(255, 255, 255));
        NicknameField.setCaretColor(new java.awt.Color(255, 255, 255));
        leftPanel.add(NicknameField);

        ShipsLabel.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        ShipsLabel.setForeground(new java.awt.Color(255, 255, 255));
        ShipsLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ShipsLabel.setText("Barcos: ");
        ShipsLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        leftPanel.add(ShipsLabel);

        ShipsComboBox.setBackground(new java.awt.Color(26, 46, 66));
        ShipsComboBox.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        ShipsComboBox.setForeground(new java.awt.Color(255, 255, 255));
        ShipsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Portaaviones (5)", "Acorazado (4)", "Crucero (3)", "Submarino (3)", "Destructor (2)" }));
        leftPanel.add(ShipsComboBox);

        rightPanel.setBackground(new java.awt.Color(7, 35, 60));
        rightPanel.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N

        Subtitle.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        Subtitle.setForeground(new java.awt.Color(242, 242, 242));
        Subtitle.setText("Barco seleccionado:");
        rightPanel.add(Subtitle);

        previewLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(93, 202, 165), 1, true));
        previewLabel.setMaximumSize(new java.awt.Dimension(185, 37));
        previewLabel.setMinimumSize(new java.awt.Dimension(74, 37));
        previewLabel.setPreferredSize(new java.awt.Dimension(185, 37));
        rightPanel.add(previewLabel);

        rotarButton.setBackground(new java.awt.Color(26, 46, 66));
        rotarButton.setFont(new java.awt.Font("Lucida Fax", 2, 14)); // NOI18N
        rotarButton.setForeground(new java.awt.Color(255, 255, 255));
        rotarButton.setText("Rotar");
        rotarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rotarButton.setFocusPainted(false);
        rotarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotarButtonActionPerformed(evt);
            }
        });
        rightPanel.add(rotarButton);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(Title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startButtonActionPerformed

    private void rotarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rotarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NicknameField;
    private javax.swing.JLabel NicknameLabel;
    private javax.swing.JComboBox<String> ShipsComboBox;
    private javax.swing.JLabel ShipsLabel;
    private javax.swing.JLabel Subtitle;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JLabel previewLabel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JButton rotarButton;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables
}
