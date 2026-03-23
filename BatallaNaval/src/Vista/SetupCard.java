package Vista;

public class SetupCard extends javax.swing.JPanel {
    // Variable de orientación
    private boolean horizontal = true;
    
    // Rutas de imágenes — índice igual al ComboBox
    private static final String[] SHIP_IMAGES = {
        "/Vista/assets/ship5.png",   // Portaaviones (5)
        "/Vista/assets/ship4.png",   // Acorazado (4)
        "/Vista/assets/Ship3a.png",  // Crucero (3)
        "/Vista/assets/ship3b.png",  // Submarino (3)
        "/Vista/assets/ship2.png"    // Destructor (2)
    };
    
    public SetupCard() {//constructor
        initComponents();
    }
    // -------METODOS PARA EL CONTROLLER -----------------------------------
    
    // El controller lee el apodo del jugador
    public String getNickname() {
        return NicknameField.getText().trim();
    }

    // El controller sabe si el barco está horizontal o vertical
    public boolean isHorizontal() {
        return horizontal;
    }
    
    // El controller obtiene el ComboBox para agregarle listener
    public javax.swing.JComboBox<String> getShipsComboBox() {
        return ShipsComboBox;
    }

    // El controller obtiene el botón iniciar para agregarle listener
    public javax.swing.JButton getStartButton() {
        return startButton;
    }

    // El controller obtiene el botón rotar para agregarle listener
    public javax.swing.JButton getRotarButton() {
        return rotarButton;
    }

    // Actualiza el previewLabel con la imagen del barco seleccionado
    // El controller llama este método cuando cambia el ComboBox o se rota
    public void actualizarPreview(String rutaImagen) {
        javax.swing.ImageIcon icon = new javax.swing.ImageIcon(
            getClass().getResource(rutaImagen)
        );

        java.awt.image.BufferedImage original =
            new java.awt.image.BufferedImage(
                icon.getIconWidth(), icon.getIconHeight(),
                java.awt.image.BufferedImage.TYPE_INT_ARGB);
        java.awt.Graphics2D g2 = original.createGraphics();
        icon.paintIcon(null, g2, 0, 0);
        g2.dispose();

        java.awt.image.BufferedImage resultado;

        if (!horizontal) {
            // Rota 90 grados
            java.awt.image.BufferedImage rotada =
                new java.awt.image.BufferedImage(
                    original.getHeight(), original.getWidth(),
                    java.awt.image.BufferedImage.TYPE_INT_ARGB);
            g2 = rotada.createGraphics();
            g2.translate(original.getHeight(), 0);
            g2.rotate(Math.PI / 2);
            g2.drawImage(original, 0, 0, null);
            g2.dispose();
            resultado = rotada;
        } else {
            resultado = original;
        }

        // Altura máxima disponible en el topPanel
        int maxH = 60;
        int maxW = 185;

        // Calcula escala manteniendo proporción
        double scaleW = (double) maxW / resultado.getWidth();
        double scaleH = (double) maxH / resultado.getHeight();
        double scale  = Math.min(scaleW, scaleH); // usa la más restrictiva

        int newW = (int)(resultado.getWidth()  * scale);
        int newH = (int)(resultado.getHeight() * scale);

        java.awt.Image escalada = resultado.getScaledInstance(
            newW, newH, java.awt.Image.SCALE_SMOOTH);

        previewLabel.setIcon(new javax.swing.ImageIcon(escalada));
        previewLabel.setPreferredSize(new java.awt.Dimension(newW, newH));
        previewLabel.revalidate();
        previewLabel.repaint();
    }

    // El controller llama este método cuando el jugador presiona Rotar
    public void rotar(String rutaImagen) {
        horizontal = !horizontal;
        actualizarPreview(rutaImagen);
    }
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
        previewLabel = new javax.swing.JLabel();
        rotarButton = new javax.swing.JButton();
        Subtitle = new javax.swing.JLabel();

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
        ShipsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Portaaviones", "Acorazado", "Crucero", "Submarino", "Destructor" }));
        leftPanel.add(ShipsComboBox);

        rightPanel.setBackground(new java.awt.Color(7, 35, 60));
        rightPanel.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        rightPanel.setMaximumSize(new java.awt.Dimension(400, 47));

        previewLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(93, 202, 165), 1, true));
        previewLabel.setMaximumSize(new java.awt.Dimension(185, 37));
        previewLabel.setMinimumSize(new java.awt.Dimension(185, 37));
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

        Subtitle.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        Subtitle.setForeground(new java.awt.Color(242, 242, 242));
        Subtitle.setText("Barco seleccionado:");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(Subtitle)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Subtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        // Esto se quita luego
    }//GEN-LAST:event_startButtonActionPerformed

    private void rotarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotarButtonActionPerformed
        // Esto se quita luego
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
