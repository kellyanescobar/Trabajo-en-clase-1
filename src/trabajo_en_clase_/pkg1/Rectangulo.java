package trabajo_en_clase_.pkg1;
import java.util.Scanner;

public class Rectangulo {

    public static void main(String[] args) {
         Scanner lea =new Scanner(System.in);
        
        System.out.println("Ingrese la base del rectangulo ");
        int Base=lea.nextInt();
        
        System.out.println("Ingrese la altura del rectangulo");
        int Altura=lea.nextInt();
        
        int Area=Base*Altura;
        int Perimetro=2*(Base+Altura);
                 
        System.out.println("El area es: "+Area+
                           "\n El perimetro es: "+Perimetro);
        
    }
    
}
