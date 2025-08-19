package hola_mundo;

public class Main {

    public static void main(String[] args) { 
        
        DiaDeLaSemana diaDeLaSemana = DiaDeLaSemana.LUNES;

        switch (diaDeLaSemana) {
            case DiaDeLaSemana.LUNES:
                System.out.println("Lunes");
                break;
            case DiaDeLaSemana.MARTES:
                System.out.println("Martes");
                break;
            case DiaDeLaSemana.MIERCOLES:
                System.out.println("Miercoles");
                break;
            case DiaDeLaSemana.JUEVES:
                System.out.println("Jueves");
                break;
            case DiaDeLaSemana.VIERNES:
                System.out.println("Viernes");
                break;
            case DiaDeLaSemana.SABADO:
                System.out.println("Sabado");
                break;
            case DiaDeLaSemana.DOMINGO:
                System.out.println("Domingo");
                break;
        }

    }
}
