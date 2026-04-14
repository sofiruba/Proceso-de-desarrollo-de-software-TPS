package TP4.ej2;

public class Catedra implements ComponenteGasto {
    private String nombre;
    private double costo;

    public Catedra(String nombre, double costoProfesor) {
        this.nombre = nombre;
        this.costo = costoProfesor;
    }

    @Override
    public double getPresupuesto() {
        return costo;
    }

    @Override
    public void mostrarEstructura() {
        System.out.println("Catedra: " + nombre + " -- Costo: " + costo + "$");
    }
}
