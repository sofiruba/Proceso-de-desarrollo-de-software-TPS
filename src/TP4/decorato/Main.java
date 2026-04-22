package TP4.decorato;

public class Main {
    public static void main(String[] args) {
        Hamburguesa hamburguesa = new HamburguesaBase();

        hamburguesa = new Queso(hamburguesa);
        hamburguesa = new Bacon(hamburguesa);
        hamburguesa = new Huevo(hamburguesa);

        System.out.println("Descripción: " + hamburguesa.getDescripcion());
        System.out.println("Precio final: $" + hamburguesa.getPrecio());
    }
}
