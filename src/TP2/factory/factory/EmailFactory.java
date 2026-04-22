package TP2.factory.factory;

import TP2.factory.Notificacion;
import TP2.factory.modelos.Email;

public class EmailFactory extends NotificacionFactory{
    public Notificacion crearNotificacion() {
        System.out.println("creando notificacion");
        return new Email();
    }
}
