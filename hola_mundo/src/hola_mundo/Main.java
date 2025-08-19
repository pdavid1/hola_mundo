package hola_mundo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) { 
        int posicion = 3;
        int[] array = new int[3];
        try {
            if (posicion > array.length - 1) {
                throw new PosicionIncorrectaException();
            }
            array[posicion] = 3;
            System.out.println("Todo ha salido bien");
        } catch (PosicionIncorrectaException e) {
            System.out.println("Ha habido un error con el array");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Has accedido a una posicion incorrecta del array");
        } finally {
            System.out.println("Este es el codigo final");
        }
        
   }
}
