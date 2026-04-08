package TP2.ej5;
class Equipamiento implements Prototipo<Equipamiento> {
    String armaPrincipal;

    public Equipamiento(String armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }

    @Override
    public Equipamiento clonar() {
        // Al ser un String (inmutable), no hay riesgo al copiar la referencia
        return new Equipamiento(this.armaPrincipal);
    }
}