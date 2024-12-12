package progra.pkg1;
import javax.swing.JOptionPane;

public class ConvertirAlCubo {
    
    public static void main(String[] args) {
              int numero, cubo;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Favor ingresar un numero"));
        
        while (numero >= 0) {
            cubo = (int) Math.pow(numero, 3);
            JOptionPane.showMessageDialog(null, "El numero: " + numero + " al cubo es: " + cubo);
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Favor ingresar otro numero (o un numero negativo para salir)"));
        }
        
        JOptionPane.showMessageDialog(null, "Programa finalizado.");

    }
    
}
