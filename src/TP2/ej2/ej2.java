package TP2.ej2;

import TP2.ej2.factory.SMSFactory;

public class ej2 {
    public static void main(String[] args) {
        Notificacion sms = new SMSFactory().crearNotificacion();
        sms.enviarmensaje("hola");
    }
}
