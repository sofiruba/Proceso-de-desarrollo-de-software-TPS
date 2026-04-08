package ej2.factory;

import ej2.Notificacion;
import ej2.modelos.Email;

public class WSPFactory extends NotificacionFactory{
    public Notificacion crearNotificacion() {
        System.out.println("creando notificacion");
        return new WSP();
    }
}
