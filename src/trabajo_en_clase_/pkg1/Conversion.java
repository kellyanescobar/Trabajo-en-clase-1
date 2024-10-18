package trabajo_en_clase_.pkg1;
import java.util.Scanner;

public class Conversion {

    public static void main(String[] args) {
        Scanner lea=new Scanner (System.in);
        
         System.out.println("Ingrese un grado Fahrenheit");
         double Valor=lea.nextDouble();
         
         double Celsius=(Valor-32)*5/9;
         
         System.out.println("La convercion es: "+Celsius);
        
    }
    
}
