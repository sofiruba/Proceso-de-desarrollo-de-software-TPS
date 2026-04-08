package ej5;
import java.util.ArrayList;
import java.util.List;

class Guerrero implements Prototipo<Guerrero> {
    public String nombre;
    public int salud;

    public List<Equipamiento> listaEquipamiento;

    public Guerrero(String nombre, int salud, List<Equipamiento> lista) {
        this.nombre = nombre;
        this.salud = salud;
        this.listaEquipamiento = lista;
    }

    @Override
    public Guerrero clonar() {

        List<Equipamiento> listaClonada = new ArrayList<>();

        for (Equipamiento e : this.listaEquipamiento) {
            listaClonada.add(e.clonar());
        }

        return new Guerrero(this.nombre, this.salud, listaClonada); // o this.listaEquipamiento
    }
}