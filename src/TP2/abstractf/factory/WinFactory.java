package TP2.abstractf.factory;

import TP2.abstractf.GUIFactory;
import TP2.abstractf.productos.Boton;
import TP2.abstractf.productos.Checkb;
import TP2.abstractf.productos.boton.BotonWin;
import TP2.abstractf.productos.checkbox.CheckboxWin;

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
