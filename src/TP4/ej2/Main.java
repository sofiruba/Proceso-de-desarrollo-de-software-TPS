package TP4.ej2;

public class Main {
    public static void main(String[] args) {
        // Catedras
        Catedra c1 = new Catedra("Programación I", 5000);
        Catedra c2 = new Catedra("Bases de Datos", 6000);
        Catedra c3 = new Catedra("Álgebra", 4500);

        // Departamentos
        Departamento deptInformatica = new Departamento("Departamento de Informática");
        Departamento deptBasicas = new Departamento("Departamento de Ciencias Básicas");

        // Facultad
        Departamento facultadIngenieria = new Departamento("Facultad de Ingeniería");

        // Construimoos
        deptInformatica.agregar(c1);
        deptInformatica.agregar(c2);
        deptBasicas.agregar(c3);
        facultadIngenieria.agregar(deptInformatica);
        facultadIngenieria.agregar(deptBasicas);

        facultadIngenieria.mostrarEstructura();

        System.out.println("---------------------------------------");

        // Calculo arbol
        System.out.println("Presupuesto total universidad: " + facultadIngenieria.getPresupuesto() + "$");
    }
}
