package progra.pkg1;
import javax.swing.JOptionPane;

public class PositivoNegativo {

    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Favor ingresar un numero"));
        
        if (numero >= 0) {
            JOptionPane.showMessageDialog(null, "El numero " + numero + " es positivo.");
        } else {
            JOptionPane.showMessageDialog(null, "El numero " + numero + " es negativo.");
        }
        
        JOptionPane.showMessageDialog(null, "Programa finalizado.");

    }
    
}
