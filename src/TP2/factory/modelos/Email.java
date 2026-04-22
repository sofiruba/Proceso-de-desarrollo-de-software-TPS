package TP2.factory.modelos;

import TP2.factory.Notificacion;

public class Email implements Notificacion {

    @Override
    public void enviarmensaje(String mensaje) {
        System.out.println("Enviando mensaje: " + mensaje);
    }
}
