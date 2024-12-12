package progra.pkg1;

public class ConstructorPersonas {

    public static void main(String[] args) {
        
        String[] nombres = {"ana", "maria", "elsa", "rosa", "rita", "lupe"};
        int[] edades = {17, 20, 69, 45, 35, 18};
        
        
        MetodosPersonas personas = new MetodosPersonas(nombres, edades);

        System.out.println("Original: ");
        personas.mostrar();

        personas.ordenarAlfabetico();
        System.out.println("\n Ordenado alfabeticamente: ");
        personas.mostrar();
        
        personas.ordenarEdades();
        System.out.println("\n Ordenado por edades: ");
        personas.mostrar();
    }
}
