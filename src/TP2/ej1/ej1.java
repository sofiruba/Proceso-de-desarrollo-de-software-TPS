package TP2.ej1;

public class ej1 {
    public static void main(String[] args) {
        ConfiguracionRed c1 = ConfiguracionRed.getInstance();
        ConfiguracionRed c2 = ConfiguracionRed.getInstance();
        c1.setServidor("localhost");
        c1.setPuerto(8800);

        System.out.println(c2.getServidor());
        System.out.println(c1 == c2);
    }
}
