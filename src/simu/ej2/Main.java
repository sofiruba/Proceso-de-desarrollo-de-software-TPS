package simu.ej2;

public class Main {
    public static void main(String[] args) {
        // Tenemos el sensor viejo
        AudioExterno lib = new AudioExterno();
        Reproductor adaptador = new ReproductorAdapter(lib);
        adaptador.reproducir();
    }

}
