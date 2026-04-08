package TP2.ej3.factory;

import TP2.ej3.GUIFactory;
import TP2.ej3.productos.Boton;
import TP2.ej3.productos.Checkb;
import TP2.ej3.productos.boton.BotonWin;
import TP2.ej3.productos.checkbox.CheckboxWin;

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
