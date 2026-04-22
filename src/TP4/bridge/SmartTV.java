package TP4.bridge;


class SmartTV extends Dispositivo {
    public SmartTV(FormatoVideo f) { super(f); }

    public void reproducir() {
        System.out.print("en smart tv: ");
        formato.procesar();
    }
}