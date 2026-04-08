package ej2.modelos;

import ej2.Notificacion;

public class Email implements Notificacion {

    @Override
    public void enviarmensaje(String mensaje) {
        System.out.println("Enviando mensaje: " + mensaje);
    }
}
