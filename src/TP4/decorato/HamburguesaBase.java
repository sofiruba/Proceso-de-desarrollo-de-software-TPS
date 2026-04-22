package TP4.decorato;

class HamburguesaBase implements Hamburguesa {
    @Override
    public String getDescripcion() {
        return "Hamburguesa base (pan y carne)";
    }

    @Override
    public double getPrecio() {
        return 2000.0;
    }
}