package TP3.ej1.profe;

public class MotorAdapater extends Motor {
   MotorElectrico motorElectrico =  new MotorElectrico();
    @Override
    public void arrancar() {
        System.out.println("Motor --> arrancando");
        motorElectrico.Activar();
        System.out.println(".......................");
    }

    @Override
    public void acelerar() {
        System.out.println("Motor --> acelerar");
        motorElectrico.mover();
       motorElectrico.acelerar();
        System.out.println("............................");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando Motor.......");
        motorElectrico.desactivar();
        System.out.println("......................");

    }

    @Override
    public void cargarCombustible() {
        System.out.println("Cargando .......");
        motorElectrico.enchufar();
        System.out.println("....................");
    }
}
