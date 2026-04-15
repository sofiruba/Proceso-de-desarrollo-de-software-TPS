package simu.ej2;

public class ReproductorAdapter implements Reproductor {
    private AudioExterno libreriaExterna;

    public ReproductorAdapter(AudioExterno audioExterno) {
        this.libreriaExterna = audioExterno;
    }

    @Override
    public void reproducir() {
        this.libreriaExterna.playAudioFile();
    }
}
