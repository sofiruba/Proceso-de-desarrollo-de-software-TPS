package TP3.estructural.estructural.bridge;

public class ControlRemotoAvanzado extends ControlRemoto{
    public ControlRemotoAvanzado(Dispositivo dispositivo) {
        super(dispositivo);
    }

    public void silenciar() {
        dispositivo.setVolumen(0);
        System.out.println("Dispositivo silenciado");
    }

}
