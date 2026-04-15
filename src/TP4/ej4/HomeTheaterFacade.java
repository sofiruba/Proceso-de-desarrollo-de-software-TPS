package TP4.ej4;

// clases complejas
class Luces { void bajar(int nivel) { System.out.println("luces al " + nivel + "%"); } }
class Proyector { void encender() { System.out.println("proyector encendido"); } }
class Sonido { void setVolumen(int v) { System.out.println("volumen al " + v); } }

//  FACHADA
public class HomeTheaterFacade {
    // La fachada conoce a todos los subsistemas
    private Luces luces;
    private Proyector proyector;
    private Sonido sonido;

    public HomeTheaterFacade(Luces l, Proyector p, Sonido s) {
        this.luces = l;
        this.proyector = p;
        this.sonido = s;
    }

    public void comenzarPelicula() {
        System.out.println("preparando todo para la funcion...");
        luces.bajar(10);
        proyector.encender();
        sonido.setVolumen(50);
        System.out.println("disfrute su pelicula!");
    }
}