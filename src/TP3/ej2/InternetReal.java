package TP3.ej2;
public class InternetReal implements IInternet {
    @Override
    public void conectarA(String url) {
        System.out.println("Conectando a" + url);
    }
}
