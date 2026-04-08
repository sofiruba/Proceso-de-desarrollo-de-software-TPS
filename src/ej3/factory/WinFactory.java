package ej3.factory;

import ej3.GUIFactory;
import ej3.productos.Boton;
import ej3.productos.Checkb;
import ej3.productos.boton.BotonMac;
import ej3.productos.boton.BotonWin;
import ej3.productos.checkbox.CheckboxWin;

public class WinFactory implements GUIFactory {
    @Override
    public Boton crearBoton(){
        return new BotonWin();
    }

    @Override
    public Checkb crearCheckbox() {
        return new CheckboxWin();
    }
}
