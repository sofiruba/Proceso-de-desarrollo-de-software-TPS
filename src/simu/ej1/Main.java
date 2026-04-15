package simu.ej1;


import simu.ej1.factory.ConstanciaFactory;
import simu.ej1.factory.FacturaFactory;
import simu.ej1.factory.ReciboFactory;
import simu.ej1.modelos.Documento;

public class Main {
    public static void main(String[] args) {
        Documento recibo = new ReciboFactory().crearDocumento();
        Documento constancia = new ConstanciaFactory().crearDocumento();
        Documento factura = new FacturaFactory().crearDocumento();
    }
}
