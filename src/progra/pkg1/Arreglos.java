package progra.pkg1;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Arreglos {

    public static void main(String[] args) {
       Scanner lea=new Scanner(System.in);
        
       int entrada;
       entrada=Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese una cantidad de entradas"));
        char[] letras=new char[entrada];
        
        System.out.println("Ingrese los caracteres ");
        for(int i=0; i<entrada; i++){
        System.out.println((i+1)+" Favor ingresar el caracter: ");
        letras[i]=lea.next().charAt(0);
    }
        System.out.println("Los caracteres son \n");
        
       for(int i=0; i<entrada; i++){
        System.out.println(letras[i]);
       }
       
    }
    
}
