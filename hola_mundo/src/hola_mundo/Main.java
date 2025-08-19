package hola_mundo;

public class Main {

    public static void main(String[] args) { 
        
        Object objeto = new Gato();

        if(objeto instanceof Pato){
            Pato pato = (Pato)objeto;
            pato.hacerRuido();
        }

        if (objeto instanceof Gato) {
            System.out.println("Es un gato");
        }
   }
}
