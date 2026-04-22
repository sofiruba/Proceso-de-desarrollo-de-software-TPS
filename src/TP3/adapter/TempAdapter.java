package TP3.adapter;

class TempAdapter implements SensorCelsius {
    private OldFahrenheitSensor legacySensor;

    public TempAdapter(OldFahrenheitSensor legacySensor) {
        this.legacySensor = legacySensor;
    }

    @Override
    public double leerTemperatura() {

        String xml = legacySensor.obtenerTemperaturaXML();
        String valorStr = xml.replace("<temp>", "").replace("</temp>", "");
        double fahrenheit = Double.parseDouble(valorStr);
        double celsius = (fahrenheit - 32) * 5 / 9;

        return celsius;
    }
}
