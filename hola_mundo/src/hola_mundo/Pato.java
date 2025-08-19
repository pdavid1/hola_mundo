package hola_mundo;

public class Pato extends Animal implements Ave{

    public Pato(int edadConstructor, 
                String colorConstructor) {
        super(edadConstructor, colorConstructor, 2);
        
    }

    @Override
    public void hacerRuido() {
        System.out.println("Cuac Cuac");
    }

    @Override
    public void volar() {
        System.out.println("El pato vuela");
    }
}
