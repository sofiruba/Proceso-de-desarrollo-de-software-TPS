package TP3.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements IInternet {
    private InternetReal internet = new InternetReal();
    private static List<String> sitiosProhibidos;

    static {
        sitiosProhibidos = new ArrayList<>();
        sitiosProhibidos.add("www.facebook.com");
        sitiosProhibidos.add("www.youtube.com");
        sitiosProhibidos.add("www.twitter.com");
    }

    @Override
    public void conectarA(String url) {
        if (sitiosProhibidos.contains(url)) {
            System.out.println("Acceso denegado: sitio prohibido");
        } else {
            internet.conectarA(url);
        }
    }
}


