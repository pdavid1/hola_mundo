package hola_mundo;

public class Persona {
    private int edad;
    private String nombre;

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public void dameInformacion(){
        System.out.println("La edad de la persona es: ");
        System.out.println(this.getEdad());
        System.out.println("El nombre de la persona es: ");
        System.out.println(this.getNombre());
    }

    public int getEdad() {
        return this.edad;
    }

    public String getNombre() {
        return this.nombre;
    }
}
