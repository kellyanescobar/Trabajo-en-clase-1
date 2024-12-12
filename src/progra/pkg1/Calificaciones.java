package progra.pkg1;
import java.util.Scanner;

public class Calificaciones {

    
    public static void main(String[] args) {
        Scanner lea=new Scanner (System.in);
        float nota1, nota2, nota3,promedio,examen,trabajo,promediofinal;
        
        System.out.println("Digite sus 3 calificaciones:");
        nota1=lea.nextFloat();
        nota2=lea.nextFloat();
        nota3=lea.nextFloat();
      
        promedio=(nota1+nota2+nota3)/3;
        
        System.out.println("La la nota del examen final");
        examen=lea.nextFloat();
        System.out.println("Ingrese la nota del trabajo final");
        trabajo=lea.nextFloat();
        
        promediofinal=(promedio*55)+(examen*30)+(trabajo*15);
        System.out.println("La nota final es:"+promediofinal);
        
    }
    
}


