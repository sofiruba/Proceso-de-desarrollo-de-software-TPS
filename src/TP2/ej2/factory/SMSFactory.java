package TP2.ej2.factory;

import TP2.ej2.Notificacion;
import TP2.ej2.modelos.SMS;

public class SMSFactory extends NotificacionFactory{
    public Notificacion crearNotificacion() {
        System.out.println("creando notificacion");
        return new SMS();
    }
}
