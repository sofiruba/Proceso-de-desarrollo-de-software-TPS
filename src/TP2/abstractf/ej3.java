package TP2.abstractf;

import TP2.abstractf.factory.MacFactory;
import TP2.abstractf.factory.WinFactory;
import TP2.abstractf.productos.boton.BotonMac;
import TP2.abstractf.productos.checkbox.CheckboxWin;

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
