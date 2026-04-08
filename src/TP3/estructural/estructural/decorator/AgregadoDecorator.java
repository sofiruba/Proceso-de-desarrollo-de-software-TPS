package TP3.estructural.estructural.decorator;

public abstract  class AgregadoDecorator extends BebidaComponent{
    BebidaComponent bebida;
    public AgregadoDecorator(BebidaComponent bebida) {
        this.bebida = bebida;
    }

}
