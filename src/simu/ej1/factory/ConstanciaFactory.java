package simu.ej1.factory;


import simu.ej1.modelos.Constancia;
import simu.ej1.modelos.Documento;

public class ConstanciaFactory extends DocumentoFactory {

    public Documento crearDocumento() {
        System.out.println("creando documento");
        return new Constancia();
    }
}
