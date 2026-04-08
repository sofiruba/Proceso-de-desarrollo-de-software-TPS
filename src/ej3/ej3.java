package ej3;

import ej3.factory.MacFactory;
import ej3.factory.WinFactory;
import ej3.productos.boton.BotonMac;
import ej3.productos.checkbox.CheckboxWin;

public class ej3 {
    public static void main(String[] args) {
        MacFactory macFactory = new MacFactory();
        BotonMac bm = (BotonMac) macFactory.crearBoton();
        bm.mostrar();
        WinFactory winFactory = new WinFactory();
        CheckboxWin cw = (CheckboxWin) winFactory.crearCheckbox();
        cw.apretar();
    }
}
