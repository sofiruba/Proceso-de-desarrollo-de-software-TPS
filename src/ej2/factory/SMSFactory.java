package ej2.factory;

import ej2.Notificacion;
import ej2.modelos.SMS;

public class SMSFactory extends NotificacionFactory{
    public Notificacion crearNotificacion() {
        System.out.println("creando notificacion");
        return new SMS();
    }
}
