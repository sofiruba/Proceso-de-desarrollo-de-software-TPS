package TP4.composite;

import java.util.ArrayList;
import java.util.List;

public class Departamento implements ComponenteGasto {
    private String nombre;
    private List<ComponenteGasto> elementos;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.elementos = new ArrayList<>();
    }

    public void agregar(ComponenteGasto elemento) {
        elementos.add(elemento);
    }

    @Override
    public double getPresupuesto() {
        double total = 0;
        for (ComponenteGasto e : elementos) {
            total += e.getPresupuesto();
        }
        return total;
    }

    @Override
    public void mostrarEstructura() {
        System.out.println("Nivel: " + nombre);
        for (ComponenteGasto e : elementos) {
            e.mostrarEstructura();
        }
    }
}
