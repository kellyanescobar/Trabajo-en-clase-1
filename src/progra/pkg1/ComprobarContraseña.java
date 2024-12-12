package progra.pkg1;
import java.util.Scanner;

public class ComprobarContraseña {

    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        
        String Correcto="1234";
        String Clave;
        int Intentos=0;
        int Cintentos=4;
        
        do{
            System.out.println("Favor ingrese una clase: ");
            Clave=lea.nextLine();
            Intentos++;
      
            if(!Correcto.equals(Clave)){
                System.out.println("Clave incorrecta, has utilizado: "+Intentos+" intentos"+" de: "+Cintentos);
            }
        }while(!Correcto.equals(Clave)&& (Intentos<Cintentos));
        
        if(Correcto.equals(Clave)){
            System.out.println("clave Correcta, puedes ingresar");
            
        }else{
            System.out.println("No tienes mas intentos");
        }
        
    }
    
}
