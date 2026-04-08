package TP2.ej2.modelos;

import TP2.ej2.Notificacion;

public class SMS implements Notificacion {

    @Override
    public void enviarmensaje(String mensaje) {
        System.out.println("Enviando mensaje: " + mensaje);
    }
}
