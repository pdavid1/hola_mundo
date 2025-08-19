package hola_mundo;

public class Almacen<TIPO_DATO> {
    TIPO_DATO dato;

    public TIPO_DATO getDato() {
        return dato;
    }

    public void setDato(TIPO_DATO dato) {
        this.dato = dato;
    }

}
