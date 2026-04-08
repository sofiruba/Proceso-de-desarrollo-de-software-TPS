package TP3.ej1;

import TP3.ej1.SensorCelsius;

class TempAdapter implements SensorCelsius {
    private OldFahrenheitSensor legacySensor;

    public TempAdapter(OldFahrenheitSensor legacySensor) {
        this.legacySensor = legacySensor;
    }

    @Override
    public double leerTemperatura() {

        String xml = legacySensor.obtenerTemperaturaXML();

        // 2. Extraer el valor (esto es un parseo simple para el ejemplo)
        String valorStr = xml.replace("<temp>", "").replace("</temp>", "");
        double fahrenheit = Double.parseDouble(valorStr);

        // 3. Convertir de Fahrenheit a Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        return celsius;
    }
}
