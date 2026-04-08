package TP2.ej5;

import java.util.ArrayList;
import java.util.List;

public class ej5 {
    public static void main(String[] args) {
        List<Equipamiento> equipoInicial = new ArrayList<>();
        equipoInicial.add(new Equipamiento("Espada de Hierro"));
        equipoInicial.add(new Equipamiento("Escudo de Madera"));

        Guerrero prototipo = new Guerrero("Recluta", 100, equipoInicial);

        Guerrero g2 = prototipo.clonar();
        g2.nombre = "Paladín Elite";

        g2.listaEquipamiento.get(0).armaPrincipal = "Espada de Diamante";

        System.out.println("--- EQUIPO DEL ORIGINAL (" + prototipo.nombre + ") ---");
        for (Equipamiento e : prototipo.listaEquipamiento) {
            System.out.println("- " + e.armaPrincipal);
        }

        System.out.println("\n--- EQUIPO DEL CLON (" + g2.nombre + ") ---");
        for (Equipamiento e : g2.listaEquipamiento) {
            System.out.println("- " + e.armaPrincipal);
        }
    }
}
