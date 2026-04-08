package TP2.ej3;

import TP2.ej3.factory.MacFactory;
import TP2.ej3.factory.WinFactory;
import TP2.ej3.productos.boton.BotonMac;
import TP2.ej3.productos.checkbox.CheckboxWin;

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
