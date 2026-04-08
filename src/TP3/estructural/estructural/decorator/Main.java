package TP3.estructural.estructural.decorator;

public class Main {
    static void main() {
        BebidaComponent cafe = new CafeSolo();
        System.out.println(cafe.mostrarDescripcion() + " --> "+ cafe.mostrarPrecio());
        cafe = new Crema(cafe);
        System.out.println(cafe.mostrarDescripcion() + " --> "+ cafe.mostrarPrecio());
        cafe = new Azucar(cafe);
        System.out.println(cafe.mostrarDescripcion() + " --> "+ cafe.mostrarPrecio());
    }
}
