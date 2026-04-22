package TP2.factory.factory;

import TP2.factory.Notificacion;
import TP2.factory.modelos.WSP;

public class WSPFactory extends NotificacionFactory{
    public Notificacion crearNotificacion() {
        System.out.println("creando notificacion");
        return new WSP();
    }
}
