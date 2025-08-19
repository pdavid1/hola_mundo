package hola_mundo;

public abstract class Animal {
    int edad;
    String color;
    int numeroPatas;

    public Animal(int edadConstructor, 
                  String colorConstructor, 
                  int numeroPatasConstructor) {
        edad = edadConstructor;
        color = colorConstructor;
        numeroPatas = numeroPatasConstructor;
    }
        
    public abstract void hacerRuido();
    public void saltar() {
        System.out.println("El animal salta");
    }

}
