package simu.ej1.factory;

import simu.ej1.modelos.Documento;
import simu.ej1.modelos.Recibo;

public class ReciboFactory extends DocumentoFactory {

    @Override
    public Documento crearDocumento() {
        System.out.println("creando documento");
        return new Recibo();
    }
}

