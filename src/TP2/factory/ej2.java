package TP2.factory;

import TP2.factory.factory.SMSFactory;

public class ej2 {
    public static void main(String[] args) {
        Notificacion sms = new SMSFactory().crearNotificacion();
        sms.enviarmensaje("hola");
    }
}
