package TP3.estructural.estructural.decorator;

public class Te extends BebidaComponent{

    @Override
    public String mostrarDescripcion() {
        return "Te";
    }

    @Override
    public Double mostrarPrecio() {
        return 8.5;
    }
}
