package hola_mundo;

public class Main {

    public static void main(String[] args) { 
        Almacen <String>almacen= new Almacen();
        almacen.setDato("Hola");

        String dato = almacen.getDato();
   }
}
