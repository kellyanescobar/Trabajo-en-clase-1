package progra.pkg1;
import java.util.Scanner;

public class Entradas {
//Problema 3 Calcular el perímetro y área de un rectángulo dada su base y su altura
    public static void main(String[] args) {
        Scanner lea =new Scanner(System.in);
        
        System.out.println("Ingrese la base del rectangulo ");
        int base=lea.nextInt();
        
        System.out.println("Ingrese la altura del rectangulo");
        int altura=lea.nextInt();
        
        int area=base*altura;
        int perimetro=2*(base+altura);
                 
        System.out.println("El area es: "+area+
                           "\n El perimetro es: "+perimetro);
        
        
        
    }
    
}
