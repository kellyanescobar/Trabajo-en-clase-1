package progra.pkg1;
import java.util.Scanner;
import java.util.Random;

public class NumerosAleatorios {
    
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        Random random=new Random();
        
        int numeros[] = new int[10];
        int menor;
         
        
        for (int num = 0; num < 10; num++) {
            numeros[num] = random.nextInt(51); 
        }
        
        menor = numeros[0];
        
        System.out.println("Numeros aleatorios generados:");
        for (int num = 0; num < 10; num++) {
            System.out.print(numeros[num] + " ");
            
            if (numeros[num] < menor) {
                menor = numeros[num];
            }
        }
        
        System.out.println("\nEl numero menor es: " + menor);
    }
}
