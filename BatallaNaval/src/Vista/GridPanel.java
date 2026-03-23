package Vista;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;

public class GridPanel extends javax.swing.JPanel {
    private JButton[][] buttons = new JButton[10][10];  // El controller accede con buttons[fila][columna]
    
    public GridPanel() { //Constructor
        initComponents();
        String[] letras = {"","1","2","3","4","5","6","7","8","9","10"};// Etiquetas de columnas
        String[] nums   = {"","A","B","C","D","E","F","G","H","I","J"};// Etiquetas de filas

        for (int r = 0; r < 11; r++) { //Crear cuadicula 11x11
            for (int c = 0; c < 11; c++) {

                // Esquina [0][0] y etiquetas de fila/columna
                if (r == 0 || c == 0) {
                    JLabel lbl = new JLabel(); //Poner Labels
                    lbl.setOpaque(true);
                    lbl.setBackground(new Color(26,46,66));
                    lbl.setForeground(new Color(255, 255, 255));
                    lbl.setHorizontalAlignment(JLabel.CENTER);
                    lbl.setFont(new Font("Lucida Fax", Font.BOLD, 11));

                    if (r == 0) lbl.setText(letras[c]); // numeros arriba
                    if (c == 0) lbl.setText(nums[r]);   // letras izquierda

                    this.add(lbl);

                } else { //Si no son filas 0 columnas 0 rellena con botones 
                    JButton btn = new JButton();
                    btn.setBackground(new Color(28, 96, 158));
                    btn.setBorderPainted(true);
                    btn.setFocusPainted(false);
                    btn.setOpaque(true);
    
                    // Guarda referencia  resta 1 porque fila/col 0 son etiquetas
                    buttons[r - 1][c - 1] = btn;
    
                    this.add(btn);
                }
            }
        }
        this.revalidate();
    }
// -------METODOS PARA EL CONTROLLER -----------------------------------
    //cambiar el color de la celda
    public void setCelda(int row, int col, Color color) {
        buttons[row][col].setBackground(color);
    }

    // Obtiene un botón específico para agregarle ActionListener
    public JButton getButton(int row, int col) {
        return buttons[row][col];
    }

    // Obtiene toda la matriz para iterar en el setup
    public JButton[][] getButtons() {
        return buttons;
    }

    // Resetea todos los botones al color azul mar original
    public void reset() {//Se usa para el boton de volver a jugar
        for (int r = 0; r < 10; r++){
            for (int c = 0; c < 10; c++){
                buttons[r][c].setBackground(new Color(28, 96, 158));
                buttons[r][c].setIcon(null); // limpia imagen si había
                buttons[r][c].setEnabled(true);     // reactiva el botón
            }
        }
    }
    
    //Inabilitar los botones
    public void setEnabled(boolean enabled) {
        for (int r = 0; r < 10; r++) //recorre los botoes para dejar inabilitars 
            for (int c = 0; c < 10; c++)
                getButton(r, c).setEnabled(enabled);
    }
    
    // Muestra imagen del barco en una celda
    public void setImagenCelda(int row, int col, javax.swing.ImageIcon icon) {
        buttons[row][col].setIcon(icon);
        buttons[row][col].setHorizontalAlignment(javax.swing.JButton.CENTER);
    }
    //Muestra barcos hundios
    public void setCeldaHundida(int row, int col, javax.swing.ImageIcon icon) {
        buttons[row][col].setIcon(icon);
        buttons[row][col].setBackground(new Color(68, 68, 65));
    }

    @SuppressWarnings("unchecked")//Codigo generado por netbeans
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(26, 46, 66));
        setLayout(new java.awt.GridLayout(11, 11));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
