package TP2.builder;

public class Examen {

    private boolean teoria;
    private boolean practica;
    private int tiempoLimite;
    private int puntajeExtra;

    private Examen(Builder builder) {
        this.teoria = builder.teoria;
        this.practica = builder.practica;
        this.tiempoLimite = builder.tiempoLimite;
        this.puntajeExtra = builder.puntajeExtra;
    }

    public static class Builder {

        private boolean teoria;
        private boolean practica;
        private int tiempoLimite;
        private int puntajeExtra;

        public Builder conTeoria(boolean t) {
            this.teoria = t;
            return this;
        }

        public Builder conPractica(boolean p) {
            this.practica = p;
            return this;
        }

        public Builder tiempoLimite(int tiempo) {
            this.tiempoLimite = tiempo;
            return this;
        }

        public Builder puntajeExtra(int extra) {
            this.puntajeExtra = extra;
            return this;
        }

        public Examen build() {
            return new Examen(this);
        }
    }
}