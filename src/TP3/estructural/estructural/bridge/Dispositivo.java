package TP3.estructural.estructural.bridge;

public interface Dispositivo {
    boolean estaEncendido();
    void encender();
    void apagar();
    int getVolumen();
    void setVolumen(int volumen);
    int getCanal();
    void setCanal(int canal);


}
