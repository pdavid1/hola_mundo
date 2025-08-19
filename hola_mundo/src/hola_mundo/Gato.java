package hola_mundo;

public class Gato extends Animal {
    private String raza;

    public Gato(int edadConstructor, 
                String colorConstructor,
                String razaConstructor) {
        super(edadConstructor, colorConstructor, 4);
        raza = razaConstructor;
    }

    @Override
    public void hacerRuido() {
        System.out.println("Miauu");
    }

}
