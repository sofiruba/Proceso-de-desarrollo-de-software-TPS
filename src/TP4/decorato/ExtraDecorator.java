package TP4.decorato;

abstract class ExtraDecorator implements Hamburguesa {
    protected Hamburguesa hamburguesa;

    public ExtraDecorator(Hamburguesa hamburguesa) {
        this.hamburguesa = hamburguesa;
    }
}
// Decoradores concretos
class Queso extends ExtraDecorator {
    public Queso(Hamburguesa hamburguesa) {
        super(hamburguesa);
    }

    @Override
    public String getDescripcion() {
        return hamburguesa.getDescripcion() + ", queso";
    }

    @Override
    public double getPrecio() {
        return hamburguesa.getPrecio() + 300.0;
    }
}

class Bacon extends ExtraDecorator {
    public Bacon(Hamburguesa hamburguesa) {
        super(hamburguesa);
    }

    @Override
    public String getDescripcion() {
        return hamburguesa.getDescripcion() + ", bacon";
    }

    @Override
    public double getPrecio() {
        return hamburguesa.getPrecio() + 500.0;
    }
}

class Huevo extends ExtraDecorator {
    public Huevo(Hamburguesa hamburguesa) {
        super(hamburguesa);
    }

    @Override
    public String getDescripcion() {
        return hamburguesa.getDescripcion() + ", huevo";
    }

    @Override
    public double getPrecio() {
        return hamburguesa.getPrecio() + 250.0;
    }
}

class Palta extends ExtraDecorator {
    public Palta(Hamburguesa hamburguesa) {
        super(hamburguesa);
    }

    @Override
    public String getDescripcion() {
        return hamburguesa.getDescripcion() + ", palta";
    }

    @Override
    public double getPrecio() {
        return hamburguesa.getPrecio() + 400.0;
    }
}
