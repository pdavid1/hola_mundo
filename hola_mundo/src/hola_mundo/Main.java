package hola_mundo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) { 
        int[] array = new int[3];
        try {
            array[2] = 1;
            System.out.println("Todo ha salido bien");
        } catch (IllegalArgumentException e) {
            System.out.println("Ha habido un error con el array");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Has accedido a una posicion incorrecta del array");
        } finally {
            System.out.println("Este es el codigo final");
        }
        
   }
}
