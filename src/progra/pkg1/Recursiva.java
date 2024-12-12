package progra.pkg1;

public class Recursiva {

    public static int funcion(int a){
        if(a>=10){
            return 10;
        }
        System.out.println(a);
        return funcion(a+1);
    }
    public static void main(String[] args) {
        System.out.println(funcion(0));
    }
}
