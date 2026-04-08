package TP3.ej2.proxy;

public class VideoReal implements IVideo{
    @Override
    public void reproducir() {
        System.out.println("Reproduciendo Video");
    }
}
