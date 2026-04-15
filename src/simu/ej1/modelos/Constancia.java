package simu.ej1.modelos;

public class Constancia implements Documento{
    @Override
    public void generarContenido(){
        System.out.println("Constancia generada");
    };
    @Override
    public void mostrarTipo(){
        System.out.println("Constancia");
    };
}