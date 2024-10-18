package trabajo_en_clase_.pkg1;
import java.util.Scanner;
public class Partidos {

    public static void main(String[] args) {
        Scanner lea=new Scanner (System.in);
        
        System.out.println("Ingrese el numero de partidos ganados: ");
        int Ganados=lea.nextInt();
        System.out.println("Ingrese el numero de partidos empatados: ");
        int Empatados=lea.nextInt();
        System.out.println("Ingrese el numero de partidos perdidos: ");
        int Perdidos=lea.nextInt();
        int PuntajeTotal=(Ganados*3)+(Empatados*1)+(Perdidos*0);

        System.out.println("El puntaje total del equipo es: "+PuntajeTotal);

        
    }
    
}
