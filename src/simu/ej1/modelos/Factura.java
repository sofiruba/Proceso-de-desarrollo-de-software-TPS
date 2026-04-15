package simu.ej1.modelos;

public class Factura implements Documento{
    @Override
    public void generarContenido(){
        System.out.println("Factura generada");
    };
    @Override
    public void mostrarTipo(){
        System.out.println("Tipo de Factura");
    };
}
