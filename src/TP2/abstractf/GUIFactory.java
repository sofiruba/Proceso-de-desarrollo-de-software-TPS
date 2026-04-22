package TP2.abstractf;

import TP2.abstractf.productos.Boton;
import TP2.abstractf.productos.Checkb;

public interface GUIFactory {
    public Boton crearBoton();
    public Checkb crearCheckbox();
}
