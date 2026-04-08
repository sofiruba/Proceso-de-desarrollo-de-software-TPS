package TP3.estructural.estructural.decorator;

public class Crema extends AgregadoDecorator {

    public Crema(BebidaComponent bebida) {
        super(bebida);
    }

    @Override
    public Double mostrarPrecio() {
        return bebida.mostrarPrecio() + 2;
    }

    @Override
    public String mostrarDescripcion()
    {
        return bebida.mostrarDescripcion() +  " + Crema " ;
    }
}
