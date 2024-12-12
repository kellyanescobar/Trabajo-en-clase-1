package progra.pkg1;


public class MetodosPersonas {
   
    String[] nombres;
    int[] edades;

    public MetodosPersonas(String[] nombres, int[] edades) {
        this.nombres = nombres;
        this.edades = edades;
    }
       
       public void mostrar() {   
        System.out.println("Nombres y Edades:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + " - " + edades[i] + " años");
        }
    }

    public void ordenarAlfabetico() {
        for (int i = 0; i < nombres.length - 1; i++) {
            for (int j = i + 1; j < nombres.length; j++) {
                if (nombres[i].compareTo(nombres[j]) > 0) {
                    String tempNombre = nombres[i];
                    nombres[i] = nombres[j];
                    nombres[j] = tempNombre;
                    int tempEdad = edades[i];
                    edades[i] = edades[j];
                    edades[j] = tempEdad;
                }
            }
        }
    }
    
    public void ordenarEdades() {
        for (int i = 0; i < edades.length - 1; i++) {
            for (int j = i + 1; j < edades.length; j++) {
                if (edades[i] > edades[j]) {
                    int tempEdad = edades[i];
                    edades[i] = edades[j];
                    edades[j] = tempEdad;
                    String tempNombre = nombres[i];
                    nombres[i] = nombres[j];
                    nombres[j] = tempNombre;
                }
            }
        }
    }
}

