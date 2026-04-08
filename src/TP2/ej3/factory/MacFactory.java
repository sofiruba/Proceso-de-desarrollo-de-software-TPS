package TP2.ej3.factory;

import TP2.ej3.GUIFactory;
import TP2.ej3.productos.Boton;
import TP2.ej3.productos.Checkb;
import TP2.ej3.productos.boton.BotonMac;
import TP2.ej3.productos.checkbox.CheckboxMac;

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
