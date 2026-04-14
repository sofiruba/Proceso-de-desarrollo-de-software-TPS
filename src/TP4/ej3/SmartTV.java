package TP4.ej3;


class SmartTV extends Dispositivo {
    public SmartTV(FormatoVideo f) { super(f); }

    public void reproducir() {
        System.out.print("en smart tv: ");
        formato.procesar();
    }
}