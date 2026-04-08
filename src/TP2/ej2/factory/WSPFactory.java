package TP2.ej2.factory;

import TP2.ej2.Notificacion;

public class WSPFactory extends NotificacionFactory{
    public Notificacion crearNotificacion() {
        System.out.println("creando notificacion");
        return new WSP();
    }
}
