package progra.pkg1;
import java.util.Scanner;

public class Exponente {

    public static void main(String[] args) {
        Scanner lea= new Scanner (System.in);
        
        System.out.println("Ingrese un numero");
        int numero=lea.nextInt();
        int mult=numero*numero;
        
        System.out.println("El resultado es: "+mult);
    }
    
}
