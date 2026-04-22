package TP4.bridge;

abstract class Dispositivo {
    protected FormatoVideo formato; // LA CLAVE: Referencia a la interfaz

    public Dispositivo(FormatoVideo f) {
        this.formato = f;
    }
    public void setFormato(FormatoVideo nuevoFormato) {
        this.formato = nuevoFormato;
    }

    abstract void reproducir();
}