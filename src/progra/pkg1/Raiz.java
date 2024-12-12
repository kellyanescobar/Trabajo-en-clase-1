package progra.pkg1;
import java.util.Scanner;

public class Raiz {

    public static void main(String[] args) {
        Scanner lea=new Scanner (System.in);
        
         System.out.println("Ingrese un grado Fahrenheit");
         double valor=lea.nextDouble();
         
         double Celsius=(valor-32)*5/9;
         
         System.out.println("La convercion es: "+Celsius);
        
    }
    
}
