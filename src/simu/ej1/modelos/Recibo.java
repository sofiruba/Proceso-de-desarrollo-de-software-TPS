package simu.ej1.modelos;

public class Recibo implements Documento{
    @Override
    public void generarContenido(){
        System.out.println("Recibo generado");
    };
    @Override
    public void mostrarTipo(){
        System.out.println("Recibo");
    };
}
