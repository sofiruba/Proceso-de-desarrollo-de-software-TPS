package TP2.builder;

public class ej4 {
    public static void main(String[] args) {
        Examen examen = new Examen.Builder()
                .conTeoria(true)
                .conPractica(true)
                .tiempoLimite(120)
                .puntajeExtra(10)
                .build();
    }
}
