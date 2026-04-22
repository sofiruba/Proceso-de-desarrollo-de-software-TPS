package TP4.facade;

public class Main {
    public static void main(String[] args) {

        Luces luces = new Luces();
        Proyector proyector = new Proyector();
        Sonido sonido = new Sonido();

        HomeTheaterFacade cineEnCasa = new HomeTheaterFacade(luces, proyector, sonido);

        cineEnCasa.comenzarPelicula();
    }
}