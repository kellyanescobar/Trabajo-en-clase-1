package trabajo_en_clase_.pkg1;
import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        Scanner lea=new Scanner (System.in);
        double Nota1, Nota2, Nota3,Promedio,Examen,Trabajo,PromedioFinal;
        
        System.out.println("Digite sus 3 calificaciones:");
        Nota1=lea.nextDouble();
        Nota2=lea.nextDouble();
        Nota3=lea.nextDouble();
      
        Promedio=(Nota1+Nota2+Nota3)/3;
        
        System.out.println("Ingrese la nota del examen final");
        Examen=lea.nextDouble();
        System.out.println("Ingrese la nota del trabajo final");
        Trabajo=lea.nextDouble();
        
        PromedioFinal=(Promedio*0.55)+(Examen*0.30)+(Trabajo*0.15);
        System.out.println("La nota final es:"+PromedioFinal);
        
    }
    
}
