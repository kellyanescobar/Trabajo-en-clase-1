package progra.pkg1;
import java.util.Scanner;

public class Operaciones {
public static void suma(){
        Scanner lea=new Scanner (System.in);
        int n1,n2;
        System.out.println("Favor ingrese numero 1: ");
        n1=lea.nextInt();
        System.out.println("Favor ingrese numero 2: ");
        n2=lea.nextInt();
        System.out.println("La suma de los numeros es: "+(n1+n2));
}
  private static void resta() {
        Scanner lea=new Scanner (System.in);
        int n1, n2;
        System.out.println("Favor ingrese numero 1: ");
        n1=lea.nextInt();
        System.out.println("Favor ingrese numero 2: ");
        n2=lea.nextInt();
      System.out.println("La resta de los numeros es: "+(n1-n2));
  }
    private static void multiplicacion() {
        Scanner lea=new Scanner (System.in);
        int n1, n2;
        System.out.println("Favor ingrese numero 1: ");
        n1=lea.nextInt();
        System.out.println("Favor ingrese numero 2: ");
        n2=lea.nextInt();
      System.out.println("La multiplicacion de los numeros es: "+(n1*n2));
  }
    public static Double division() {
        Scanner xd = new Scanner(System.in);
        System.out.println("Ingres el numero uno: ");
        double numero1 = xd.nextInt();
        System.out.println("Ingrese el numero dos: ");
        double numero2 = xd.nextInt();
        return numero1 / numero2;

    }
  
    public static void main(String[] args) {
        Scanner lea=new Scanner (System.in);
        int op;
        System.out.println("Menu: ");
        System.out.println("1. Suma ");
        System.out.println("2. Resta ");
        System.out.println("3. Multiplicacion");
        System.out.println("0. Salir ");
        op=lea.nextInt();
        
        do{
            switch(op){
                case 1:
                    suma();
                    break;
                case 2:
                    resta();
                    break;
                case 3:
                    multiplicacion();
                    break;
                case 4:
                    division();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcion invalida ");
                    
            }
            
        }while  (op!=0);
   
    }
        
}
