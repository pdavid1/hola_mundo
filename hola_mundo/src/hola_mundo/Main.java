package hola_mundo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) { 
        int[] array = new int[3];
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(20);
        lista.add(40);
        lista.add(943);
        lista.add(32);
        System.out.println(lista);
        lista.remove(0);
        System.out.println(lista);
   }
}
