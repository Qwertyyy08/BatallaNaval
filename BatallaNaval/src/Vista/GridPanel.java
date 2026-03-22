package Vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;

public class GridPanel extends javax.swing.JPanel {
    private JButton[][] buttons = new JButton[10][10];
    private java.awt.Image imagenFondo;
    public GridPanel() { //Constructor!!
        initComponents();
        cargarFondo();
        String[] letras = {"","1","2","3","4","5","6","7","8","9","10"};
        String[] nums   = {"","A","B","C","D","E","F","G","H","I","J"};

        for (int r = 0; r < 11; r++) {
            for (int c = 0; c < 11; c++) {

                // Esquina [0][0] y etiquetas de fila/columna
                if (r == 0 || c == 0) {
                    JLabel lbl = new JLabel();
                    lbl.setOpaque(true);
                    lbl.setBackground(new Color(26,46,66));
                    lbl.setForeground(new Color(255, 255, 255));
                    lbl.setHorizontalAlignment(JLabel.CENTER);
                    lbl.setFont(new Font("Lucida Fax", Font.BOLD, 11));

                    if (r == 0) lbl.setText(letras[c]); // números arriba
                    if (c == 0) lbl.setText(nums[r]);   // letras izquierda

                    this.add(lbl);

                } else {
                    JButton btn = new JButton();
                    btn.setBackground(new Color(28, 96, 158));
                    btn.setBorderPainted(true);
                    btn.setFocusPainted(false);
                    btn.setOpaque(false);
    
                    // Guarda referencia — resta 1 porque fila/col 0 son etiquetas
                    buttons[r - 1][c - 1] = btn;
    
                    this.add(btn);
                }
            }
        }
        this.revalidate();
    }
    
    public void setCelda(int row, int col, Color color) {
        buttons[row][col].setBackground(color);
    }

    // El controller obtiene un botón específico para agregarle listener
    public JButton getButton(int row, int col) {
        return buttons[row][col];
    }

    // El controller obtiene todo el arreglo si necesita iterar
    public JButton[][] getButtons() {
        return buttons;
    }
    
    private void cargarFondo() { // Llama este método para cargar la imagen
        try {
            imagenFondo = new javax.swing.ImageIcon(
                getClass().getResource("/Vista/assets/ImagenTablero.png")
            ).getImage();
        } catch (Exception e) {
            imagenFondo = null; // si no encuentra la imagen usa color sólido
            System.out.println("No cargo fondo");
        }
    }
    
    @Override
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        if (imagenFondo != null) {
            g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(26, 46, 66));
        setLayout(new java.awt.GridLayout(11, 11));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
