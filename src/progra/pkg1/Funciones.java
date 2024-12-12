package progra.pkg1;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Funciones {

    private static float saldo;

    public static void main(String[] args) {
    Scanner lea= new Scanner (System.in);
        
      int opcion;
        float deposito,saldoactual,retiro;
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Favor seleccione una opción:"+
                                                                "\n1. Deposito"+
                                                                "\n2. Retiro"+
                                                                "\n3. Salir"));
        
    switch (opcion){  
        case 1:
            deposito=Float.parseFloat(JOptionPane.showInputDialog("Favor ingresar el valor a depositar"));
            if(deposito>=1){
                saldoactual=deposito+saldo;
                JOptionPane.showMessageDialog(null,"Su saldo actual es: "+saldoactual);
            }
            else{
               JOptionPane.showMessageDialog(null,"No esta permitido ingresar valores negativos");  
            }

             break;   
             case 2:
             retiro=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad que va a retirar"));
             if (retiro>saldo){
                 JOptionPane.showInputDialog(null,"Saldo insuficiente");
             }
            else{
                 if(retiro>=1){
                     saldoactual=saldo-retiro;
                     JOptionPane.showMessageDialog(null, "Su saldo actual es: "+saldoactual);
                 }
                 else{
                     JOptionPane.showMessageDialog(null,"No esta permitido numeros negativos");
                 }
             }
             break;
             case 3:
             JOptionPane.showMessageDialog(null, "Va a salir"); 
             
             
    }
        
    }
    
}
