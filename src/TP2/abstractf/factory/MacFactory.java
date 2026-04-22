package TP2.abstractf.factory;

import TP2.abstractf.GUIFactory;
import TP2.abstractf.productos.Boton;
import TP2.abstractf.productos.Checkb;
import TP2.abstractf.productos.boton.BotonMac;
import TP2.abstractf.productos.checkbox.CheckboxMac;

public class MacFactory implements GUIFactory {
    @Override
    public Boton crearBoton(){
        return new BotonMac();
    }

    @Override
    public Checkb crearCheckbox() {
        return new CheckboxMac();
    }
}
