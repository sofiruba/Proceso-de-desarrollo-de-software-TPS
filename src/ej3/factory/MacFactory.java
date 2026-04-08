package ej3.factory;

import ej3.GUIFactory;
import ej3.productos.Boton;
import ej3.productos.Checkb;
import ej3.productos.boton.BotonMac;
import ej3.productos.checkbox.CheckboxMac;

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
