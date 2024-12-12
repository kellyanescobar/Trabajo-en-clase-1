package progra.pkg1;

public class Herencia {

    public static void ordenar(){
    for(int x=0; x<3; x++){
        for (int y=1;y<10;y++){
            if(toyota[y-1].getYear()>toyota[y].getYear()){
                CarroHerencia temp = toyota[y-1];
                toyota[y]=toyota[y-1];
                toyota[y-1]=temp;
            }
        }
    }
}
    public static void presentar() {
    for (int i = 0; i < toyota.length; i++) {
        System.out.println(toyota[i].getMarca() + " - " + toyota[i].getYear());
    }
}
            
    public static CarroHerencia toyota[]=new CarroHerencia[3];
    public static void main(String[] args) {
        
        toyota[0]=new CarroHerencia();
        toyota[0].setMarca("Yaris");
        toyota[0].setYear(2018);
        toyota[0].setbaul(2);
        
        toyota[1]=new TurismoHerencia();
        toyota[1].setMarca("Corolla");
        toyota[0].setYear(2018);
        toyota[0].setbaul(2);
        
        toyota[2]=new TurismoHerencia();
        toyota[2].setMarca("Tercel");
        toyota[2].setYear(2008);
        toyota[2].setbaul(2);
        
    }
    
}
