package hola_mundo;

public class Calculadora {
    int x;
    int y;

/*     public Calculadora() {

    } */

    public Calculadora(int xConstructor, int yConstructor) {
        this.x = xConstructor;
        this.y = yConstructor;
    }

    int sumar(int x, int y) {
        int resultado = x + y;
        return resultado;
    }

    public int restar(int x, int y) {
        return x - y;
    }

    public int multiplicar(int x, int y) {
        return x * y;
    }

    public int dividir(int x, int y) {
        return x / y;
    }

}
